package sort

import "testing"

func TestSelectSort(t *testing.T) {
	length := 20000
	list := getIntDate(length)
	selectSort(list, "desc")
	t.Log(list)
	if  len(list) != length{
		t.Error("result length error")
	}
}

