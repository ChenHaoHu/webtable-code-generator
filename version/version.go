package version

import (
	"fmt"
)

const VERSION = "0.0.1"

func ShowVersion() {
	fmt.Println(" version : ", VERSION)
}

func GetVersions() string {
	return VERSION
}
