
package phanso;

import java.util.Scanner;

public class PhanSo {
    private int tu, mau;
    
    public PhanSo(){
    }
    
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    
    public void nhapPs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tu = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap mau so: ");
        mau = Integer.parseInt(sc.nextLine());
    }
    
    public void inPs(){
        if(tu==0)
            System.out.println("0");
        else if(tu%mau==0)
            System.out.println(tu/mau);
        else
            System.out.println(tu+"/"+mau);
    }
    
    private int UCLN(){
        int a=Math.abs(tu), b=Math.abs(mau);
        while(a>0){
            if(a<b){
                int t=a;
                a=b;
                b=t;
            }else
                a=a%b;
        }
        return b;
    }
    
    private void rutGon(){
        int u=UCLN();
        tu/=u;
        mau/=u;
        if(tu*mau>0){
            tu=Math.abs(tu);
            mau=Math.abs(mau);
        }
    }
    
    public PhanSo tong(PhanSo b){
        PhanSo kq=new PhanSo();
        kq.tu = (tu*b.getMau())+(b.getTu()*mau);
        kq.mau = mau*b.getMau();
        kq.rutGon();
        return kq;
    }
    
    public PhanSo hieu(PhanSo b){
        PhanSo kq=new PhanSo();
        kq.tu = (tu*b.getMau())-(b.getTu()*mau);
        kq.mau = mau*b.getMau();
        kq.rutGon();
        return kq;
    }
    
    public PhanSo tich(PhanSo b){
        PhanSo kq=new PhanSo();
        kq.tu = tu*b.getTu();
        kq.mau = mau*b.getMau();
        kq.rutGon();
        return kq;
    }
    
    public PhanSo thuong(PhanSo b){
        PhanSo kq=new PhanSo();
        kq.tu = tu*b.getMau();
        kq.mau = mau*b.getTu();
        kq.rutGon();
        return kq;
    }
}
