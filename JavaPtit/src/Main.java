
import java.util.Scanner;

public class Main {
    public static boolean isNarcissistic(int n){  
        if(n==0){
            return true;
        }
        int m=n;
        int d=(int)Math.floor(Math.log10(m))+1;
        System.out.println(d);
        double sum=0;
        while(m>0){
            int tmp=m%10;
            sum += Math.pow(tmp, d);
            m/=10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean tmp=isNarcissistic(n);
        System.out.print(tmp);
                
        sc.close();
    }
}
