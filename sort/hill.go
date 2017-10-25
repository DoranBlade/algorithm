package sort

// 希尔排序
func hillSort(list []int) {
	n := len(list)
	h := 0
	for h <= n {
		h = h * 3 +1
	}
	for h >= 1  {
		for i := h; i < n; i++ {
			j := i - h
			temp := list[i]
			for j >= 0 && list[j] > temp {
				list[j + h] = list[j]
				j = j - h
			}
			list[j + h] = temp
		}
		h = (h - 1) / 3
	}
}
