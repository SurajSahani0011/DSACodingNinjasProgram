package Arrays;

public class ArangeNumberInArray7 {

    // public static void printFun(int[] arr, int n) {
    // n = arr.length;
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(n);
    // }
    // }

    // public static int[] TakeInput() {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int arr[] = new int[n];

    // for (int i = 0; i < n; i++) {
    // System.out.println("Enter element at " + i + "th index");
    // arr[i] = sc.nextInt();
    // }
    // return arr;
    // }

    // public static void arrange(int[] arr, int n) {
    // int left = 0;
    // int right = n - 1;
    // int counter = 1;

    // while (left <= right) {

    // if (counter % 2 == 1) {
    // arr[left] = counter;
    // counter += 1;
    // left += 1;
    // } else {
    // arr[right] = counter;
    // counter += 1;
    // right -= 1;
    // }

    // }
    // }

    // public static void main(String[] args) {

    // int[] arr = TakeInput();

    // System.out.print(arrange(arr, 0));

    // }

    public static void main(String[] args) {
        int n = 10; // You can change the size of the array as needed
        int[] arr = new int[n];

        // Call the arrange method to arrange elements in the array
        arrange(arr, n);

        // Print the arranged array
        System.out.println("Arranged Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrange(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        int counter = 1;

        while (left <= right) {

            if (counter % 2 == 1) {
                arr[left] = counter;
                counter += 1;
                left += 1;
            } else {
                arr[right] = counter;
                counter += 1;
                right -= 1;
            }

        }
    }

}
