
package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ten, dchi, truong;
        int tuoi;
        double diem;
        
        System.out.print("Nhap ten: ");
        ten = in.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = Integer.parseInt(in.nextLine());
        System.out.print("Nhap diem: ");
        diem = Double.parseDouble(in.nextLine());
        System.out.print("Nhap dia chi: ");
        dchi = in.nextLine();
        System.out.print("Nhap truong: ");
        truong = in.next();
        
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Diem: "+diem);
        System.out.println("Dia chi: " + dchi);
        System.out.println("Truong: " + truong);
    }
}
