package webtable

import (
	yaml "gopkg.in/yaml.v2"
	// "io"
	"io/ioutil"
	"log"
	"os"
	// "os"
	"text/template"
)

var TEMPL string = "tmpl/webtable_v1.tmpl"
var TEMP_NAME string = "webtable_v1.tmpl"

var templObj *template.Template

func CodeGen(in, out string) {

	pro, err := buildGenValues(in)
	if err != nil {
		log.Println("err = ", err)
		return
	}
	// log.Printf("%+v", pro)
	templObj, err = template.ParseFiles(TEMPL)
	if err != nil {
		log.Println("err = ", err)
		return
	}

	p := make(chan int)
	len := 0
	for key, value := range pro.Classes {
		go createJavaFile(key, value, out, p)
		len++
	}

	for i := 0; i < len; i++ {
		<-p
	}

	defer close(p)
}

func createJavaFile(key string, value Class, out string, p chan int) {
	f, err := os.Create(out + value.ClassName + ".java")
	if err != nil {
		log.Println("file create err = ", err)
		return
	}
	value.SyncCreatedOnTime()
	templObj.ExecuteTemplate(f, TEMP_NAME, value)
	log.Println("finish table < ", key, " > build")

	defer func() {
		f.Close()
		p <- 0
	}()
}

func buildGenValues(ymlPath string) (*Project, error) {

	// fields := []Field{}
	// fields = append(fields, Field{Type: "String", Name: "AA"})
	// obj := NewClass("top.hcy.webtable.entity", "Data")
	// obj.SetAlias("测试")
	// obj.SetFields(fields)
	pro, err := getYmlData(ymlPath)
	if err != nil {
		return nil, err
	}
	return pro, nil
}

func getYmlData(filename string) (*Project, error) {
	f, err := ioutil.ReadFile(filename)
	if err != nil {
		return nil, err
	}
	pro := new(Project)
	err = yaml.Unmarshal(f, pro)
	return pro, err
}

func Test() {
	pro, _ := getYmlData("project.yml")
	log.Println(pro)
}
