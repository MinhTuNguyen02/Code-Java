
package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SoKhacNhau3 {
    public static boolean IsPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void delNonPrime(ArrayList<Integer> a){
        a.removeIf(b -> !IsPrime(b));
    }
    public static void main(String[] args) {
        File f1=new File("src/codeptit/DATA1.in");
        File f2=new File("src/codeptit/DATA2.in");

        try{
            FileInputStream fips=new FileInputStream(f1);
            ObjectInputStream oips=new ObjectInputStream(fips);
            ArrayList<Integer> a=(ArrayList<Integer>)oips.readObject();
            delNonPrime(a);     
            Map<Integer,Integer> m=new TreeMap<>();
            for(Integer i:a){
                if(m.containsKey(i)){
                    m.replace(i, m.get(i)+1);
                }else{
                    m.put(i, 1);
                }
            }    
            
            fips = new FileInputStream(f2);
            oips=new ObjectInputStream(fips);
            ArrayList<Integer> b=(ArrayList<Integer>)oips.readObject();
            delNonPrime(b);
            
            Map<Integer,Integer> m2=new TreeMap<>();
            for(Integer i:b){
                if(m2.containsKey(i)){
                    m2.replace(i, m2.get(i)+1);
                }else{
                    m2.put(i, 1);
                }
            }     
            
            
            
            Set<Integer> A=new TreeSet<>();
            Set<Integer> B=new TreeSet<>();
            A.addAll(a);B.addAll(b);
            A.addAll(B);
            
            for(Integer i:A){
                int s1=0, s2=0;
                if(m.containsKey(i)){
                    s1=m.get(i);
                }
                if(m2.containsKey(i)){
                    s2=m2.get(i);
                }
                System.out.println(i+" "+s1+" "+s2);
            }
            oips.close();
            fips.close();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
