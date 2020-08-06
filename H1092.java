package HDUOJ;

import java.util.Scanner;

public class H1092 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int T=scan.nextInt();
            if(T==0) break;
            int sum=0;
            while(T-->0){
                sum+=scan.nextInt();
            }
            System.out.println(sum);
        }
        scan.close();
    }
}