package HDUOJ;

import java.util.Scanner;

public class H2018 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[55];
        a[1]=1;a[2]=2;a[3]=3;a[4]=4;a[5]=6;
        for(int i=6;i<55;i++){
            a[i]=a[i-1]+a[i-3];
        }
        while(scan.hasNext()){
            int n=scan.nextInt();
            if(n==0) break;
            System.out.println(a[n]);
        }
        scan.close();
    }
}