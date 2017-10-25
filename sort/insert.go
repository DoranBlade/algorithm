package sort

// 插入排序
func insertSort(list []int, sort string) {
	length := len(list)
	for i := 1; i < length; i++ {
		j := i
		for j > 0 && check(list, j, sort){
			swp(list, j, j - 1)
			j--
		}
	}
}

func check(list []int, index int, sort string) bool {
	if sort == "asc" {
		return list[index] < list[index - 1]
	} else {
		return list[index] > list[index - 1]
	}
}