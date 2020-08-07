package HDUOJ;

import java.util.Scanner;

public class H2016 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int T=scan.nextInt();
            if(T==0) break;
            int[]arr=new int[T];
            int kase=0,idx=0,min=0;
            while(kase<T){
                arr[kase]=scan.nextInt();
                if(kase==0) min=arr[0];
                else if(arr[kase]<min){
                    min=arr[kase];
                    idx=kase;
                }
                kase++;
            }
            arr[idx]=arr[0];
            arr[0]=min;
            // System.out.print(min);
            for(int i=0;i<arr.length;i++){
                // if(i!=idx){
                    System.out.print(arr[i]);
                    if(i!=arr.length-1) System.out.print(" ");
                // }
            }
            System.out.println();
        }
        scan.close();
    }
}