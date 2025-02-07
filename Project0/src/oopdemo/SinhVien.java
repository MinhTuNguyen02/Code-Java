
package oopdemo;


public class SinhVien {
    //thuoc tinh
    private String ma;
    private String ten;
    private int tuoi;
    private boolean gt;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, int tuoi, boolean gt, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gt = gt;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    public String toString(){
        return ma+"\t"+ten+"\t"+tuoi+"\t"+(gt?"Nam":"Nu")+"\t"+diem;
    }
}
