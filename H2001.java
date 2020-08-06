package HDUOJ;

import java.util.Scanner;

public class H2001 {
    public static void main(String[] args) {
        double x1,x2,y1,y2;
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            x1=scan.nextDouble();
            y1=scan.nextDouble();
            x2=scan.nextDouble();
            y2=scan.nextDouble();
            System.out.println(String.format("%.2f",Math.sqrt(Math.abs(x1-x2)*Math.abs(x1-x2)+Math.abs(y1-y2)*Math.abs(y1-y2))));
        }
        scan.close();
    }
}