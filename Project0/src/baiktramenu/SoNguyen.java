
package baiktramenu;

import java.util.Scanner;

public class SoNguyen {
    private int gtri;
    
    public SoNguyen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        gtri = Integer.parseInt(sc.nextLine());
    }

    public int getGtri() {
        return gtri;
    }
    
    public void tong(){
        int t = (gtri*(gtri+1))/2;
        System.out.println("Tong = "+t);
    }
    
    private boolean IsSNT(int n){
        if(n<2) return false;
        else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
    
    public void inSNT(){
        System.out.print("Day so nguyen to <= "+gtri+" la: ");
        for (int i = 0; i <=gtri; i++) {
            if(IsSNT(i))
                System.out.print(i+" ");
        }
        System.out.println("");
    }
}
