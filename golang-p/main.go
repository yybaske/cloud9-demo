package main

import "somepkg"

import (
	"fmt"
)

func main() {
	var num1 int
	var num2 int

	num1 = 5
	num2 = 7
	var r int

	r = somepkg.SomeFunc()
	fmt.Println(r)
}
