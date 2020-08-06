package HDUOJ;

import java.util.Scanner;

public class H2012 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int x=scan.nextInt(),y=scan.nextInt();
            if(x==0&&y==0) break;
            boolean flag=true;
            for(int i=x;i<=y;i++){
                int n=i*i+i+41;
                if(!myIsPrime(n)){flag=false;break;}
            }
            if(flag) System.out.println("OK");
            else System.out.println("Sorry");
            
        }
        scan.close();
    }
    private static boolean myIsPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}