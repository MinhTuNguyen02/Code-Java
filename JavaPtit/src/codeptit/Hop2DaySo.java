
package codeptit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Hop2DaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
//        int k=0;
//        ArrayList list=new ArrayList();
        for (int i = 0; i < n; i++) {
//            list.add(a[i]);
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i < m; i++) {
            boolean flag=true;
            for (int j = 0; j < n; j++) {
                if(b[i]==a[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
//                list.add(b[i]);
                System.out.print(b[i]);
                if(i!=m-1){
                    System.out.print(" ");
                }
            }
            
        }
//        Collections.sort(list);
//        for (int i = 0; i < list.size(); i++) {
//            if(i==0){
//                System.out.print(list.get(i));
//            }else{
//                System.out.print(" "+list.get(i));
//            }
//        }
    }
}
