package HDUOJ;

import java.util.Scanner;

public class H2002 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            double r=scan.nextDouble();
            System.out.println(String.format("%.3f", 3.1415927*r*r*r*4.0/3.0));
        }
        scan.close();
    }
}