
package codeptit;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class ThiSinh{
    private String ten;
    private String ngsinh;
    private float d1, d2, d3;

    public ThiSinh() {
    }

    public ThiSinh(String ten, String ngsinh, float d1, float d2, float d3) {
        this.ten = ten;
        this.ngsinh=ngsinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public float getTong() {
        return d1+d2+d3;
    }
    
    
    
    @Override
    public String toString() {
        return ten+" "+ngsinh+" "+getTong();
    }
    
    
}
public class MainThiSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten=sc.nextLine();
        String ngsinh=sc.nextLine();
        float d1=sc.nextFloat();
        float d2=sc.nextFloat();
        float d3=sc.nextFloat();
        ThiSinh ts=new ThiSinh(ten, ngsinh, d1, d2, d3);
        System.out.print(ts);
    }
}
