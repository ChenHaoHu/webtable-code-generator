package cmd

import (
	"generate/webtable"
	"github.com/spf13/cobra"
)

// buildCmd represents the build command
var buildCmd = &cobra.Command{
	Use:   "build",
	Short: "根据yml文件生成对应的实体类",
	Long: `根据yml文件生成对应的实体类
	.YML => .Java
	yml文件 建议使用 init 命令生成yml模板 `,
	Run: func(cmd *cobra.Command, args []string) {
		webtable.CodeGen(in, out)
	},
}

var in string
var out string

func init() {
	//add flags
	buildCmd.Flags().StringVarP(&in, "yml", "y", "project.yml", "yml 文件名")
	buildCmd.Flags().StringVarP(&out, "out", "o", "out/", "输出目录")
	rootCmd.AddCommand(buildCmd)
}
