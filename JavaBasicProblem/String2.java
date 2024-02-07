package JavaBasicProblem;

import java.util.*;

public class String2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        System.out.println(s.substring(start, end));

    }

}
