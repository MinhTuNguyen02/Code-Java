
package quanliptgt;


public class PTGT implements Comparable<PTGT>{
    private String ma;
    private String HSX;
    private int nam;
    private double gia;
    private String mau;

    public PTGT() {
    }

    public PTGT(String ma, String HSX, int nam, double gia, String mau) {
        this.ma = ma;
        this.HSX = HSX;
        this.nam = nam;
        this.gia = gia;
        this.mau = mau;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHSX() {
        return HSX;
    }

    public void setHSX(String HSX) {
        this.HSX = HSX;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public int compareTo(PTGT o) {
        //return ma.compareToIgnoreCase(o.getMa());
        //return (nam-o.getNam());
//        if(gia>o.getGia())
//            return 1;
//        else if(gia==o.getGia())
//            return 0;
//            else
//                return -1;
        return Double.compare(gia, o.getGia());
    }
    
    
}
