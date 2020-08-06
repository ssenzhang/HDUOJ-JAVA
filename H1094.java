package HDUOJ;

import java.util.Scanner;

public class H1094 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int sum=0,total=cin.nextInt();
            while(total-->0){
                sum+=cin.nextInt();
            }
            System.out.println(sum);
        }
        cin.close();
    }
}