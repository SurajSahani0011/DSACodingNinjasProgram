/*
 * Problem statement
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0
Sample Output 2:
0 0 0 1 1 1 1 1
0 0 0 1 1 
 */

/*
 * Initialization:

arr is an array with values {0, 1, 0, 1, 1, 0, 1, 0}.
Executing SortZeroOne function:

First iteration (i=0):
arr[0] is 0, so swap arr[0] with arr[nextZero] (both are 0), and nextZero becomes 1.
Updated array: {0, 1, 0, 1, 1, 0, 1, 0}.
Second iteration (i=1):
arr[1] is 1 (no swap needed).
Array remains the same: {0, 1, 0, 1, 1, 0, 1, 0}.
Third iteration (i=2):
arr[2] is 0, so swap arr[2] with arr[nextZero] (nextZero is 1), and nextZero becomes 2.
Updated array: {0, 0, 1, 1, 1, 0, 1, 0}.
Fourth iteration (i=3):
arr[3] is 1 (no swap needed).
Array remains the same: {0, 0, 1, 1, 1, 0, 1, 0}.
Fifth iteration (i=4):
arr[4] is 1 (no swap needed).
Array remains the same: {0, 0, 1, 1, 1, 0, 1, 0}.
Sixth iteration (i=5):
arr[5] is 0, so swap arr[5] with arr[nextZero] (nextZero is 2), and nextZero becomes 3.
Updated array: {0, 0, 0, 1, 1, 1, 1, 0}.
Seventh iteration (i=6):
arr[6] is 1 (no swap needed).
Array remains the same: {0, 0, 0, 1, 1, 1, 1, 0}.
Eighth iteration (i=7):
arr[7] is 0, so swap arr[7] with arr[nextZero] (nextZero is 3), and nextZero becomes 4.
Updated array: {0, 0, 0, 0, 1, 1, 1, 1}.
Print Result:

The program prints the original array, then applies the SortZeroOne function, and finally prints the sorted array with 0s and 1s: {0, 0, 0, 0, 1, 1, 1, 1}.
 */
package Arrays;

public class SortZeroOne19 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0, 1, 0 };

        System.out.println("Original array:");
        printArray(arr);

        SortZeroOne(arr);

        System.out.println("\nSorted array with 0s and 1s:");
        printArray(arr);
    }

    public static void SortZeroOne(int arr[]) {
        int nextZero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero += 1;
            }
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
