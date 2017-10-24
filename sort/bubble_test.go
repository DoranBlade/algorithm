package sort

import "testing"

func TestBubbleSort(t *testing.T) {
	length := 20000
	list := getIntDate(length)
	result := bubbleSort(list, "asc")
	t.Log(result)
	if len(result) != length {
		t.Error("result length error")
	}
	if result[0] > result[1] {
		t.Error("result not sort")
	}
}
