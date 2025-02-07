
package quanlysach;

import java.util.Scanner;

public class DSSach {
    private Sach[] ds;
    private int slht;
    private Scanner sc;

    public DSSach() {
        sc = new Scanner(System.in);
        System.out.print("Nhap so sach toi da trong danh sach: ");
        int n=Integer.parseInt(sc.nextLine());
        ds = new Sach[n];
        slht=0;
        ds[slht++] = new Sach("N1234", "zzz", "xxx", true, 12, 12);
        ds[slht++] = new Sach("N1245", "zaq", "xmf", false, 2, 27);
        ds[slht++] = new Sach("N6244", "kil", "nhj", false, 62, 2);
        ds[slht++] = new Sach("N8232", "mnz", "xah", true, 18, 6);
    }
    
    public Sach tontaiSach(String ma){
        int i;
        for (i = 0; i < slht; i++) {
            if(ma.equalsIgnoreCase(ds[i].getMa()))
                return ds[i];
        }
        return null;
    }
    
    @SuppressWarnings("empty-statement")
    public void timKiem(){
        System.out.print("Nhap ma sach can tim: ");
        String ma=sc.nextLine();
        Sach s = tontaiSach(ma);
        if(s==null)
            System.out.println("Khong co sach");
        else
            System.out.println(s);
    }
    
    public void nhapSach(){
        String ma, ten, tgia;
        boolean tviet;
        double gia;
        int sl;
        
        while(true){
            System.out.print("Nhap ma sach: ");
            ma=sc.nextLine().toUpperCase();
            String regex = "^N\\d{4}";
            if(ma.matches(regex) && tontaiSach(ma)==null)
                break;
        }
        System.out.print("Nhap ten sach: ");
        ten=sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tgia=sc.nextLine();
        while(true){
            System.out.print("Ngon ngu (true/false): ");
            String t;
            t=sc.nextLine();
            if(t.equalsIgnoreCase("true") || t.equalsIgnoreCase("false")){
                tviet=Boolean.parseBoolean(t);
                break;
            } 
        }
        System.out.print("Nhap gia: ");
        gia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        sl = Integer.parseInt(sc.nextLine());
        ds[slht++] = new Sach(ma, ten, tgia, tviet, gia, sl);
    }
    
    public void xemDS(){
        System.out.println("Danh Sach:");
        for (int i = 0; i < slht; i++) {
            System.out.println(ds[i]);
        }
    }
}
