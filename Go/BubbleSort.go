package main

import (
	"fmt"
)

func BubbleSort(arr []int) {
	var i, j, temp int
	for i = 0; i < len(arr)-1; i++ {
		for j = 0; j < len(arr)-i-1; j++ {
			if arr[j] > arr[j+1] {
				temp = arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = temp
			}
		}
	}
	fmt.Print(arr)
}
func main() {
	var i, j int
	fmt.Print("Enter Size Of array => ")
	fmt.Scan(&i)
	arr := make([]int, i)
	for j = 0; j < i; j++ {
		fmt.Scan(&arr[j])
	}
	BubbleSort(arr)

}
