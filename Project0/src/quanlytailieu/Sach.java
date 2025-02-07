
package quanlytailieu;


public class Sach extends TaiLieu{
    private String tentg;
    private String tensach;
    private int sotrang;

    public Sach() {
    }

    public Sach(String matl,String tensach, String tentg, int sotrang, String nhasx, int sobph) {
        super(matl, nhasx, sobph);
        this.tentg = tentg;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    
}
