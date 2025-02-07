
package codeptit;

import java.text.DecimalFormat;
import java.util.Scanner;

class SinhVien{
    private String ma;
    private String ten;
    private String lop;
    private String ngSinh;
    private float GPA;

    public SinhVien() {
        ma="";
        ten="";
        lop="";
        ngSinh="";
        GPA=0;
    }

    public SinhVien(String ten, String lop, String ngSinh, float GPA) {
        this.ma="B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        String[] a=ngSinh.split("/");
        if(Integer.parseInt(a[0])<10){
            a[0]="0"+a[0];
        }
        if(Integer.parseInt(a[1])<10){
            a[1]="0"+a[1];
        }
        this.ngSinh=a[0]+"/"+a[1]+"/"+a[2];
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        String d=String.format("%1.2f", GPA);
        String kq=d.replace(",", ".");
        return ma+" "+ten+" "+lop+" "+ngSinh+" "+kq;
    }
    
    
    
}
public class MainSV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        String lop=sc.nextLine();
        String ngSinh=sc.nextLine();
        float GPA=sc.nextFloat();
        SinhVien sv=new SinhVien(ten, lop, ngSinh, GPA);
        System.out.print(sv);
    }
}
