
package quanliptgt;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        QLPTGT l=new QLPTGT(); 
        while(true){
            System.out.println("---------------------------------------------");
            System.out.println("0. Thoat.");
            System.out.println("1. Nhap Oto.");
            System.out.println("2. Nhap xe may.");
            System.out.println("3. Viet ds.");
            System.out.println("4. Sua.");
            System.out.println("5. Xoa.");
            System.out.println("6. Tim kiem theo ma.");
            System.out.println("7. Tim kiem theo nam.");
            System.out.println("8. Tim kiem theo hang.");
            System.out.println("9. Tim kiem theo mau.");
            System.out.println("10. Sap xep theo ma.");
            System.out.println("11. Sap xep theo nam.");
            System.out.println("12. Sap xep theo gia.");
            System.out.println("13. Sap xep theo nam va gia.");
            System.out.println("14. Dem theo mau.");
            System.out.println("15. Dem theo nam.");
            System.out.println("16. Tong gia theo mau");
            System.out.println("---------------------------------------------");
            Scanner sc=new Scanner(System.in);
            int chon;
            
            System.out.print("Nhap lua chon cua ban: ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:
                    System.out.println("Chao tam biet!!!");
                    System.exit(0);
                case 1: l.NhapOto();
                    break;
                case 2: l.NhapXeMay();
                    break;
                case 3: l.vietDs();
                    break;
                case 4:l.sua();
                    break;
                case 5:l.xoa();
                    break;
                case 6:l.tkTheoMa();
                    break;
                case 7:l.tkTheoNam();
                    break;
                case 8:l.tkTheoHang();
                    break;
                case 9:l.tkTheoMau();
                    break;
                case 10:l.sxTheoMa();l.vietDs();
                    break;
                case 11:l.sxTheoNam();l.vietDs();
                    break;
                case 12: l.sxTheoGia();l.vietDs();
                    break;
                case 13:l.sxTheoNamvaGia();l.vietDs();
                    break;
                case 14:l.DemTheoMau();
                    break;
                case 15:l.DemTheoNam();
                    break;
                case 16: l.sumGiaTheoMau();
                    break;
                default:System.err.println("Nhap tu 1->9");
                    break;
            }
            
        }
    }
}
