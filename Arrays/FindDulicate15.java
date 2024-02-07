/*
 * Problem statement
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

Note :
Duplicate number is always present in the given array/list.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
2
5
0 2 1 3 1
7
0 3 1 5 4 3 2
Sample Output 2:
1
3
 */

/*
 * Let's use the example input array: {2, 5, 8, 3, 2, 7, 1}.

First Iteration (i=0):

Compare arr[0] (2) with arr[1] to arr[6] (5, 8, 3, 2, 7, 1).
No duplicate found in this iteration.
Second Iteration (i=1):

Compare arr[1] (5) with arr[2] to arr[6] (8, 3, 2, 7, 1).
No duplicate found in this iteration.
Third Iteration (i=2):

Compare arr[2] (8) with arr[3] to arr[6] (3, 2, 7, 1).
No duplicate found in this iteration.
Fourth Iteration (i=3):

Compare arr[3] (3) with arr[4] to arr[6] (2, 7, 1).
No duplicate found in this iteration.
Fifth Iteration (i=4):

Compare arr[4] (2) with arr[5] to arr[6] (7, 1).
Duplicate found! Return the duplicate number, which is 2.
So, the output of the duplicateNumber method with the given input array {2, 5, 8, 3, 2, 7, 1} would be 2, as it is the first duplicate encountered during the iterations.
 
 
 */

package Arrays;

public class FindDulicate15 {

    public static void main(String[] args) {
        // Example input array with a duplicate number
        int[] inputArrayWithDuplicate = { 2, 5, 8, 3, 2, 7, 1 };

        // Call the method and print the result
        int result = duplicateNumber(inputArrayWithDuplicate);
        System.out.println("Duplicate Number: " + result);
    }

    public static int duplicateNumber(int arr[]) {
        for (int i = 0; i < (arr.length - 1); ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return Integer.MAX_VALUE;
    }

}
