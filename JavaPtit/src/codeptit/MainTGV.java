
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class GiaoVien{
    private static int stt=1;
    private String ma;
    private String ten;
    private String maXT;
    private double diemTH;
    private double diemCM;

    public GiaoVien() {
    }

    public GiaoVien(String ten, String maXT, double diemTH, double diemCM) {
        if(stt<10){
            this.ma="GV0"+stt;
        }else{
            this.ma="GV"+stt;
        }
        this.ten = ten;
        this.maXT = maXT;
        this.diemTH = diemTH;
        this.diemCM = diemCM;
        stt++;
    }
    
    public String getMa(){
        return maXT;
    }
    
    public double getDiemUuTien(){
        double diem=0;
        if(maXT.charAt(1)=='1'){
            diem=2;
        }else if(maXT.charAt(1)=='2'){
            diem=1.5;
        }else if(maXT.charAt(1)=='3'){
            diem=1;
        }
        return diem;
    }
    
    public String getMonHoc(){
        String mon="";
        if(maXT.charAt(0)=='A'){
            mon="TOAN";
        }else if(maXT.charAt(0)=='B'){
            mon="LY";
        }else{
            mon="HOA";
        }
        return mon;
    }
    
    public double tongDiem(){
        return diemTH*2+diemCM+getDiemUuTien();
    }
    
    public String ketQua(){
        if(tongDiem()>=18){
            return "TRUNG TUYEN";
        }
        return "LOAI";
    }

    @Override
    public String toString() {
        String tong=String.format("%.1f", tongDiem());
        String tong1=tong.replace(",", ".");
        return ma+" "+ten+" "+getMonHoc()+" "+tong1+" "+ketQua();
    }
    
}
public class MainTGV {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<GiaoVien> list=new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String tmp=sc.nextLine();
            String ten=sc.nextLine();
            String maXT=sc.nextLine();
            double diemTH=sc.nextDouble();
            double diemCM=sc.nextDouble();
            GiaoVien gv=new GiaoVien(ten, maXT, diemTH, diemCM);
            list.add(gv);
        }
        list.sort(new Comparator<GiaoVien>(){
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
                return Double.compare(o2.tongDiem(), o1.tongDiem());
            }            
        });
        
        for(GiaoVien a:list){
            System.out.println(a);
        }
    }
}
