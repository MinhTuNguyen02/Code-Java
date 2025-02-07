
package codeptit;

import java.util.Scanner;


// @author N22DCCN094 - Nguyen Minh TU

public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            long tmp=sc.nextLong();
            long check=0;
            boolean flag=true;
            while(tmp>10){
                long a=tmp%10;
                tmp/=10;
                long b=tmp%10;
                check=a-b;
                if(check!=1 && check!=-1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print("YES");
            }else{
                System.out.print("NO");
            }
            if(i<n-1){
                System.out.print("\n");
            }
        }
    }
}
