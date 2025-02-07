
package N22DCCN094;

import java.util.Set;
import java.util.TreeMap;


public class N22DCCN094_EX11 {
    public static void main(String[] args) {
        TreeMap<String,String> treeMapStudents=new TreeMap<>();
        treeMapStudents.put("N22DCCN001", "Nguyen Van A");
        treeMapStudents.put("N22DCCN002", "Tran Minh B");
        treeMapStudents.put("N22DCCN004", "Duong Hoang D");
        treeMapStudents.put("N22DCCN003", "Vo Thi C");
        treeMapStudents.put("N22DCCN005", "Nguyen Minh E");
                
        Set keys=treeMapStudents.keySet();
        System.out.println("All keys:");
        for(Object key:keys){
            System.out.print(key+" ");
        }
        System.out.println("\nAll values:");
        treeMapStudents.forEach((k,v)->
        {
            System.out.println(k+": "+v);
        });
        
        System.out.println("First key: "+treeMapStudents.firstKey());
        System.out.println("Last key: "+treeMapStudents.lastKey());
    }
}
