package webtable

import (
	"strings"
)

type Field struct {
	Type                               string
	Name                               string
	Alias                              string
	Column                             string
	EnableRead                         bool
	EnableInsert                       bool
	EnableUpdate                       bool
	EnableFind                         bool
	EnableSort                         bool
	EnableConvertToShowFunction        bool
	EnableConvertToPersistenceFunction bool
}

func NewFiled() *Field {
	return &Field{}
}

func dbFieldTypeConv(dbType string) string {
	//转换一些常见的类型
	dbType = strings.ToUpper(dbType)
	var res string
	switch {
	case strings.Contains(dbType, "VARCHR"):
		res = "String"
	case strings.Contains(dbType, "FLOAT"):
		res = "float"
	case strings.Contains(dbType, "DOUBLE"):
		res = "double"
	case strings.Contains(dbType, "INT"):
		res = "int"
	default:
		res = "String"
	}
	return res
}

func dbFieldAliasConv(fieldName string) string {
	var res string
	res = fieldName
	return res
}

func dbFieldNameConv(fieldName string) string {
	var res string
	var num int
	num = strings.IndexByte(fieldName, '_')
	for ; num != -1; num = strings.IndexByte(fieldName, '_') {
		ch := fieldName[num+1]
		fieldName = strings.Replace(fieldName, "_"+string(ch), strings.ToUpper(string(ch)), -1)
	}
	res = fieldName
	return res
}

func syncDefaultField(field *Field) {
	field.EnableRead = true
	field.EnableInsert = false
	field.EnableUpdate = false
	field.EnableFind = false
	field.EnableSort = false
	field.EnableConvertToShowFunction = true
	field.EnableConvertToPersistenceFunction = true
}
