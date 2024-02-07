package Arrays;

// import java.util.Scanner;

// public class LinearSearch6 {

// public static void PrintArray(int[] arr) {
// int n = arr.length;
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[n]);
// }
// }

// public static int[] takeInput() {
// Scanner s = new Scanner(System.in);
// int n = s.nextInt();
// int arr[] = new int[n];
// for (int i = 0; i < n; i++) {
// System.out.println("Enter element at" + i + "th index");
// arr[i] = s.nextInt();
// }
// }

// public static int linearSearch(int arr[], int val) {
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == val) {
// return i;
// }
// }
// return -1;
// }

// public static void main(String[] args) {
// int[] arr = takeInput();
// int k = linearSearch(arr, 0);
// System.out.println(k);

// }

// }

import java.util.Scanner;

public class LinearSearch6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the value to search
        System.out.print("Enter the value to search: ");
        int val = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(arr, val);

        // Display the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }

    public static int linearSearch(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }

        }
        return -1;
    }
}
