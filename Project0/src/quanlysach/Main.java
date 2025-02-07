
package quanlysach;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       DSSach l=null;
        while(true){
            System.out.println("---------------------MENU--------------------");
            System.out.println("0. Thoat.");
            System.out.println("1. Nhap so sach toi da.");
            System.out.println("2. Nhap sach.");
            System.out.println("3. Xem danh sach.");
            System.out.println("4. Tim sach.");
            
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
                    l = new DSSach();
                    break;
                case 2:
                    l.nhapSach();
                    break;
                case 3:
                    l.xemDS();
                    break;
                case 4:
                    l.timKiem();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.err.println("Nhap lua chon 0->9!!");
                    break;
            }
            
        }
    }
}
