
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien{
    private static int stt=1;
    private String ma;
    private String ten;
    private int luongCoBan;
    private int soNgayCong;
    private String chucVu;
    
    public NhanVien() {
    }

    public NhanVien(String ten, int luongCoBan, int soNgayCong, String chucVu) {       
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        if(stt<10){
            this.ma="NV0"+stt;
        }else{
            this.ma="NV"+stt;
        }stt++;
    }
       
    public int getLuongThang(){
        return luongCoBan*soNgayCong;
    }
    
    public int getThuong(){
        int t=0;
        if(soNgayCong>=25){
            t=20;
        }else if(soNgayCong>=22){
            t=10;
        }else{
            t=0;
        }
        return getLuongThang()*t/100;
    }
    
    public int getPhuCap(){    
        if(chucVu.equalsIgnoreCase("GD")){
            return 250000;
        }else if(chucVu.equalsIgnoreCase("PGD")){
            return 200000;
        }else if(chucVu.equalsIgnoreCase("TP")){
            return 180000;
        }
        return 150000;
    }
    
    public int thuNhap(){
        return getLuongThang()+getThuong()+getPhuCap();
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+getLuongThang()+" "+getThuong()+" "+getPhuCap()+" "+thuNhap();
    }
}
public class TinhCong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<NhanVien> list=new ArrayList<>();
        int n=sc.nextInt();
        String tmp=sc.nextLine();
        for (int i = 0; i < n; i++) {              
            String ten=sc.nextLine();
            int luongCoBan=Integer.parseInt(sc.nextLine());
            int soNgayCong=Integer.parseInt(sc.nextLine());
            String chucVu=sc.nextLine();
            NhanVien nv=new NhanVien(ten, luongCoBan, soNgayCong, chucVu);
            list.add(nv);
        }
//        list.sort(new Comparator<NhanVien>(){
//            @Override
//            public int compare(NhanVien o1, NhanVien o2) {
//                return o2.thuNhap()-o1.thuNhap();
//            }
//            
//        });
        for(NhanVien a:list){
            System.out.println(a);
        }        
    }
}
