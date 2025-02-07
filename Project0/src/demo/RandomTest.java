
package demo;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(100);
        int count=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so: ");
            int m = sc.nextInt();
            count++;
            if(m==n){
                System.out.println("Bingoooooooo!");
                System.out.println("so lan nhap: "+count);
                break;
            }
            else if(m>n)
                System.out.println("Lon hon n");
            else
                System.out.println("Be hon n");
        }
    }
}
