
package codeptit;

import java.util.Scanner;

class GiaoVien{
    private String ma;
    private String ten;
    private int luong;

    public GiaoVien() {
    }

    public GiaoVien(String ma, String ten, int luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    
    private int PhuCap(){
        String code=this.ma.substring(0, 2);
        if(code.equalsIgnoreCase("HT")){
            return 2000000;
        }else if(code.equalsIgnoreCase("HP")){
            return 900000;
        }
        return 500000;
    }

    public int getLuong() {
        int heso=Integer.parseInt(ma.substring(2, 4));
        int phucap=PhuCap();
        return luong*heso + phucap;
    }

    @Override
    public String toString() {
        int heso=Integer.parseInt(ma.substring(2, 4));
        int phucap=PhuCap();
        return ma+" "+ten+" "+heso+" "+phucap+" "+getLuong();
    }
    
}
public class ThuNhapGV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ma=sc.nextLine();
        String tmp=sc.nextLine();
        String ten=sc.nextLine();
        tmp=sc.nextLine();
        int luong=Integer.parseInt(sc.nextLine());
        
        GiaoVien gv=new GiaoVien(ma, ten, luong);
        System.out.println(gv);
    }
}
