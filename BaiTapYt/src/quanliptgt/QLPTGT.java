 
package quanliptgt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QLPTGT implements ChucNang{
    private List<PTGT> list;
    private Scanner sc=new Scanner(System.in);
    
    public QLPTGT() {
        list = new ArrayList<>();
        list.add(new Oto("BD345", "toyota", 2019, 30000, "Do", "qqq", 4));
        list.add(new XeMay("BD739", "Honda", 2022, 15000, "Do", 100.64));
        list.add(new XeMay("BD455", "Yadex", 2022, 19000, "Vang", 110));
        list.add(new XeMay("BD853", "Yamaha", 2023, 20000, "Tim", 125));
        list.add(new XeMay("BD267", "Honda", 2012, 10000, "Hong", 150));
        list.add(new Oto("BD990", "huyndai", 2022, 50000, "Xanh", "ccc", 7));
        list.add(new Oto("BD238", "bmw", 2022, 80000, "Trang", "ppp", 2));
    }
    
    private PTGT tontai(String ma){
        for(PTGT i:list){
            if(i.getMa().equalsIgnoreCase(ma))
                return i;
        }
        return null;
    }
    


    private PTGT nhap(){
        PTGT t=null;
        String ma;
        String HSX;
        int nam;
        double gia;
        String mau;
        
        String regex="^BD\\d{3}";
        while(true){
            System.out.print("Nhap ma: ");
            ma=sc.nextLine().toUpperCase();
            if(ma.matches(regex) && tontai(ma)==null)
                break;
        }
        System.out.print("Nhap hang san xuat: ");
        HSX=sc.nextLine();
        System.out.print("Nhap nam: ");
        nam=Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia: ");
        gia=Double.parseDouble(sc.nextLine());
        System.out.print("Nhap mau: ");
        mau=sc.nextLine();
        t=new PTGT(ma, HSX, nam, gia, mau);
        return t;
    }
    
    
        
    @Override
    public void NhapOto() {
        PTGT t=nhap();
        System.out.print("Nhap dong co: ");
        String dc=sc.nextLine();
        System.out.print("Nhap so cho ngoi: ");
        int sch=Integer.parseInt(sc.nextLine());
        list.add(new Oto(t.getMa(), t.getHSX(), t.getNam(), t.getGia(), t.getMau(), dc, sch));
    }

    @Override
    public void NhapXeMay() {
        PTGT t=nhap();
        System.out.print("Nhap so cong suat: ");
        double cs=Double.parseDouble(sc.nextLine());
        list.add(new XeMay(t.getMa(), t.getHSX(), t.getNam(), t.getGia(), t.getMau(), cs));
    }

    @Override
    public void vietDs() {
        System.out.println("---------------------DS PTGT---------------------");
        System.out.println("Oto: ");
        System.out.println("Ma\tHSX\tNam\tMau\tDc\tScn\tGia");
        for(PTGT i:list){
            if(i instanceof Oto)
                System.out.println(i);
        }
        System.out.println("Xe May:");
        System.out.println("Ma\tHSX\tNam\tMau\tCs\tGia");
        for(PTGT i:list){
            if(i instanceof XeMay)
                System.out.println(i);
        }
    }

    @Override
    public void sua() {
        System.out.print("Nhap ma xe can sua: ");
        String ma=sc.nextLine();
        PTGT t = tontai(ma);
        if(t==null)
            System.out.println("Khong tim thay");
        else{
            int pos=list.indexOf(t);
            System.out.print("Nhap hang san xuat moi: ");
            String HSX=sc.nextLine();
            System.out.print("Nhap nam moi: ");
            int nam=Integer.parseInt(sc.nextLine());
            System.out.print("Nhap gia moi: ");
            double gia=Double.parseDouble(sc.nextLine());
            System.out.print("Nhap mau moi: ");
            String mau=sc.nextLine();
            PTGT p = list.get(pos);
            p.setHSX(HSX);
            p.setNam(nam);
            p.setGia(gia);
            p.setMau(mau);
            if(t instanceof Oto){
                Oto m = (Oto) list.get(pos);
                System.out.println("Nhap so cho ngoi moi: ");
                int scn=Integer.parseInt(sc.nextLine());
                System.out.println("Nhap dong co moi: ");
                String dc=sc.nextLine();
                m.setDongco(dc);
                m.setSocho(scn);
            }
            if(t instanceof XeMay){
                XeMay m = (XeMay)list.get(pos);
                System.out.println("Nhap cong suat moi: ");
                double cs=Double.parseDouble(sc.nextLine());
                m.setCongsuat(cs);
            }
            System.out.println("sua thanh cong");
        }
    }

    @Override
    public void xoa() {
        System.out.print("Nhap ma xe can xoa: ");
        String ma=sc.nextLine();
        PTGT t = tontai(ma);
        if(t==null)
            System.out.println("khong ton tai xe");
        else{
            list.remove(t);
            System.out.println("Xoa thanh cong");
        }
    }

    @Override
    public void tkTheoMa() {
        System.out.print("Nhap ma xe can xoa: ");
        String ma=sc.nextLine();
        PTGT t = tontai(ma);
        System.out.println(t);
    }
    
    @Override
    public void tkTheoHang() {
        System.out.println("Nhap hang can tim: ");
        String hang=sc.nextLine().toLowerCase();
        boolean f=false;
        for(PTGT i:list){
            if(i.getHSX().toLowerCase().indexOf(hang)>=0){
                System.out.println(i);
                f=true;
            }
        }
        if(!f){
            System.out.println("khong tim thay");
        }
    }

    @Override
    public void tkTheoMau() {
        System.out.println("Nhap mau can tim: ");
        String mau=sc.nextLine();
        boolean f=false;
        for(PTGT i:list){
            if(i.getMau().equalsIgnoreCase(mau)){
                System.out.println(i);
                f=true;
            }
        }
        if(!f)
            System.out.println("Khong tim thay");
    }

    @Override
    public void tkTheoNam() {
        System.out.println("Tim tu nam: ");
        int n1=Integer.parseInt(sc.nextLine());
        System.out.println("Den nam: ");
        int n2=Integer.parseInt(sc.nextLine());
        boolean f=false;
        for(PTGT i:list){
            if(i.getNam()>=n1 && i.getNam()<=n2){
                System.out.println(i);
                f=true;
            }
        }
        if(!f)
            System.out.println("Khong tim thay");
    }

    @Override
    public void sxTheoMa() {
        Collections.sort(list, new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getMa().compareToIgnoreCase(o2.getMa());
            }
            
        });
    }

    @Override
    public void sxTheoNam() {
        list.sort(new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return (o1.getNam()-o2.getNam());
            }
            
        });
    }

    @Override
    public void sxTheoGia() {
        Collections.sort(list);
    }

    @Override
    public void sxTheoNamvaGia() {
        list.sort(new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                if(o1.getNam()==o2.getNam()){
                    return Double.compare(o1.getGia(), o1.getGia());
                }
                else{
                    return o1.getNam()-o2.getNam();
                }
            }
        });
    }

    @Override
    public void DemTheoMau() {
        Map<String,Long> count=
            list.stream().collect(Collectors.groupingBy(
            PTGT::getMau,Collectors.counting()));
        System.out.println(count);
    }

    @Override
    public void DemTheoNam() {
        Map<Integer,Long> count=
            list.stream().collect(Collectors.groupingBy(
            PTGT::getNam,Collectors.counting()));
        System.out.println(count);
    }

    @Override
    public void sumGiaTheoMau() {
        Map<String,Double> count=
            list.stream().collect(Collectors.groupingBy(
            PTGT::getMau, Collectors.summingDouble(PTGT::getGia)));
        System.out.println(count);
    }
    
}
