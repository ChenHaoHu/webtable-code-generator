package cmd

import (
	"fmt"
	"generate/webtable"
	"github.com/spf13/cobra"
)

var initCmd = &cobra.Command{
	Use:   "init",
	Short: "根据给定的数据库配置生成yml配置文件",
	Long: `根据给定的数据库配置生成yml配置文件
	DATABASE DESC => YML
	目前只支持Mysql数据库`,
	Run: func(cmd *cobra.Command, args []string) {
		fmt.Println("init called")
		webtable.InitProYML(dbConfig)
	},
}

// var host string
// var username string
// var passwd string
// var port int
// var database string

var dbConfig *webtable.DbConfig

func init() {
	dbConfig = new(webtable.DbConfig)

	//add flags
	initCmd.Flags().IntVarP(&dbConfig.Port, "port", "P", 3306, "数据库端口号")
	initCmd.Flags().StringVarP(&dbConfig.Host, "host", "H", "127.0.0.1", "数据库url")
	initCmd.Flags().StringVarP(&dbConfig.Database, "database", "d", "", "数据库名称")
	initCmd.Flags().StringVarP(&dbConfig.Username, "username", "u", "admin", "username ")
	initCmd.Flags().StringVarP(&dbConfig.Passwd, "passwd", "p", "admin", "password ")

	//add cmd
	initCmd.MarkFlagRequired("database")
	rootCmd.AddCommand(initCmd)
}
