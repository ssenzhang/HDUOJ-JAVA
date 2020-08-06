package HDUOJ;

import java.util.Scanner;

public class H2039 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0){
            double a=scan.nextDouble(),b=scan.nextDouble(),c=scan.nextDouble();
            if(a+b>c&&a+c>b&&b+c>a) System.out.println("YES");
            else System.out.println("NO");
        }
        scan.close();
    }
}