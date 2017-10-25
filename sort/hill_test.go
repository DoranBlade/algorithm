package sort

import "testing"

func TestHillSort(t *testing.T) {
	length := 10
	list := getIntDate(length)
	hillSort(list)
	t.Log(list)
}

