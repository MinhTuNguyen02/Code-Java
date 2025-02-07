
package gdb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{
    private String title;
    private String author;
    private String publisher;
    private double cost;

    public Book() {
    }

    public Book(String title, String author, String publisher, double cost) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.cost = cost;
    }
    
    public void write(){
        File f=new File("src/gdb/text.txt");
        FileOutputStream fops=null;
        ObjectOutputStream oops=null;
        try{
            fops=new FileOutputStream(f);
            oops=new ObjectOutputStream(fops);
            oops.writeObject(new Book(title, author, publisher, cost));
        }catch(IOException e){
            System.out.println(e);
        }finally{
            try {
                if(fops!=null){
                    fops.close();
                }
                if(oops!=null){
                    oops.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
    
    public Book read(){
        File f=new File("src/gdb/text.txt");
        FileInputStream fips=null;
        ObjectInputStream oips=null;
        try{
            fips=new FileInputStream(f);
            oips=new ObjectInputStream(fips);
            Book b =(Book)oips.readObject();
            return b;
        }catch(ClassNotFoundException | IOException e){
            System.out.println(e);
        }finally{
            try{
                if(fips!=null){
                    fips.close();
                }
                if(oips!=null){
                    oips.close();
                }
            }catch(IOException e){
                System.out.println(e);
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return getClass().getName()+"[title: "+title+", author: "+author+
                ", publisher: "+publisher+", cost: "+cost+"]";
    }  
}
public class MainBook {
    public static void main(String[] args) {
        Book b1=new Book("Toan", "Minh Tu", "Kim Dong", 65000);
        b1.write();
        Book b2=new Book();
        b2=b2.read();
        System.out.println(b1);
        System.out.println(b2);
    }
}
