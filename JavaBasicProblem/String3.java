package JavaBasicProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        in.close();
        ArrayList<String> ls = new ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            ls.add(s.substring(i, i + k));
        }

        String[] sa = ls.toArray(new String[0]);
        Arrays.sort(sa);

        System.out.printf("%s%n%s", sa[0], sa[sa.length - 1]);
    }

}
