package Arrays;

import java.util.Scanner;

public class returnArraySum4 {

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + "th index");
            arr[i] = s.nextInt();
        }
        return arr;

    }

    public static int sum(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        return ans;
    }

    public static void main(String args[]) {
        int[] arr = takeInput();
        int Sum = sum(arr);
        System.out.println(Sum);
    }

}
