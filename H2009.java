package HDUOJ;

import java.util.Scanner;

public class H2009 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            double n=scan.nextInt(),sum=0;
            int T=scan.nextInt();
            while(T-->0){
                sum+=n;
                n=Math.sqrt(n);
            }
            System.out.format("%.2f",sum).println();
        }
        scan.close();
    }
}