
package baiktramenu;

import java.util.Scanner;

public class MaTranVuong {
    private int kt;
    private double[][] mtr;

    public MaTranVuong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran: ");
        kt = Integer.parseInt(sc.nextLine());
        mtr = new double[kt][kt];
        for (int i = 0; i < kt; i++) {
            for (int j = 0; j < kt; j++) {
                System.out.print("Nhap mtr["+i+"]["+j+"]: ");
                mtr[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
    }

    public int getKt() {
        return kt;
    }
    
    public void tongHang(){
        for (int i = 0; i < kt; i++) {
            double tong=0;
            for (int j = 0; j < kt; j++) {
                tong += mtr[i][j];
            }
            System.out.println("Tong hang " + (i+1) + "= " + tong);
        }
    }
    
    public double dinhThuc(){
        double det=1;
        for (int i = 0; i < kt; i++) {
            for (int j = i+1; j < kt; j++) {
                double c = mtr[j][i]/mtr[i][i];
                for (int k = i; k < kt; k++) {
                    mtr[j][k] = mtr[j][k] - (c * mtr[i][k]);
                }
            }
        }
        
        for (int i = 0; i < kt; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j)
                    det *= mtr[i][j];
            }
        }
        if(det==0) return 0;
        return det;
    }
}
