
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThoiGian{
    private int hour;
    private int minus;
    private int second;

    public ThoiGian() {
    }

    public ThoiGian(int hour, int minus, int second) {
        this.hour = hour;
        this.minus = minus;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinus() {
        return minus;
    }

    public int getSecond() {
        return second;
    }


    public String toString(){
        return hour+" "+minus+" "+second;
    }

    
}
public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ThoiGian> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            list.add(new ThoiGian(h, m, s));
        }
        Collections.sort(list, new Comparator<ThoiGian>(){
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if(o1.getHour()==o2.getHour()){
                    if(o1.getMinus()==o2.getMinus()){
                        return o1.getSecond()-o2.getSecond();
                    }else{
                    return o1.getMinus()-o2.getMinus();
                    }
                }
                return o1.getHour()-o2.getHour();
            }
        });
        
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i));
            if(i<n-1){
                System.out.println("");
            }
        }
    }
}
