package HDUOJ;

import java.util.Scanner;

public class H2000 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.next();
            char a=str.charAt(0);
            char b=str.charAt(1);
            char c=str.charAt(2);
            char tmp;
            if(a>b){
                tmp=a;a=b;b=tmp;
            }
            if(c<b){
                if(c>a){
                    tmp=c;c=b;b=tmp;
                }else{
                    tmp=a;a=c;c=b;b=tmp;
                }
            }
            System.out.println(a+" "+b+" "+c);
        }
        scan.close();
    }
}