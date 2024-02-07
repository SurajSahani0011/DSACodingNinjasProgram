/*
 * Problem statement
You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.

Note:
Given array/list can contain duplicate elements. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
1
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7
Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10
Sample Output 2:
0
2


 Explanation for Input 2:
Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.

For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
 */

/*
 * Initialization:

arr is an array with values {2, 4, 3, 7, 1, 5, 6}.
targetSum is set to 8.
Executing pairSum function:

First iteration (i=0):
Inner loop (j=1 to 6): Check pairs (2, 4), (2, 3), (2, 7), (2, 1), (2, 5), (2, 6).
No pair in the inner loop satisfies the condition arr[i] + arr[j] == x (8).
Second iteration (i=1):
Inner loop (j=2 to 6): Check pairs (4, 3), (4, 7), (4, 1), (4, 5), (4, 6).
Pairs (4, 3) and (4, 1) have a sum equal to the targetSum (8).
Third iteration (i=2):
Inner loop (j=3 to 6): Check pairs (3, 7), (3, 1), (3, 5), (3, 6).
Pair (3, 5) has a sum equal to the targetSum (8).
Fourth iteration (i=3):
Inner loop (j=4 to 6): Check pairs (7, 1), (7, 5), (7, 6).
No pair in the inner loop satisfies the condition.
Fifth iteration (i=4):
Inner loop (j=5 to 6): Check pairs (1, 5), (1, 6).
Pair (1, 7) has a sum equal to the targetSum (8).
Sixth iteration (i=5):
Inner loop (j=6): Check pair (5, 6).
No pair in the inner loop satisfies the condition.
Seventh iteration (i=6):
Inner loop (j does not iterate as i is at the end of the array).
The total number of pairs with a sum equal to the targetSum is 3.
Print Result:

The program prints "Number of pairs with sum 8: 3".
This dry run helps illustrate how the code iterates through the array and counts pairs with a sum equal to the target sum.
 */

package Arrays;

public class PairSum17 {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 7, 1, 5, 6 };
        int targetSum = 8;

        int result = pairSum(arr, targetSum);

        System.out.println("Number of pairs with sum " + targetSum + ": " + result);
    }

    public static int pairSum(int arr[], int x) {
        int numPair = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == x) {
                    numPair += 1;
                }
            }
        }
        return numPair;
    }
}
