package webtable

import (
	"database/sql"
	_ "github.com/go-sql-driver/mysql"
	"log"
	"strconv"
)

var dbConfig *DbConfig
var db *sql.DB

type TableDesc struct {
	Field   string
	Type    string
	Null    string
	Key     string
	Default string
	Extra   string
}

func InitProYML(dbData *DbConfig) {
	dbConfig = dbData
	db = linkDB()
	handleTables()
	defer db.Close()
}

func linkDB() *sql.DB {
	// go run  .\main.go  init  -d "wdb" -p "wdbadmin"
	uri := dbConfig.Username + ":" + dbConfig.Passwd +
		"@tcp(" + dbConfig.Host + ":" + strconv.Itoa(dbConfig.Port) + ")/" + dbConfig.Database
	log.Println("++ db uri:", uri)
	db, err := sql.Open("mysql", uri)
	if err != nil {
		panic("open database fail")
	}
	//链接数据库
	err = db.Ping()
	if err != nil {
		panic("connect database fail")
	}
	return db
}

func handleTable(table string) {
	getTableDESC(table)

}

func getTableDESC(table string) []TableDesc {
	tablesDesc := []TableDesc{}
	res, _ := db.Query("DESC " + table)
	for res.Next() {
		desc := new(TableDesc)
		res.Scan(&desc.Field, &desc.Type, &desc.Null, &desc.Key, &desc.Default, &desc.Extra)
		tablesDesc = append(tablesDesc, *desc)
	}
	log.Printf("%+v", tablesDesc)
	return tablesDesc
}

func handleTables() {
	//获取表个数
	res, _ := db.Query("SHOW TABLES")
	p := make(chan int)
	len := 0

	var table string
	for res.Next() {
		res.Scan(&table)
		go func(table string) {
			log.Println("-- START handle table ", table)
			handleTable(table)
			log.Println("-- END   handle table ", table)
			p <- 0
		}(table)
		len++
	}

	for i := 0; i < len; i++ {
		<-p
	}

	defer close(p)
	log.Println("-- ALL   tables finished ")
}
