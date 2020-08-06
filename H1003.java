package HDUOJ;

import java.util.Scanner;

public class H1003 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt(),kase=0;
        while(kase++<T){
            int size=scan.nextInt();
            int[]arr=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=scan.nextInt();
            }
            // 7 0 6 -1 1 -6 7 -5
            int[]dp=new int[size];
            dp[0]=arr[0];
            int sIndex=0,fIndex=0,tmpIndex=0,sum=arr[0];
            for(int i=1;i<size;i++){
                if(dp[i-1]>=0) dp[i]=dp[i-1]+arr[i];
                else{
                    dp[i]=arr[i];
                    tmpIndex=i;
                }
                if(sum<dp[i]){
                    sum=dp[i];
                    sIndex=tmpIndex;
                    fIndex=i;
                }
            }
            System.out.println("Case "+kase+":");
            System.out.println(sum+" "+(sIndex+1)+" "+(fIndex+1));
            if(kase<T) System.out.println();
        }
        scan.close();
    }
}