package webtable

type Field struct {
	Type   string
	Name   string
	Alias  string
	Column string
}

func NewFiled() *Field {
	return &Field{}
}
