package webtable

import (
	"time"
)

type Class struct {
	Package       string
	ClassName     string
	Alias         string
	Table         string
	Fields        []Field
	EnableInsert  bool
	EnadbleFind   bool
	EnadbleUpdate bool
	EnadbleSort   bool
	EnadbleDelete bool
	EnadbleChart  bool
	SelectTrigger string
	InsertTrigger string
	UpdateTrigger string
	DeleteTrigger string
	CreatedOn     time.Time
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
