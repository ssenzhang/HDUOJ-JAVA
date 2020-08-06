package HDUOJ;

import java.util.Scanner;

public class H2008{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int T=scan.nextInt();
            if(T==0) break;
            int negative=0,zero=0,positive=0;
            while(T-->0){
                double a=scan.nextDouble();
                if(a<0) negative++;
                else if(a==0) zero++;
                else positive++;
            }
            System.out.format("%d %d %d", negative, zero,positive).println();
        }
        scan.close();
    }
}