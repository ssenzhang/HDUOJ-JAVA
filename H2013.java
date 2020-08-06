package HDUOJ;

import java.util.Scanner;

public class H2013 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            int sum=1;
            while(n-->1){
                sum=(sum+1)*2;
            }
            System.out.println(sum);
        }
        scan.close();
    }
}