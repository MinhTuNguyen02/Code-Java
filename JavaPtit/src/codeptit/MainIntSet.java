
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class IntSet{
    
    public static void hop(int[] a, int[] b){
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            setA.add(a[i]);
        }
        
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < b.length; i++) {
            setB.add(b[i]); 
        }

        setA.addAll(setB); 
        
        List<Integer> resultList = new ArrayList<>(setA);
        Collections.sort(resultList);
        
        for (int num : resultList) {
            System.out.print(num + " ");
        }
    }
}
public class MainIntSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        IntSet.hop(a,b);       
    }
}
