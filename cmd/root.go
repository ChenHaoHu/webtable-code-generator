package cmd

import (
  "fmt"
  "github.com/spf13/cobra"
  "os"
)

var rootCmd = &cobra.Command{
  Use:   "generate",
  Short: "generate is a very fast code generator for webtable",
  Long:  `generate is a very fast code generator for webtable`,
  Run: func(cmd *cobra.Command, args []string) {
    fmt.Println("please use child Command. -h your will get more detail")
  },
}

func Execute() {
  if err := rootCmd.Execute(); err != nil {
    fmt.Println(err)
    os.Exit(1)
  }
}
