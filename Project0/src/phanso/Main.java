
package phanso;


public class Main {
    public static void main(String[] args) {
        PhanSo p1=new PhanSo(5,6);
        p1.inPs();
        PhanSo p2=new PhanSo(6,5);
        p2.inPs();
        PhanSo p3= p1.tong(p2);
        p3.inPs();
        p3= p1.hieu(p2);
        p3.inPs();
        p3= p1.tich(p2);
        p3.inPs();
        p3= p1.thuong(p2);
        p3.inPs();
    }
}
