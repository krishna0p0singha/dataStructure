package main

import (
	"fmt"
)

func Insertionsort(arr []int) {
	var i, k, j int
	for i = 0; i < len(arr); i++ {
		k = arr[i]
		j = i - 1
		for j >= 0 && arr[j] > k {
			arr[j+1] = arr[j]
			j = j - 1
		}
		arr[j+1] = k
	}
	fmt.Print(arr)
}
func main() {
	var i, j int
	fmt.Print("Enter The Size of Array => ")
	fmt.Scan(&i)
	arr := make([]int, i)
	for j = 0; j < i; j++ {
		fmt.Scan(&arr[j])
	}
	Insertionsort(arr)

}
