package HDUOJ;

import java.util.Scanner;

public class H1000 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int a=scan.nextInt();
            int b=scan.nextInt();
            System.out.println(a+b);
        }
        scan.close();
    }
}