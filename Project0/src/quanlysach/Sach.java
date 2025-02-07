
package quanlysach;


public class Sach {
    private String ma;
    private String ten;
    private String tgia;
    private boolean tviet;
    private double gia;
    private int sl;

    public Sach() {
    }

    public Sach(String ma, String ten, String tgia, boolean tviet, double gia, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.tgia = tgia;
        this.tviet = tviet;
        this.gia = gia;
        this.sl = sl;
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

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public boolean isTviet() {
        return tviet;
    }

    public void setTviet(boolean tviet) {
        this.tviet = tviet;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public double getTongTien(){
        return (sl*gia);
    }
    
    public String toString(){
        return ma+" "+ten+" "+tgia+" "+(tviet?"Tieng Viet":"Nuoc ngoai")+" "+getTongTien();
    }
}
