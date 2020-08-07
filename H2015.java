package HDUOJ;

import java.util.Scanner;

public class H2015{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt(),m=scan.nextInt();
            StringBuffer ans=new StringBuffer();
            int sum=0,ai=2;
            for(int i=1;i<=n;i++){
                sum+=ai;
                ai+=2;
                if(i%m==0){
                    ans.append(sum/m+" ");
                    sum=0;
                }
            }
            if(n%m!=0){
                ans.append(sum/(n%m));
            }
            System.out.println(ans.toString().trim());
        }
        scan.close();
    }
}