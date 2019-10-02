package main;
import java.util.Scanner;
public class Question3{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String s1=s.nextLine();
        String s2=s1.replace('a','*');
        String s3=s2.replace('e','*');
        String s4=s3.replace('i','*');
        String s5=s4.replace('o','*');
        String s6=s5.replace('u','*');
        System.out.println(s6);

    }
}
