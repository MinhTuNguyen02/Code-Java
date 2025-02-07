
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class HangHoa{
    private static int stt=1;
    private int ma;
    private String ten;
    private String nhom;
    private double giaMua;
    private double giaBan;

    public HangHoa() {
    }

    public HangHoa(String ten, String nhom, double giaMua, double giaBan) {
        this.ma=stt;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        stt++;
    }

    public double getLoiNhuan(){
        return giaBan-giaMua;
    }
    @Override
    public String toString() {
        String l=String.format("%1.2f", getLoiNhuan());
        return ma+" "+ten+" "+nhom+" "+l;
    }
}
public class MainMer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        ArrayList<HangHoa> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp=sc.nextLine();
            String ten=sc.nextLine();
            String nhom=sc.nextLine();
            double giaMua=sc.nextDouble();
            double giaBan=sc.nextDouble();
            HangHoa h=new HangHoa(ten, nhom, giaMua, giaBan);
            list.add(h);
        }
        list.sort(new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                return Double.compare(o2.getLoiNhuan(), o1.getLoiNhuan());
            }            
        });
        for(HangHoa a:list){
            System.out.println(a);
        }
    }
}
