package sort

import "math/rand"

// 生成测试数据
func getIntDate(length int) []int {
	list := []int{}
	for	i := 0; i < length; i++ {
		random := rand.Intn(1000000)
		list = append(list, random)
	}
	return list
}


