package webtable

import (
	"strings"
	"time"
)

type Class struct {
	Package              string
	ClassName            string
	Alias                string
	Table                string
	EnableInsert         bool
	EnadbleFind          bool
	EnadbleUpdate        bool
	EnadbleSort          bool
	EnadbleDelete        bool
	EnadbleChart         bool
	EnadbleSelectTrigger bool
	EnadbleInsertTrigger bool
	EnadbleUpdateTrigger bool
	EnadbleDeleteTrigger bool
	EnadbleChartDemo     bool
	Fields               []Field
	CreatedOn            time.Time
}

func NewClass(PackageName string, ClassName string) *Class {
	return &Class{
		Package:   PackageName,
		ClassName: ClassName,
		Alias:     ClassName,
		Table:     ClassName,
	}
}

func (c *Class) SetAlias(AliasName string) {
	c.Alias = AliasName
}

func (c *Class) SetFields(Fields []Field) {
	c.Fields = Fields
}

func (c *Class) SyncCreatedOnTime() {
	c.CreatedOn = time.Now()
}

func syncDefaultClass(c *Class) {
	c.EnableInsert = false
	c.EnadbleFind = false
	c.EnadbleUpdate = false
	c.EnadbleSort = false
	c.EnadbleDelete = false
	c.EnadbleChart = false
	c.EnadbleSelectTrigger = true
	c.EnadbleInsertTrigger = false
	c.EnadbleUpdateTrigger = false
	c.EnadbleDeleteTrigger = false
	c.EnadbleChartDemo = true
}

func dbTableNameConv(tableName string) string {
	var res string
	var num int
	num = strings.IndexByte(tableName, '_')
	for ; num != -1; num = strings.IndexByte(tableName, '_') {
		ch := tableName[num+1]
		tableName = strings.Replace(tableName, "_"+string(ch), strings.ToUpper(string(ch)), -1)
	}
	//首字母大写
	tableName = strings.Replace(tableName, string(tableName[0]), strings.ToUpper(string(tableName[0])), 1)
	res = tableName
	return res
}
