
package quanlytailieu;


public class TaiLieu {
    private String matl;
    private String nhasx;
    private int sobph;

    public TaiLieu() {
    }

    public TaiLieu(String matl, String nhasx, int sobph) {
        this.matl = matl;
        this.nhasx = nhasx;
        this.sobph = sobph;
    }

    public String getMatl() {
        return matl;
    }

    public void setMatl(String matl) {
        this.matl = matl;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }

    public int getSobph() {
        return sobph;
    }

    public void setSobph(int sobph) {
        this.sobph = sobph;
    }
    
    public String toString(){
        return matl+"\t"+nhasx+"\t"+sobph;
    }
}
