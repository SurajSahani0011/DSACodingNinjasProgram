package JavaBasicProblem;

import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        int n = A.length();
        for (int i = 0; i < n; i++)
            B = B + A.charAt(n - i - 1);
        System.out.println((A.equalsIgnoreCase(B)) ? "Yes" : "No");
    }

}
