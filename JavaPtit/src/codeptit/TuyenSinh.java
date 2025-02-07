
package codeptit;

import java.text.DecimalFormat;
import java.util.Scanner;

class ThiSinh{
    private String ma;
    private String ten;
    private double toan;
    private double li;
    private double hoa;

    public ThiSinh() {
    }

    public ThiSinh(String ma, String ten, double toan, double li, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }
    
    private double diemUuTien(){
        double diem=0.0;
        String kv=ma.substring(2, 3);
        if(kv.equals("1")){
            diem=0.5;
        }else if(kv.equals("2")){
            diem=1.0;
        }else if(kv.equals("3")){
            diem=2.5;
        }
        return diem;
    }
    
    public double getTongDiem(){
        return toan*2+li+hoa;
    }
    
    public String ketQua(){
        if(getTongDiem()+diemUuTien()>=24){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        String t = decimalFormat.format(getTongDiem());
        String u = decimalFormat.format(diemUuTien());
        return ma+" "+ten+" "+u+" "+t+" "+ketQua();
    }
    
}
public class TuyenSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ma=sc.nextLine();
//        String tmp=sc.nextLine();
        String ten=sc.nextLine();
//        tmp=sc.nextLine();
        double toan=Double.parseDouble(sc.nextLine());
//        tmp=sc.nextLine();
        double li=Double.parseDouble(sc.nextLine());
//        tmp=sc.nextLine();
        double hoa=Double.parseDouble(sc.nextLine());
        ThiSinh s=new ThiSinh(ma, ten, toan, li, hoa);
        System.out.println(s);
    }
}
