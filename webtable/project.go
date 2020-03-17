package webtable

type Project struct {
	Project  string
	Desc     string
	Classes  map[string]Class
	Dbconfig DbConfig
}
