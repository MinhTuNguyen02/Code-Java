
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class TienNuoc{
    private static int stt=1;
    private String ma;
    private String ten;
    private int soCu;
    private int soMoi;

    public TienNuoc(String ten, int soCu, int soMoi) {
        if(stt<10){
            this.ma="KH0"+stt;
        }else{
            this.ma="KH"+stt;
        }
        stt++;
        this.ten = ten;
        this.soCu = soCu;
        this.soMoi = soMoi;
    }
    
    public int getSoKhoi(){
        return soMoi-soCu;
    }
    
    public int getDonGia(){
        int soKhoi=getSoKhoi();
        if(soKhoi<=50){
            return 100;
        }else if(soKhoi<=100){
            return 150;
        }else{
            return 200;
        }
    }
    
    public double tongTien(){
        if(getDonGia()==100){
            return getSoKhoi()*getDonGia()*102/100;
        }else if(getDonGia()==150){
            return getSoKhoi()*getDonGia()*103/100;
        }else{
            return getSoKhoi()*getDonGia()*105/100;
        }
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+Math.round(tongTien());
    }
    
}
public class MainTN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<TienNuoc> list=new ArrayList<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            String tmp=sc.nextLine();
            String ten=sc.nextLine();
            int soCu=sc.nextInt();
            int soMoi=sc.nextInt();
            TienNuoc t=new TienNuoc(ten, soCu, soMoi);
            list.add(t);
        }
        
        list.sort(new Comparator<TienNuoc>(){
            @Override
            public int compare(TienNuoc o1, TienNuoc o2) {
                return Double.compare(o2.tongTien(), o1.tongTien());
            }            
        });
        
        for(TienNuoc a:list){
            System.out.println(a);
        }
    }
}
