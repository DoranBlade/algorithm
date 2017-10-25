package sort

import "testing"

func TestInsertSort(t *testing.T) {
	length := 20000
	list := getIntDate(length)
	insertSort(list, "desc")
	t.Log(list)
	if len(list) != length {
		t.Error("result length error")
	}
}

