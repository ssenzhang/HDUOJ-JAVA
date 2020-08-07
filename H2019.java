package HDUOJ;

import java.util.Scanner;

public class H2019 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt(),x=scan.nextInt();
            if(n==0&&x==0) break;
            int arr[]=new int[n+1];
            int idx=0,count=0;
            while(idx<n+1){
                int a=scan.nextInt();
                if(x<=a&&count==0) {arr[idx++]=x;count++;}
                arr[idx++]=a; 
            }
            for(int i=0;i<=n;i++){
                if(i!=n){
                    System.out.print(arr[i]+" ");
                }else System.out.println(arr[n]);
            }
        }
        scan.close();
    }
}