package HDUOJ;

import java.util.Scanner;

public class H2010 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            StringBuffer str=new StringBuffer();
            int m=scan.nextInt(),n=scan.nextInt();
            boolean flag=false;
            for(int i=m;i<=n;i++){
                if(i==Math.pow(i%10,3)+Math.pow(i/10%10, 3)+Math.pow(i/100, 3)){
                    flag=true;
                    str.append(i+" ");
                }
            }
            if(!flag) System.out.println("no");
            else System.out.println(str.toString().trim());
        }
        scan.close();
    }
}