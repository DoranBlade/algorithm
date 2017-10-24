package sort

// 冒泡排序
func bubbleSort(list []int, sort string) []int {
	// 临时交换数据
	temp, length := 0, len(list)
	for i := 0; i < length; i++ {
		for j := 0; j < length - i - 1; j++ {
			if list[j] > list[j+1] {
				temp = list[j]
				list[j] = list[j + 1]
				list[j + 1] = temp
			}
		}
	}
	return list
}