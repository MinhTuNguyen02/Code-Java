package codeptit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        File f=new File("src/codeptit/TAM.in");
        FileOutputStream fops=null;
        ObjectOutputStream oops=null;
        ArrayList<String> a=new ArrayList<>();
        a.add("Xin");
        a.add(" ");
        a.add("chao");
        a.add(",");
        a.add("-");
        a.add("toi");
        a.add(" ");
        a.add("ten");
        a.add("(");
        a.add("la");
        a.add(".");
        a.add(")");
        a.add("xin");
        a.add(" ");
        a.add("xin");
        a.add(",");
        a.add(" ");
        a.add("tu");
        a.add(" ");
        a.add("la");
        a.add(" ");
        a.add("heh");
        a.add(" ");
        a.add("xin");
        
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
