package sort

// 冒泡排序
func bubbleSort(list []int, sort string) []int {
	length := len(list)
	for i := 0; i < length - 1; i++ {
		for j := 0; j < length - i - 1; j++ {
			var condition bool
			if sort == "asc" {
				condition = list[j] > list[j+1]
			} else {
				condition = list[j] < list[j+1]
			}
			if condition {
				swp(list, j, j + 1)
			}
		}
	}
	return list
}

func swp(list []int, i int, j int) {
	temp := list[i]
	list[i] = list[j]
	list[j] = temp
}