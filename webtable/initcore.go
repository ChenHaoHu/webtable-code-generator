package webtable

import (
	"database/sql"
	"fmt"
	_ "github.com/go-sql-driver/mysql"
	yaml "gopkg.in/yaml.v2"
	"log"
	"os"
	"strconv"
)

var dbConfig *DbConfig
var db *sql.DB

var globalPackage string
var projectName string
var projectDesc string
var notice string = `
# this yml file is made by generate ` + VERSION + ` for building entity java file.
# U also  should check and edit it,Have a good time!
`

type DBFieldDesc struct {
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
	hanleInput()
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

func handleTable(table string) *Class {
	dbTablesDesc := getTableDESC(table)
	class := new(Class)
	fields := []Field{}
	for _, fieldDesc := range dbTablesDesc {
		field := new(Field)
		field.Name = dbFieldNameConv(fieldDesc.Field)
		field.Type = dbFieldTypeConv(fieldDesc.Type)
		field.Alias = dbFieldAliasConv(fieldDesc.Field)
		field.Column = fieldDesc.Field
		fields = append(fields, *field)
	}
	class.Package = globalPackage
	class.ClassName = table
	class.Alias = table
	class.Table = table
	class.Fields = fields
	return class
}

func getTableDESC(table string) []DBFieldDesc {
	tableDesc := []DBFieldDesc{}
	res, _ := db.Query("DESC " + table)
	for res.Next() {
		desc := new(DBFieldDesc)
		res.Scan(&desc.Field, &desc.Type, &desc.Null, &desc.Key, &desc.Default, &desc.Extra)
		tableDesc = append(tableDesc, *desc)
	}
	// log.Printf("%+v", tablesDesc)
	return tableDesc
}

func handleTables() {
	//获取表个数
	res, _ := db.Query("SHOW TABLES")
	p := make(chan int)
	len := 0
	classes := map[string]Class{}
	var table string
	for res.Next() {
		res.Scan(&table)
		go func(table string) {
			log.Println("-- START handle table ", table)
			class := handleTable(table)
			//classes = append(classes, *class)
			classes[table] = *class
			log.Println("++ END   handle table ", table)
			p <- 0
		}(table)
		len++
	}

	for i := 0; i < len; i++ {
		<-p
	}
	//log.Printf("%+v", classes)

	pro := &Project{}
	pro.Project = projectName
	pro.Desc = projectDesc
	pro.Classes = classes
	pro.Dbconfig = *dbConfig

	outYAML("test.yml", pro)

	defer close(p)

	log.Println("-- ALL   tables finished ")
}

func outYAML(filename string, pro *Project) {

	d, err := yaml.Marshal(&pro)
	if err != nil {
		log.Fatalf("error: %v", err)
	}

	file, _ := os.Create(filename)
	outStr := addHeadNotice(string(d))
	file.WriteString(outStr)
	defer file.Close()
}

func hanleInput() {
	var ch byte
	fmt.Print("please input the project name: ")
	fmt.Scanf("%s", &projectName)
	fmt.Scanf("%c", &ch)
	fmt.Print("please input the project desc: ")
	fmt.Scanf("%s", &projectDesc)
	fmt.Scanf("%c", &ch)
	fmt.Print("please input the java package: ")
	fmt.Scanf("%s", &globalPackage)
}

func addHeadNotice(body string) string {

	str := notice + "\n" + body

	return str
}
