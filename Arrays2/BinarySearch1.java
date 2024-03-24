/*
 * Problem statement
You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.



Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. If 'target' is not present in the array 'A', return -1.



Note:

You must write an algorithm whose time complexity is O(LogN)


Example:


Input: ‘N’ = 7 ‘target’ = 3
‘A’ = [1, 3, 7, 9, 11, 12, 45]

Output: 1

Explanation: A = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^5
1 <= A[i] <= 10^9
1 <= target <= 10^9
Time Limit: 1 sec
Sample Input 1:
7
1 3 7 9 11 12 45
3
Sample Output 1:
1
Explanation of sample output 1:
nums = [1, 3, 7, 9, 11, 12, 45],
The index of element '3' is 1.
Hence, the answer is '1'.


Sample Input 2:
7
1 2 3 4 5 6 7
9
Sample Output 2:
-1
Explanation of sample output 2:
nums = [1, 2, 3, 4, 5, 6, 7],
Element '9' doesn't exist.
Hence, the answer is '-1'.
 */
package Arrays2;

public class BinarySearch1 {

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 12 };
        int target = 8;

        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int search(int[] nums, int target) {

        int n = nums.length;
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return -1;

    }
}

/*
 * Sure, let's perform a dry run of the provided code with the given input array
 * `nums = {2, 4, 6, 8, 10, 12}` and the target element `target = 8`.
 * 
 * 1. Initialization:
 * - `nums` = {2, 4, 6, 8, 10, 12}
 * - `target` = 8
 * - `n` = 6 (length of `nums`)
 * - `s` = 0
 * - `e` = 5
 * 
 * 2. First Iteration:
 * - `s` is less than or equal to `e`, so we enter the loop.
 * - Calculate `mid = (0 + 5) >> 1 = 2`.
 * - Check `nums[2]` which is 6. Since 6 is less than 8, we update `s = mid + 1
 * = 3`.
 * 
 * 3. Second Iteration:
 * - `s` is still less than or equal to `e`.
 * - Calculate `mid = (3 + 5) >> 1 = 4`.
 * - Check `nums[4]` which is 10. Since 10 is greater than 8, we update `e = mid
 * - 1 = 3`.
 * 
 * 4. Third Iteration:
 * - `s` is still less than or equal to `e`.
 * - Calculate `mid = (3 + 3) >> 1 = 3`.
 * - Check `nums[3]` which is 8. We found the target element.
 * - Return `mid = 3`.
 * 
 * The target element 8 is found at index 3.
 * 
 * So, the output of the program would be:
 * ```
 * Element found at index: 3
 * ```
 * 
 */

/*
 * int n = nums.length;
 * 
 * // 's' and 'e'
 * int s = 0, e = n - 1;
 * while (s <= e) {
 * // int mid = (s + e) >> 1;
 * int mid = (s + e) / 2;
 * 
 * if (nums[mid] == target) {
 * return mid;
 * }
 * 
 * else if (nums[mid] > target) {
 * e = mid - 1;
 * }
 * 
 * else {
 * s = mid + 1;
 * }
 * }
 * 
 * return -1;
 * }
 */