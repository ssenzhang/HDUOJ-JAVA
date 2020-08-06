package HDUOJ;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class H1004 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int T=scan.nextInt();
            if(T==0) break;
            Map<String,Integer>map=new TreeMap<>();
            int[]bucket=new int[T];
            for(int i=0;i<T;i++){
                String str=scan.next();
                int size=map.size();
                if(!map.containsKey(str)) map.put(str,size);
                bucket[map.get(str)]++;
            }
            int max=-1,index=0;
            for(int a:bucket){
                max=Math.max(a,max);
            }
            for(int i=0;i<T;i++){
                if(bucket[i]==max) {index=i;break;}
            }
            // System.out.println(index);
            // StringBuffer color=new StringBuffer();
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                if(entry.getValue()==index) {System.out.println(entry.getKey());break;}
            }
            // System.out.println(color.toString());
        }
        scan.close();
    }
}