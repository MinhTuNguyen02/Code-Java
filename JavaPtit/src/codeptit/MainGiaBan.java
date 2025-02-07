
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class MatHang{
    private static int stt=1;
    private String ma;
    private String ten;
    private String donVi;
    private double donGia;
    private int soLuong;

    public MatHang() {
    }

    public MatHang(String ten, String donVi, double donGia, int soLuong) {
        if(stt<10){
            this.ma="MH0"+stt;
        }else{
            this.ma="MH"+stt;
        }
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
        stt++;
    }
    
    public double getPhiVanChuyen(){
        return (donGia*soLuong)*5/100;
    }
    
    public double thanhTien(){
        return donGia*soLuong+getPhiVanChuyen();
    }
    
    public double giaBan(){
        return (thanhTien()+thanhTien()*2/100);
    }

    @Override
    public String toString() {
//        int gia = (int)(Math.ceil(giaBan()/100)*100);
        return ma+" "+ten+" "+donVi+" "+Math.round(getPhiVanChuyen())+" "+Math.round(thanhTien())+" "+Math.round(giaBan());
    }
    
    
}
public class MainGiaBan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<MatHang> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp=sc.nextLine();
            String ten=sc.nextLine();
            String donVi=sc.nextLine();
            double donGia=sc.nextInt();
            int soLuong=sc.nextInt();
            MatHang mh=new MatHang(ten, donVi, donGia, soLuong);            
            list.add(mh);
        }
//        list.sort(new Comparator<MatHang>(){
//            @Override
//            public int compare(MatHang o1, MatHang o2) {
//                return Double.compare(o2.giaBan(), o1.giaBan());
//            }
//            
//        });
        for(MatHang a:list){
            System.out.println(a);
        }
    }
}
