// @author Nguyen Minh Tu - N22DCCN094
import java.util.Scanner;

public class N22DCCN094_EX3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n = sc.nextInt();
        }while(n<=0);
        
        int m = n;
        int mu = (int)(Math.ceil(Math.log10(m)));
        boolean flag=true;
        int tmp=0, test=0;
        
        for (int i = 0; i < mu; i++) {
            if(m<10){
                test=m;
            }else{
                tmp= m%((int)Math.pow(10, mu-1));
                test = (tmp*10)+(m/((int)Math.pow(10, mu-1)));
            }
            
            boolean isPrime=true;
            for (int j = 2; j <= Math.sqrt(test); j++) {
                if(test%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(!isPrime){
                flag=false;
                break;
            }
            m=test;
        }
       if(flag){
           System.out.println("This is a circular prime");
       }
       else{
           System.out.println("This is not a circular prime");
       }
       sc.close();
    }
}
