package HDUOJ;

import java.util.Scanner;

public class H1001 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            int sum=n%2==0?n/2*(n+1):(n+1)/2*n;  //n*(n-1) maybe not in 32-signed Integer
            System.out.println(sum);
            System.out.println("");
        }
        scan.close();
    }
}
