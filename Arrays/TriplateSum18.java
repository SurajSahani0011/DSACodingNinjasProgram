/*
 * Problem statement
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.

Note :
Given array/list can contain duplicate elements.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 50
0 <= N <= 10^2
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
 */

/*
 * Initialization:

arr is an array with values {1, 4, 7, 10, 6, 8, 2}.
targetSum is set to 21.
Executing findTriplet function:

First iteration (i=0):
Inner loop (j=1 to 6): Check triplets (1, 4, 7), (1, 4, 10), (1, 4, 6), (1, 4, 8), (1, 4, 2).
No triplet in the inner loop satisfies the condition arr[i] + arr[j] + arr[k] == x (21).
Second iteration (i=1):
Inner loop (j=2 to 6): Check triplets (4, 7, 10), (4, 7, 6), (4, 7, 8), (4, 7, 2), (4, 10, 6), (4, 10, 8), (4, 10, 2), (4, 6, 8), (4, 6, 2), (4, 8, 2).
Triplet (4, 7, 10) has a sum equal to the targetSum (21).
Third iteration (i=2):
Inner loop (j=3 to 6): Check triplets (7, 10, 6), (7, 10, 8), (7, 10, 2), (7, 6, 8), (7, 6, 2), (7, 8, 2), (10, 6, 8), (10, 6, 2), (10, 8, 2), (6, 8, 2).
Triplet (7, 10, 4) has a sum equal to the targetSum (21).
The total number of triplets with a sum equal to the targetSum is 2.
Print Result:

The program prints "Number of triplets with sum 21: 2".
This dry run helps illustrate how the code iterates through the array and counts triplets with a sum equal to the target sum.
 */
package Arrays;

public class TriplateSum18 {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 10, 6, 8, 2 };
        int targetSum = 21;

        int result = findTriplet(arr, targetSum);

        System.out.println("Number of triplets with sum " + targetSum + ": " + result);
    }

    public static int findTriplet(int[] arr, int x) {
        // Your code goes here
        int trplateSun = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == x) {
                        trplateSun += 1;
                    }
                }

            }

        }
        return trplateSun;
    }

}
