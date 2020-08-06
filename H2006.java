package HDUOJ;

import java.util.Scanner;

public class H2006 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int T=scan.nextInt();
            int ans=1;
            while(T-->0){
                int a=scan.nextInt();
                if(a%2==1) ans*=a;
            }
            System.out.println(ans);
        }
        scan.close();
    }
}