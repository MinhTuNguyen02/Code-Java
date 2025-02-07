
package gdb;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class NegativeNumberException extends Exception{
    public NegativeNumberException() {
    }
    public NegativeNumberException(String s){
        super(s);
    }
}

public class MainE2 {
    public static int sumOfNumbers(ArrayList a) throws NegativeNumberException{
        int sum=0;
        for (int i = 0; i < a.size(); i++) {
            if((int)a.get(i)<0){
                throw new NegativeNumberException();
            }else{
                sum+=(int)a.get(i);
            }
        }
        return sum;    
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList a=new ArrayList();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp=sc.nextInt();
            a.add(tmp);
        }
        try {
            int sum=sumOfNumbers(a);
            System.out.println(sum);
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }
    }
}
