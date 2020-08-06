package HDUOJ;

import java.util.Scanner;

public class H2014 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int T=scan.nextInt(),kase=0;
            double sum=0,min=10000,max=-10000;
            while(kase++<T){
                double a=scan.nextDouble();
                min=min<a?min:a;
                max=max>a?max:a;
                sum+=a;
            }
            System.out.format("%.2f", (sum-min-max)/(T-2)).println();;
        }
        scan.close();
    }
}