package codeptit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        File f=new File("src/codeptit/DATA1.in");
        FileOutputStream fops=null;
        ObjectOutputStream oops=null;
        ArrayList<Integer> a=new ArrayList<>();
        a.add(7);
        a.add(2);
        a.add(7);
        a.add(997);
        a.add(7);
        a.add(7);
        a.add(2);
        a.add(7);
        a.add(7);
        a.add(2);
        a.add(7);
        a.add(2);
        a.add(997);
        a.add(7);
        a.add(7);
        a.add(997);
        a.add(7);
        a.add(997);
        a.add(7);
        a.add(7);
        a.add(7);
        a.add(45);
        a.add(7);
        a.add(7);
        a.add(997);
        a.add(997);
        a.add(997);
        a.add(997);
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
