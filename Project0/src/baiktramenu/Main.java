
package baiktramenu;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SoNguyen n = null;
        Xau st = null;
        MaTranVuong mtr = null;
        while(true){
            System.out.println("---------------------------------------------");
            System.out.println("0. Thoat.");
            System.out.println("1. Nhap vao so nguyen duong n.");
            System.out.println("2. Viet ra tong 1+2+3+...+n.");
            System.out.println("3. Day so nguyen to <= n.");
            System.out.println("4. Nhap vao 1 xau.");
            System.out.println("5. Do dai xau.");
            System.out.println("6. So cau cua xau.");
            System.out.println("7. Nhap vao 1 ma tran vuong A.");
            System.out.println("8. Dua ra tong cac hang cua ma tran.");
            System.out.println("9. Tinh dinh thuc ma tran A.");
            System.out.println("---------------------------------------------");
            Scanner sc=new Scanner(System.in);
            int chon;
            
            System.out.print("Nhap lua chon cua ban: ");
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:
                    System.out.println("Chao tam biet!!!");
                    System.exit(0);
                case 1: 
                    n = new SoNguyen();
                    break;
                case 2:
                    n.tong();
                    break;
                case 3:
                    n.inSNT();
                    break;
                case 4:
                    st = new Xau();
                    break;
                case 5:
                    st.doDai();
                    break;
                case 6:
                    st.soCau();
                    break;
                case 7:
                    mtr = new MaTranVuong();
                    break;
                case 8:
                    mtr.tongHang();
                    break;
                case 9:
                    System.out.println("Dinh thuc ma tran vuong A: " + mtr.dinhThuc());
                    break;
                default:
                    System.err.println("Nhap lua chon 0->9!!");
                    break;
            }
            
        }
        
    }
}
