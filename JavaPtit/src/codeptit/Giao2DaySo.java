
package codeptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Giao2DaySo {
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
        boolean first=true;
        for (int i = 0; i < n; i++) {
            for (int j=0; j < m; j++) {
                if(a[i]<b[j]){
                    break; 
                }
                if(a[i]==b[j]){
                    if(first){
                        System.out.print(a[i]);
                        first=false;
                    }else{
                        System.out.print(" "+ a[i]);
                    }
                }            
            }
        }
    }
}
