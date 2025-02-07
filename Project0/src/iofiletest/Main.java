
package iofiletest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String filename="src/iofiletest/sv.txt";
        List<SinhVien> list=new ArrayList<>();
        try{
            BufferedReader br=new BufferedReader(new FileReader(filename));
            String line="";
            while((line=br.readLine())!=null){
                String[] s=line.split("\\:\\s*");
                SinhVien sv= new SinhVien(Integer.parseInt(s[0]),s[1]);
                list.add(sv);
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("DS sv");
        for(SinhVien i:list){
            System.out.println(i);
        }
        
        String fout="src//iofiletest/out.dat";
        try{
            PrintWriter pw=new PrintWriter(fout);
            pw.println(list);
            pw.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
    }
}
