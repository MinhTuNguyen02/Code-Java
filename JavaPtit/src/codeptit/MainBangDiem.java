package codeptit;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class BangDiem{
    private static int stt=1;
    private String ma;
    private String ten;
    private double toan, tiengViet, ngoaiNgu, li, hoa,sinh,su, dia, gdcd, cn;

    public BangDiem() {
    }

    public BangDiem(String ten, double toan, double tiengViet, double ngoaiNgu, double li, double hoa, double sinh, double su, double dia, double gdcd, double cn) {
        this.ten = ten;
        this.toan = toan;
        this.tiengViet = tiengViet;
        this.ngoaiNgu = ngoaiNgu;
        this.li = li;
        this.hoa = hoa;
        this.sinh = sinh;
        this.su = su;
        this.dia = dia;
        this.gdcd = gdcd;
        this.cn = cn;
        if(stt<10){
            this.ma="HS0"+stt;
        }else{
            this.ma="HS"+stt;
        }stt++;
    }
    
    public String getMa(){
        return ma;
    }
    
    public String trungBinh(){
        double tb=(toan*2+tiengViet*2+ngoaiNgu+li+hoa+sinh+su+dia+gdcd+cn)/12;
        DecimalFormat d=new DecimalFormat("#.##");
        String t=d.format(tb);   
        
        if(t.length()==4){
             String replace = t.replace(",", ".");
            tb=Double.parseDouble(replace);
                d=new DecimalFormat("#.#");
                String p=d.format(tb); 
//                String r1=p.replace(",", ".");
//                tb=Double.parseDouble(p);     
                t=p;
        }
        
        return t;
    }

    public String xepLoai(){
        double tb=Double.parseDouble(trungBinh().replace(",", "."));
        if(tb>=9){
            return "XUAT SAC";
        }else if(tb>=8){
            return "GIOI";
        }else if(tb>=7){
            return "KHA";
        }else if(tb>=5){
            return "TB";
        }
        return "YEU";
    }
    
    @Override
    public String toString() {
        String tb=trungBinh().replace(",", ".");
        return ma+" "+ten+" "+tb+" "+xepLoai();
    }

}
public class MainBangDiem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<BangDiem> list=new ArrayList<>();
        String tmp=sc.nextLine();
        for (int i = 0; i < n; i++) { 
//            String tmp=sc.nextLine();
            String ten=sc.nextLine();
//            double toan=sc.nextDouble();
//            double tiengViet=sc.nextDouble();
//            double ngoaiNgu=sc.nextDouble();
//            double li=sc.nextDouble();
//            double hoa=sc.nextDouble();
//            double sinh=sc.nextDouble();
//            double su=sc.nextDouble();
//            double dia=sc.nextDouble();
//            double gdcd=sc.nextDouble();
//            double cn=sc.nextDouble();
            String diem=sc.nextLine();
            String[] s=diem.split("\\s");
            double toan=Double.parseDouble(s[0]);
            double tiengViet=Double.parseDouble(s[1]);
            double ngoaiNgu=Double.parseDouble(s[2]);
            double li=Double.parseDouble(s[3]);
            double hoa=Double.parseDouble(s[4]);
            double sinh=Double.parseDouble(s[5]);
            double su=Double.parseDouble(s[6]);
            double dia=Double.parseDouble(s[7]);
            double gdcd=Double.parseDouble(s[8]);
            double cn=Double.parseDouble(s[9]);
            BangDiem b=new BangDiem(ten, toan, tiengViet, ngoaiNgu, li, hoa, sinh, su, dia, gdcd, cn);
            list.add(b);
        }
        list.sort(new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if(o1.trungBinh().equals(o2.trungBinh())){
                    return o1.getMa().compareToIgnoreCase(o2.getMa());
                }else{
                    return o2.trungBinh().compareToIgnoreCase(o1.trungBinh());
                }                
            }            
        });
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i));
            if(i!=n-1){
                System.out.println("");
            }
        }
    }
}
