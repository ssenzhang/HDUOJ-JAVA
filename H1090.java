package HDUOJ;

import java.util.Scanner;

public class H1090 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0){
            int a=scan.nextInt(),b=scan.nextInt();
            System.out.println(a+b);
        }
        scan.close();    
    }
}