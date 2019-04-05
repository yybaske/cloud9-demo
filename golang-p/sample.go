package somepkg

var SomeVar int
var SomeVar2 int

type Delete struct {
	ID int
}

func SomeFunc() {
	SomeVar = 10
	SomeVar2 = 5
}

func SomeFunc2() {
	SomeFunc()
}
