package main;

import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int l = s1.length();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < l; i++) {
            char ch = s1.charAt(i);
            if (ch >= 65 && ch <= 90) {
                sum1 = sum1 + (int) ch;
            } else if (ch >= 97 && ch <= 122) {
                sum2 = sum2 + (int) ch;
            }

        }
        int sum3 = sum1 - sum2;
        System.out.println("Absolute weight: " + sum3);
    }
}
