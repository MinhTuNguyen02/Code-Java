
package demo;

import java.util.Scanner;

public class ChuoiKiTu {
    private static boolean ktraMa(String ma){
        String reg = "^[Nn]{1}\\d{2}[A-Za-z]{4}\\d{3}$";
        if(ma.matches(reg))
            return true;
        else
            return false;
    }
    private static boolean ktraSo(String so){
        String reg = "^\\(?\\+\\d{2}\\)?-?\\d{9}$";
        if(so.matches(reg))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String st= "ngay    34    thang    2  ngay 88  cay   66".trim();
//        System.out.println(st);
//        String[] so = st.split("[\\sa-zA-Z]+");
//        for(String i:so){
//            System.out.println(i);
//        }
//        String ma, so;
//        do{
//            System.out.print("Nhap ma sinh vien: ");
//            ma = sc.nextLine();
//            System.out.print("Nhap so dien thoai: ");
//            so = sc.nextLine();
//            if(ktraMa(ma)==false)
//                System.err.println("Nhap lai MSSV!!");
//            else if(ktraSo(so)==false)
//                System.err.println("Nhap lai SDT!!");
//            else
//                break;
//        }while(true);
//        System.out.println("MSSV cua ban la: " + ma.toUpperCase());
//        System.out.println("So dt cua ban la: " + so);
        
        String ten = "hom   nay 29  thang   6 nam   2024   troi mua  buoi       sang";
//        String t1 = "nguyen minh tu";
//        String t2 = "Nguyen M";
//        String t3 = "Nguyen Minh Tu hoc PTIT";
//        String t4 = " hoc PTIT";
//        
//        System.out.println(ten.compareTo(t1));
//        System.out.println(ten.compareTo(t2));
//        System.out.println(ten.compareToIgnoreCase(t1));
//        System.out.println(ten.compareTo(t3));
//        System.out.println(ten.concat(t4));
//        System.out.println(t3.equals(ten.concat(t4)));
//        System.out.println(ten.indexOf("M"));
//        System.out.println(ten.indexOf("nh"));
//        System.out.println(ten.lastIndexOf("n"));

        String[] cau = ten.split("[a-zA-Z\\s]+");
        for(String i:cau){
            if(i!=null){
                System.out.println(i);
            }
        }
        
        
        
    }
}
