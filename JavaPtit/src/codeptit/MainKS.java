
package codeptit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class HoaDon{
    private static int stt=1;
    private String ma;
    private String ten;
    private String soPhong;
    private LocalDate ngayNhan;
    private LocalDate ngayTra;
    public int phatSinh;
    public HoaDon(String ten, String soPhong, LocalDate ngayNhan, LocalDate ngayTra, int phatSinh) {
        if(stt<10){
            this.ma="KH0"+stt;
        }else{
            this.ma="KH"+stt;
        }
        stt++;
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.phatSinh=phatSinh;
    }
    
    public int getDonGia(){
        int donGia=0;
        if(soPhong.charAt(0)=='1'){
            donGia=25;
        }else if(soPhong.charAt(0)=='2'){
            donGia=34;
        }else if(soPhong.charAt(0)=='3'){
            donGia=50;
        }else{
            donGia=80;
        }
        return donGia;
    }
    
    public int getSoNgay(){
        int ngay=1;
        LocalDate tmp=ngayNhan;
        while(!tmp.equals(ngayTra)){
            ngay++;
            tmp=tmp.plusDays(1);                                        
        }
        return ngay;
    }
    
    public int thanhTien(){
        return getDonGia()*getSoNgay()+phatSinh;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+soPhong+" "+getSoNgay()+" "+thanhTien();
    }    
}
public class MainKS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<HoaDon> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp=sc.nextLine();
            String ten=sc.nextLine();
            String soPhong=sc.next();
            String s1=sc.next();
            String s2=sc.next();        
            String[] ss1=s1.split("/");
            String[] ss2=s2.split("/");
            LocalDate ngayNhan = LocalDate.of(Integer.parseInt(ss1[2]), Integer.parseInt(ss1[1]), Integer.parseInt(ss1[0]));            
            LocalDate ngayTra = LocalDate.of(Integer.parseInt(ss2[2]), Integer.parseInt(ss2[1]), Integer.parseInt(ss2[0]));            
            int phatSinh=sc.nextInt();
            HoaDon h=new HoaDon(ten, soPhong, ngayNhan, ngayTra, phatSinh);
            list.add(h);
        }
        
        list.sort(new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return Integer.compare(o2.thanhTien(), o1.thanhTien());
            }            
        });
        for(HoaDon a:list){
            System.out.println(a); 
        }
    }
}
