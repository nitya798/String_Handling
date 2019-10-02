package main;
import java.util.Scanner;
public class Question2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int n=s.nextInt();
        String s2=s1.substring(0,n);
        System.out.println(s2);

    }
}
