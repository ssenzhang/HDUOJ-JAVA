package HDUOJ;

import java.util.Scanner;

public class H2004 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int score=scan.nextInt();
            StringBuffer str=new StringBuffer();
            if(score<=100&&score>=90) str.append("A");
            else if(score<90&&score>=80) str.append("B");
            else if(score<80&&score>=70) str.append("C");
            else if(score<70&&score>=60) str.append("D");
            else if(score<60&&score>=0) str.append("E");
            else str.append("Score is error!");
            System.out.println(str.toString());
        }
        scan.close();
    }
}