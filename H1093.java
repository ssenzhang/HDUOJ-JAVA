package HDUOJ;

import java.util.Scanner;

public class H1093 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int T=cin.nextInt();
        while(T-->0){
            int sum=0,total=cin.nextInt();
            while(total-->0){
                sum+=cin.nextInt();
            }
            System.out.println(sum);
        }
        cin.close();
    }
}