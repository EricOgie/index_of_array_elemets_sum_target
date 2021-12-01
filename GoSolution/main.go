package main

import (
	"fmt"
)

// Time and space complexity = O(n)
// Solution tracks visisted items in the array and record thier complement
// i.e (target - arrayItem).
// It later check if the next visisted item has been recorded as a
// compliment. If it has, then the
// Correct pair that sums up to the target is the currentItem and the dif
func findPairIndex(arr []int, sum int) []int {
	seen := make(map[int]int, 0)
	for x := 0; x < len(arr); x++ {
		if _, exists := seen[arr[x]]; exists {
			return []int{seen[arr[x]], x}
		} else {
			// record compliment as seen
			seen[sum-arr[x]] = x
		}
	}
	return []int{0}
}

func main() {
	arr := []int{2, 5, 3, 13, 19, 9, 10}
	target := 14
	fmt.Println(findPairIndex(arr, target))
	// fmt.Println(fmt.Sprintf("%#v", findPairIndex(arr, target)))
}
