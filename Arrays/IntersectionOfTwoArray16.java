/*
 * Problem statement
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1 sec 
Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Sample Output 1 :
2 4 3
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
2 1 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.
 */

/*
 * Dry runIteration 1 (i=0, j=0):

Compare arr1[0] (1) with arr2[0] (2): No match.
Compare arr1[0] with arr2[1] (3): No match.
Compare arr1[0] with arr2[2] (5): No match.
Compare arr1[0] with arr2[3] (7): No match.
Compare arr1[0] with arr2[4] (8): No match.
Iteration 2 (i=1, j=0):

Compare arr1[1] (2) with arr2[0] (2): Match found! Print 2 and mark arr2[0] as Integer.MIN_VALUE.
Iteration 3 (i=2, j=0):

Compare arr1[2] (4) with arr2[0] (Integer.MIN_VALUE): No match (because arr2[0] is marked).
Iteration 4 (i=3, j=0):

Compare arr1[3] (5) with arr2[0] (Integer.MIN_VALUE): No match.
Iteration 5 (i=4, j=0):

Compare arr1[4] (6) with arr2[0] (Integer.MIN_VALUE): No match.
As a result, the common elements between array1 and array2 are printed, and the output would be:

Copy code
2
Note: The code marks elements in arr2 as Integer.MIN_VALUE once they are found to avoid duplicates in the output. Also, this code modifies arr2 during the process.
 */

package Arrays;

public class IntersectionOfTwoArray16 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 4, 5, 6 };
        int[] array2 = { 2, 3, 5, 7, 8 };

        System.out.println("Common elements: ");
        intersection(array1, array2);
    }

    public static void intersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
