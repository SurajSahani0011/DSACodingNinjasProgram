package Arrays;

public class SwapAtternate13 {

    public static void main(String[] args) {
        // Example usage:
        // int[] arrayToSwap = { 1, 2, 3, 4, 5 };//odd aray
        int[] arrayToSwap = { 1, 2, 3, 4, 5, 6 };// even array

        System.out.println("Original Array: " + java.util.Arrays.toString(arrayToSwap));

        // Call the swapAlternate method
        swapAlternate(arrayToSwap);

        System.out.println("Array after swapping alternates: " + java.util.Arrays.toString(arrayToSwap));
    }

    public static void swapAlternate(int arr[]) {
        for (int i = 0; i < (arr.length - 1); i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

    }
}
