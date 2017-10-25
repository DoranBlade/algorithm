package sort

// 选择排序
func selectSort(list []int, sort string) []int {
	length := len(list)
	for i := 0; i < length - 1; i++ {
		index := i
		for j := i + 1; j < length; j++ {
			var condition bool
			if sort == "asc" {
				condition = list[j] < list[index]
			} else {
				condition = list[j] > list[index]
			}
			if condition {
				index = j
			}
		}
		if i != index {
			swp(list, i, index)
		}
	}
	return list
}
