
package quanliptgt;


public class XeMay extends PTGT implements TinhGia{
    public double congsuat;

    public XeMay() {
    }

    public XeMay(String ma, String HSX, int nam, double gia, String mau, double congsuat) {
        super(ma, HSX, nam, gia, mau);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }
    
    @Override
    public double getGia() {
        double t=super.getGia();
        if(2024-super.getNam()>=2)
            t*=0.95;
        return t;
    }
    
    @Override
    public String toString(){
        return getMa()+"\t"+getHSX()+"\t"+getNam()+"\t"+getMau()+"\t"+congsuat+
                "\t"+getGia();
    }
}
