package HDUOJ;

import java.util.Scanner;

public class H2017 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        scan.nextLine();
        while(T-->0){
            String str=scan.nextLine();
            int count=0;
            for(char ch:str.toCharArray()){
                if(Character.isDigit(ch)) count++;
            }
            System.out.println(count);
        }
        scan.close();
    }
}