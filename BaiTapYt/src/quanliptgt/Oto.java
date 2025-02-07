
package quanliptgt;


public class Oto extends PTGT implements TinhGia{
    public String dongco;
    public int socho;

    public Oto() {
    }

    public Oto(String ma, String HSX, int nam, double gia, String mau, String dongco, int socho) {
        super(ma, HSX, nam, gia, mau);
        this.dongco = dongco;
        this.socho = socho;
    }

    public String getDongco() {
        return dongco;
    }

    public void setDongco(String dongco) {
        this.dongco = dongco;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    
    
    @Override
    public double getGia() {
        double t=super.getGia();
        if(2024-super.getNam()>=2)
            t*=0.85;
        return t;
    }
    
    @Override
    public String toString(){
        return getMa()+"\t"+getHSX()+"\t"+getNam()+"\t"+getMau()+"\t"+dongco+
                "\t"+socho+"\t"+getGia();
    }
}
