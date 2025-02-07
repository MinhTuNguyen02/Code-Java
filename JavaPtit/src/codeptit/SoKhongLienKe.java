
package codeptit;
// @author N22DCCN094 - Nguyen Minh Tu

import java.util.Scanner;

public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String tmp=sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            int tong=0;
            boolean check=true;
            for (int j = 0; j < s.length()-1; j++) {
                int a=(int)(s.charAt(j)-'0');
                tong+=a;
//                System.out.println("tong: "+tong);
                int b=(int)(s.charAt(j+1)-'0');
//                System.out.println("a:"+a+"  b:"+b);
                if((a-b)!=2 && (a-b)!=-2){
//                    System.out.println(a-b);
//                    System.out.println("hahah");
                    check=false;
                    break;
                }
                if(j==s.length()-2){
                    tong+=b;
                }
            }
            if(check && tong%10==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
