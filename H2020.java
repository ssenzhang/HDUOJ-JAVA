package HDUOJ;

import java.util.Scanner;

public class H2020 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt(),idx=0;
            if(n==0) break;
            int[]arr=new int[n];
            while(idx<n){
                arr[idx++]=scan.nextInt();
            }
            for(int i=1;i<=n;i++){
                for(int j=0;j<n-i;j++){
                    if(Math.abs(arr[j])<Math.abs(arr[j+1])){
                        int tmp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(i!=n-1) System.out.print(arr[i]+" ");
                else System.out.println(arr[i]);
            }
        }
        scan.close();
    }
}