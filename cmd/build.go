package cmd

import (
	"fmt"
	"generate/webtable"
	"github.com/spf13/cobra"
)

// buildCmd represents the build command
var buildCmd = &cobra.Command{
	Use:   "build",
	Short: "A brief description of your command",
	Long: `A longer description that spans multiple lines and likely contains examples
and usage of using your command. For example:

Cobra is a CLI library for Go that empowers applications.
This application is a tool to generate the needed files
to quickly create a Cobra application.`,
	Run: func(cmd *cobra.Command, args []string) {
		webtable.CodeGen()
		fmt.Println("build finish")
	},
}

var project string
var out string

func init() {

	//add flags
	buildCmd.Flags().StringVarP(&project, "project", "p", "project.yml", "project is required")
	buildCmd.Flags().StringVarP(&out, "out", "o", ".", "host is required")
	rootCmd.AddCommand(buildCmd)
}
