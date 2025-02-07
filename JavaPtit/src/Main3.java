import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void findPrimeSums(int n) {
        ArrayList<String> list=new ArrayList<>();
        for (int i = n; i >= n/2; i--) {
            if (isPrime(i) && isPrime(n - i)) {
                list.add(i+"+"+(n-i));
            }
        }
        System.out.print(String.join(", ", list));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        findPrimeSums(n);
        
        sc.close();
    }
}

