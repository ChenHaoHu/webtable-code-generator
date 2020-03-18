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

func CodeGen() {

	pro, err := buildGenValues()
	if err != nil {
		log.Println("err = ", err)
		return
	}
	// log.Printf("%+v", pro)
	t, err := template.ParseFiles("tmpl/webtable_v1.tmpl")
	if err != nil {
		log.Println("err = ", err)
		return
	}

	var f *os.File

	for key, value := range pro.Classes {
		// log.Printf("%+v", value)
		f, err = os.Create("out/" + key + ".java")
		if err != nil {
			log.Println("file create err = ", err)
			continue
		}
		value.SyncCreatedOnTime()
		t.ExecuteTemplate(f, "webtable_v1.tmpl", value)
		f.Close()
		log.Println("finish table < ", key, " > build")
	}

	defer func() {
		f.Close()
	}()

}

func buildGenValues() (*Project, error) {

	// fields := []Field{}
	// fields = append(fields, Field{Type: "String", Name: "AA"})
	// obj := NewClass("top.hcy.webtable.entity", "Data")
	// obj.SetAlias("测试")
	// obj.SetFields(fields)
	pro, err := getYmlData("test.yml")
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
