package main;
import java.util.Scanner;
public class Question7{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int l=s1.length();
        int sum=0;

        for(int i=0;i<l;i++){
           char ch=s1.charAt(i);
           sum=sum+(int)ch;
        }
        System.out.println(sum);
    }
}
