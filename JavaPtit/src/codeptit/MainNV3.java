
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class TTNhanVien{
    private static int stt=1;
    private String ma;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maThue;
    private String ngayKy;

    public TTNhanVien() {
    }

    public TTNhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKy) {
        this.ma = String.format("%05d", stt);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh=ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue; 
        this.ngayKy=ngayKy;
        stt++; 
    }
    
    public String getNgaySinh(){
        return ngaySinh;
    }
    
    @Override
    public String toString() {
        return ma+" "+ten+" "+gioiTinh+" "+ngaySinh+" "+diaChi+" "+maThue+" "+ngayKy;
    }
    
}
public class MainNV3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<TTNhanVien> list=new ArrayList<>();
        String tmp=sc.nextLine();
        for (int i = 0; i < n; i++) { 
            
            String ten=sc.nextLine();
            String gioiTinh=sc.nextLine();
            String ngaySinh=sc.nextLine();
            String diaChi=sc.nextLine();
            String maThue=sc.nextLine();
            String ngayKy=sc.nextLine();
            TTNhanVien nv=new TTNhanVien(ten, gioiTinh, ngaySinh, diaChi, maThue, ngayKy);
            list.add(nv);
        }
        
        list.sort(new Comparator<TTNhanVien>(){
            @Override
            public int compare(TTNhanVien o1, TTNhanVien o2) {
                String[] s1=o1.getNgaySinh().split("/");
                String[] s2=o2.getNgaySinh().split("/");
                if(s1[2].equals(s2[2])){
                    if(s1[1].equals(s2[1])){
                        return s1[0].compareTo(s2[0]);
                    }else{
                        return s1[1].compareTo(s2[1]);
                    }
                }else{
                    return s1[2].compareTo(s2[2]);
                }
            }            
        });
        
        for(TTNhanVien a: list){
            System.out.println(a);
        }
    }
}
