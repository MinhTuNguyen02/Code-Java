
package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainTK {
    public static void main(String[] args) {
        File f=new File("src/codeptit/TAM.in");
        FileInputStream fips=null;
        ObjectInputStream oips=null;
        try{
            fips=new FileInputStream(f);
            oips=new ObjectInputStream(fips);
            ArrayList<String> a=(ArrayList<String>)oips.readObject();
            String tmp="";
            for(String p:a){                
                tmp+=p.toLowerCase();
            }
            String[] s=tmp.split("[-!?/(),.:;]|\\s+|\n");
            
            Map<String,Integer> m=new TreeMap<>();  
            for (int i = 0; i < s.length; i++) {
                String k=s[i];
                if(k.equals("")){
                    continue;
                }
                if(m.containsKey(k)){
                    m.replace(k, m.get(k)+1);
                }else{
                    m.put(k, 1);
                }
            }
            
            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(m.entrySet());
            
            Collections.sort(wordList, (entry1, entry2) -> {
                if (entry2.getValue().equals(entry1.getValue())) {
                    return entry1.getKey().compareTo(entry2.getKey()); 
                }
                return entry2.getValue() - entry1.getValue(); 
            });

            for (Map.Entry<String, Integer> entry : wordList) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

            oips.close();
            fips.close();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
