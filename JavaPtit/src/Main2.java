import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main2{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 

        ArrayList a=new ArrayList();
        ArrayList b=new ArrayList();
        
        for (int i = 0; i < n; i++) {
            int tmp=sc.nextInt();
            if(tmp%2==0){
                b.add(tmp);
            }else{
                a.add(tmp);
            }
        }     
        Collections.sort(a);
        Collections.sort(b);
        
        int[] rs=new int[n];
        int i=0;
        for(;i<a.size();i++){
            rs[i]=(int)a.get(i);
        }
        for(int j=0;j<b.size();j++, i++){
            rs[i]=(int)b.get(j);
        }
        
        for (int k = 0; k < n; k++) {
            System.out.print(rs[k]);
            if(k!=n-1){
                System.out.print(" ");
            }
        }
        sc.close();
    }
}