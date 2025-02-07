
package baiktramenu;

import java.util.Scanner;

public class Xau {
    private String nd;
    
    public Xau(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap xau: ");
        nd = sc.nextLine();
    }

    public String getNd() {
        return nd;
    }
    
    public void doDai(){
        System.out.println("Do dai: "+nd.length());
    }
    
    public void soCau(){
        String[] cau = nd.split("\\.|\\?|\\!");
        System.out.print("So cau cua xau la: "+cau.length);
    }
}
