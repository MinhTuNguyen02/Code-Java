
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class SinhVienTT{
    private static int stt=1;
    private int Sott;
    private String ma;
    private String ten;
    private String lop;
    private String email;
    private String doanhNghiep;

    public SinhVienTT() {
    }

    public SinhVienTT(String ma, String ten, String lop, String email, String doanhNghiep) {
        this.Sott = stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
        stt++;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getDoanhNghiep(){
        return doanhNghiep;
    }

    @Override
    public String toString() {
        return Sott+" "+ma+" "+ten+" "+lop+" "+email+" "+doanhNghiep;
    }
    
}
public class MainThucTap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<SinhVienTT> list=new ArrayList<>();
        String tmp=sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.nextLine();
            String doanhNghiep =sc.nextLine();
            SinhVienTT sv=new SinhVienTT(ma, ten, lop, email, doanhNghiep);
            list.add(sv);
        }
        
        list.sort(new Comparator<SinhVienTT>(){
            @Override
            public int compare(SinhVienTT o1, SinhVienTT o2) {
                return o1.getMa().compareTo(o2.getMa());
            }        
        });
        
        int m=sc.nextInt();
        String[] dn = new String[m];
        for (int i = 0; i < m; i++) {
            dn[i]=sc.next();
        }        
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getDoanhNghiep().equals(dn[i])){
                    System.out.println(list.get(j));
                }
            }
        }
    }
}
