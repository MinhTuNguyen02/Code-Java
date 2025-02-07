package codeptit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        File f=new File("src/codeptit/DATA2.in");
        FileOutputStream fops=null;
        ObjectOutputStream oops=null;
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(2);
        a.add(7);
        a.add(7);
        a.add(2);
        a.add(7);
        a.add(2);
        a.add(7);
        a.add(2);
        a.add(56);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(35);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(997);
        a.add(2);
        a.add(14);
        a.add(2);
        a.add(72);
        a.add(2);
        a.add(35);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(12);
        a.add(2);
        a.add(2);
        try{
            fops =new FileOutputStream(f);
            oops =new ObjectOutputStream(fops);
            oops.writeObject(a);
            
            fops.close();
            oops.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
