
package gdb;

interface Flyable{
    String fly();
}
class Spacecraft implements Flyable{
    @Override
    public String fly() {
        return "Spacecraft";
    }
}
class Airplane implements Flyable{
    @Override
    public String fly() {
        return "Airplane";
    }
}
class Helicopter implements Flyable{
    @Override
    public String fly() {
        return "Helicopter";
    }
}
public class b2_10 {
    public static void main(String[] args) {
        Spacecraft s=new Spacecraft();
        Airplane a=new Airplane();
        Helicopter h=new Helicopter();
        
        System.out.println(s.fly());      
        System.out.println(a.fly());
        System.out.println(h.fly());
    }
}
