package HDUOJ;

import java.util.Scanner;

public class H1002 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt(),kase=0;
        scan.nextLine();   //read "Enter"
        while(kase++<T){
            String str=scan.nextLine();
            String[]arr=str.split(" ");
            System.out.println("Case "+kase+" :\n"+arr[0]+" + "+arr[1]+" = "+add(arr[0],arr[1]));
            if(kase<T) System.out.println();
        }
        scan.close();
    }
    private static String add(String str1,String str2){
        StringBuffer ans=new StringBuffer();
        int carry=0,digit=0,i=str1.length()-1,j=str2.length()-1;
        for(;i>=0&&j>=0;i--,j--){
            int sum=carry+(str1.charAt(i)-'0')+(str2.charAt(j)-'0');
            // System.out.println((str1.charAt(i)-'0')+"asas"+(str2.charAt(j)-'0'));
            digit=sum%10;
            carry=sum/10;
            ans.append(digit);
        }
        while(i>=0){
            int sum=carry+(str1.charAt(i--)-'0');
            digit=sum%10;
            carry=sum/10;
            ans.append(digit);
        }
        while(j>=0){
            int sum=carry+(str2.charAt(j--)-'0');
            digit=sum%10;
            carry=sum/10;
            ans.append(digit);
        }
        if(carry>0) ans.append(carry);
        return ans.reverse().toString();
    }
}