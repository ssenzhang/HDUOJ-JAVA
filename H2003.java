package HDUOJ;

import java.util.Scanner;

public class H2003 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            double a=scan.nextDouble();
            System.out.format("%.2f", Math.abs(a)).println();
        }
        scan.close();
    }
}