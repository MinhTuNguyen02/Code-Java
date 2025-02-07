
package codeptit;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {            
            int tmp=sc.nextInt();
            boolean flag=true;
            for (int j = 2; j <= Math.sqrt(tmp); j++) {
                if(tmp%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
