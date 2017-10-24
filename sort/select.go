package sort

// 选择排序
func selectSort(list []int, sort string) []int {
	maxVal, maxIndex, length := 0, 0, len(list)
	for i := 0; i < length; i++ {
		for j := 0; j < length-i; j++ {
			if list[j] > maxVal {
				maxIndex = j
				maxVal = list[j]
			}
		}
		temp := list[length - i - 1]
		list[length - i - 1] = maxVal
		list[maxIndex] = temp
		maxIndex = 0
		maxVal = 0
	}
	return list
}
