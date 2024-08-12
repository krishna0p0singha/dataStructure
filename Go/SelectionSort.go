package main

import (
	"fmt"
)

func SelectionSort(arr []int, size int) {
	var i, j int
	for i = 0; i < size-1; i++ {
		var min = i
		for j = i + 1; j < size; j++ {
			if arr[j] < arr[min] {
				min = j
			}
		}
		var temp = arr[i]
		arr[i] = arr[min]
		arr[min] = temp
	}
	fmt.Print(arr)
}

func main() {
	var size, i int
	fmt.Print("Enter Size Of Array => ")
	fmt.Scan(&size)
	arr := make([]int, size)
	for i = 0; i < size; i++ {
		fmt.Scan(&arr[i])
	}
	SelectionSort(arr, size)
}
