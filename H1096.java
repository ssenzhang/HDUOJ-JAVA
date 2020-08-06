package HDUOJ;

import java.util.Scanner;

public class H1096 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        int kase=0;
        while(kase++<T){
            int sum=0,total=scan.nextInt();
            while(total-->0){
                sum+=scan.nextInt();
            }
            System.out.println(sum);
            if(kase<T) System.out.println();
        }
        scan.close();
    }
}