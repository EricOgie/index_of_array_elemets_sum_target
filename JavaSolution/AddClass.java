package JavaSolution;

import java.util.Arrays;
import java.util.HashMap;

public class AddClass {
    // Time and space complexity = O(n)
    // Solution tracks visisted items in the array and record thier complement
    // i.e (target - arrayItem). the difference between a visited item and the
    // target is recored.
    // It later check if the next visisted item has been recorded as a
    // compliment. If it has, then the
    // Correct pair that sums up to the target is the currentItem and the diff
    // between that item and the target.
    private static int[] findIndex(int[] arr, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int x = 0; x < arr.length; x++) {
            if (!seen.containsKey(arr[x])) {
                seen.put((target - arr[x]), x);
            } else {
                return new int[] { seen.get(arr[x]), x };
            }

        }

        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 19, 7, 11, 15 };
        int target = 18;

        System.out.println(Arrays.toString(findIndex(nums, target)));

    }
}
