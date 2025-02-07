
package codeptit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    private String ten;
    private String ngaySinh;

    public Person() {
    }

    public Person(String ten, String ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }
    public String getNgaysinh(){
        return ngaySinh;
    }
    @Override
    public String toString() {
        return ten;
    }
}
public class MainP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String o=sc.nextLine();
        ArrayList<Person> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String tmp=sc.nextLine();
            String[] a=tmp.split("\\s");
            Person p=new Person(a[0], a[1]);
            list.add(p);
        }
        list.sort(new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                String[] s1=o1.getNgaysinh().split("/");
                String[] s2=o2.getNgaysinh().split("/");
                if(s2[2].equals(s1[2])){
                    if(s2[1].equals(s1[1])){
                        return s2[0].compareTo(s1[0]);
                    }else{
                        return s2[1].compareTo(s1[1]);
                    }
                }else{
                    return s2[2].compareTo(s1[2]);
                }
            }            
        });
        System.out.println(list.get(0));
        System.out.print(list.get(list.size()-1));
    }
}
