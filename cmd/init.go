package cmd

import (
	"fmt"
	"generate/webtable"
	"github.com/spf13/cobra"
)

var initCmd = &cobra.Command{
	Use:   "init",
	Short: "A brief description of your command",
	Long: `A longer description that spans multiple lines and likely contains examples
and usage of using your command. For example:

Cobra is a CLI library for Go that empowers applications.
This application is a tool to generate the needed files
to quickly create a Cobra application.`,
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
	initCmd.Flags().IntVarP(&dbConfig.Port, "port", "P", 3306, "port is required")
	initCmd.Flags().StringVarP(&dbConfig.Host, "host", "H", "127.0.0.1", "host is required")
	initCmd.Flags().StringVarP(&dbConfig.Database, "database", "d", "", "database is required")
	initCmd.Flags().StringVarP(&dbConfig.Username, "username", "u", "admin", "username is required")
	initCmd.Flags().StringVarP(&dbConfig.Passwd, "passwd", "p", "admin", "password is required")

	//add cmd
	initCmd.MarkFlagRequired("database")
	rootCmd.AddCommand(initCmd)
}
