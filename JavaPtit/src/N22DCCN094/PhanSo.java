
package N22DCCN094;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        tu=0;
        mau=1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        if(mau!=0){
            this.mau=mau;
        }else{
            mau=1;
        }
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public PhanSo nhan(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        tu=a.getTu()*b.getTu();
        mau=a.getMau()*b.getMau();
        return c;
    }
    
    public PhanSo chia(PhanSo a, PhanSo b){
        PhanSo c = new PhanSo();
        tu=a.getTu()*b.getMau();
        mau=a.getMau()*b.getTu();
        return c;
    }
    
    public void Xuat(){
        System.out.println(tu+"/"+mau);
    }
}
