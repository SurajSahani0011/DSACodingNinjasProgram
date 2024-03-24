/*
Sure, let's dry run the given selection sort code with a sample array.

Consider the input array: [64, 25, 12, 22, 11].

First Iteration (i = 0):

Inner loop scans from index 0 to 4:
Finds the minimum element in the array (11 at index 4).
Swaps the minimum element with the first element.
Array after the first iteration: [11, 25, 12, 22, 64].
Second Iteration (i = 1):

Inner loop scans from index 1 to 4:
Finds the minimum element in the sub-array (12 at index 2).
Swaps the minimum element with the second element.
Array after the second iteration: [11, 12, 25, 22, 64].
Third Iteration (i = 2):

Inner loop scans from index 2 to 4:
Finds the minimum element in the sub-array (22 at index 3).
Swaps the minimum element with the third element.
Array after the third iteration: [11, 12, 22, 25, 64].
Fourth Iteration (i = 3):

Inner loop scans from index 3 to 4:
Finds the minimum element in the sub-array (25 at index 3).
Swaps the minimum element with the fourth element.
Array after the fourth iteration: [11, 12, 22, 25, 64].
Fifth Iteration (i = 4):

Inner loop scans from index 4 to 4:
Only one element left, so no need to scan.
Array remains the same.
The array is now sorted in ascending order: [11, 12, 22, 25, 64]. */

package Arrays2;

public class SelectionSort2 {

    public static void printArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void slectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // Insert element at ith position
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = i; j < n; j++) {

                // Finding the minimum element among i position
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // Swap element at minIndex with the ith element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 4, 8, 0, 3 };
        slectionSort(arr);
        printArray(arr);
    }

}
