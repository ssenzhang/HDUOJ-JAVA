package HDUOJ;

import java.util.Scanner;

public class H2007 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int a=scan.nextInt(),b=scan.nextInt();
            int sqrt=0,cube=0;
            for(int i=Math.min(a,b);i<=Math.max(a,b);i++){
                if(i%2==0) sqrt+=i*i;
                else cube+=i*i*i;
            }
            // System.out.println(sqrt+" "+cube);
            System.out.format("%d %d",sqrt,cube).println();;
        }
        scan.close();
    }
}