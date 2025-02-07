
package codeptit;

import java.util.Scanner;


public class QuayPhai {
    public static void quayTrai(int[] a){
        int tmp=a[0];
        for (int i = 0; i <a.length-1; i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=tmp;
    }
    public static void quayPhai(int[] a){
        int tmp=a[a.length-1];
        for (int i = a.length-1; i >0; i--) {
            a[i]=a[i-1];
        }
        a[0]=tmp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m=sc.nextInt();
            int[] a=new int[m];
            for (int j = 0; j < m; j++) {
                a[j]=sc.nextInt();
            }
            int k=0, t=1;
            boolean check=true;
            for (int j = 0; j < m-1; j++) {
                if(!check && a[j]>a[j+1]){
                    for (int l = 0; l < t; l++) {
                        quayTrai(a);
                    }
                    j=j-t+1;
                    check=true;
                    
                }
                if(a[j]==a[j+1]){
                    t++;
                    check=false;
                }                
                if(a[j]>a[j+1]){
                    quayTrai(a);
                    k++;
                    j--;
                }
            }
            System.out.println(k);
        }
    }
}
