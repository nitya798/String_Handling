package main;
import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch=s.nextLine().charAt(0);
        int l=s1.length();
        for(int i=0;i<l;i++){
            char m=s1.charAt(i);
            if(m==ch){
                System.out.println(i);
            }

        }

    }
}
