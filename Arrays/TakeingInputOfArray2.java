package Arrays;

import java.util.Scanner;

public class TakeingInputOfArray2 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element" + i + "ith index");
            arr[i] = s.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}

// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int[] arr = new int[n];
// for (int i = 0; i < n; i++) {
// System.out.println("Enter element at " + i + "th index");
// arr[i] = s.nextInt();
// }
// for (int i = 0; i < n; i++) {
// System.out.println(arr[i]);
// }
