package HDUOJ;

import java.util.Scanner;

public class H2005 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.next();
            int a=Integer.valueOf(str.split("/")[0]),b=Integer.valueOf(str.split("/")[1]),c=Integer.parseInt(str.split("/")[2]);
            System.out.println(jude(a, b, c));
        }
        scan.close();
    }
    private static int jude(int year,int month,int day){
        boolean isLeapYear=false;
        int sum=0;
        if(year%400==0||(year%100!=0&&year%4==0)) isLeapYear=true;
        int dys[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
            sum+=dys[i];
        }
        sum+=day;
        if(month>2&&isLeapYear) sum++;
        return sum;
    }
}