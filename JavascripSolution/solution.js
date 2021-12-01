// Time and space complexity = O(n)
// Solution tracks visisted items in the array and record thier complement
// i.e (target - arrayItem). 
// It later check if the next visisted item has been recorded as a
// compliment. If it has, then the
// Correct pair that sums up to the target is the currentItem and the diff
function findPairIndeces(arr, sum){
    const seen = new Map
    for (let x = 0; x < arr.length; x++) { 
        if (seen.has(arr[x])) {
            return [seen.get(arr[x]), x]
        }
        seen.set(sum - arr[x], x)       
    }
    console.log(seen)
    return "found None"
}

let arr = [2, 5, 3, 13, 19, 9, 10];
let target = 14;
console.log(findPairIndeces(arr, target))
