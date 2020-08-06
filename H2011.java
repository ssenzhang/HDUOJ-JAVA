package HDUOJ;

import java.util.Scanner;

public class H2011 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0){
            int n=scan.nextInt();
            double sum=0;
            for(int i=1;i<=n;i++){
                if(i%2==1) sum+=1.0/i;
                else sum-=1.0/i; 
            }
            System.out.println(String.format("%.2f",sum));
        }
        scan.close();
    }
}