package webtable

type Class struct {
	PackageName   string
	ClassName     string
	AliasName     string
	TableName     string
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
}

func NewClass(PackageName string, ClassName string) *Class {
	return &Class{
		PackageName: PackageName,
		ClassName:   ClassName,
		AliasName:   ClassName,
		TableName:   ClassName,
	}
}

func (c *Class) SetAlias(AliasName string) {
	c.AliasName = AliasName
}

func (c *Class) SetFields(Fields []Field) {
	c.Fields = Fields
}
