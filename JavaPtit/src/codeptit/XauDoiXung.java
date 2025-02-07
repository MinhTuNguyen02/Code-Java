
package codeptit;

import java.util.Scanner;

public class XauDoiXung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            int dem=0;
            int l=s.length()/2;
            for (int j = 0; j < l; j++) {
                if(!s.substring(j, j+1).equals(s.substring(s.length()-j-1, s.length()-j))){
                    dem++;
                }
            }
            if(dem==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
