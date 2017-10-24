package sort

import "testing"

func TestSelectSort(t *testing.T) {
	length := 200000
	list := getIntDate(length)
	result := selectSort(list, "asc")
	t.Log(result)
	if  len(result) != length{
		t.Error("result length error")
	}
}

