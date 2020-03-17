package webtable

import (
	"log"
	"os"
	"text/template"
)

func CodeGen() {

	obj, _ := buildGenValues()
	log.Printf("%+v", obj)
	t, _ := template.ParseFiles("tmpl/webtable_v1.tmpl")
	t.ExecuteTemplate(os.Stdout, "webtable_v1.tmpl", obj)

}

func buildGenValues() (interface{}, error) {

	fields := []Field{}
	fields = append(fields, Field{Type: "String", Name: "AA"})
	obj := NewClass("top.hcy.webtable.entity", "Data")
	obj.SetAlias("测试")
	obj.SetFields(fields)
	return obj, nil

}
