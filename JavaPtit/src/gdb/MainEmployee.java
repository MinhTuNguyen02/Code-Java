
package gdb;

import java.time.LocalDate;
import java.util.TreeMap;

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee() {
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    
    public void raiseSalary(){
        this.salary*=120/100;
    }

    @Override
    public String toString() {
        return "[name: "+name+", salary: "+salary+", hireDay: "+hireDay+"]"; 
    }
    
    
}
public class MainEmployee {
    public static void main(String[] args) {
        TreeMap<String,Employee> t=new TreeMap<>();
        t.put("1", new Employee("Harry", 90000, 2010, 10, 23));
        t.put("2", new Employee("Marry", 35200, 2011, 1, 27));
        t.put("3", new Employee("John", 122000, 2009, 6, 9));
        t.put("4", new Employee("Ben", 56000, 2012, 2, 2));
        
        t.forEach((k,v)->{
            System.out.println(k+"--"+v);
        });
        
        t.remove("2");
        System.out.println("After remove:");
        t.forEach((k,v)->{
            System.out.println(k+"--"+v);
        });
    }
}
