package main;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str2 = s.nextLine();
        String rep = s.nextLine();
        System.out.println(str.replaceAll(str2, rep));

    }
}
