
package gdb;

class Car{
    private int speed;
    private double regularPrice;
    private String color;

    public Car() {
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    
    public double getSalePrice(){
        return regularPrice;
    }

    @Override
    public String toString() {
        return getClass().getName() +"[speed: "+speed+", Price: "+getSalePrice()+", Color: "+color+"]";
    }
}

class Truck extends Car{
    private int weight;

    public Truck() {
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    
    @Override
    public double getSalePrice(){
        double p=super.getSalePrice();
        if(weight>2000){
            return p-(p*10/100);
        }
        return p-(p*20/100);
    }

    @Override
    public String toString() {
        return super.toString()+"[weight: "+weight+"]";
    }
}

class Ford extends Car{
    private int year;
    private int manufacturerDiscount;

    public Ford() {
    }

    public Ford(int year, int manufacturerDiscount, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    
    @Override
    public double getSalePrice(){
        return super.getSalePrice()-manufacturerDiscount;
    }

    @Override
    public String toString() {
        return super.toString()+"[Year: "+year+", Discount: "+manufacturerDiscount+"]";
    }
}
public class MainAuto {
    public static void main(String[] args) {
        Truck t=new Truck(500, 150, 80000, "blue");
        Ford f1=new Ford(2022, 30000, 200, 100000, "red");
        Ford f2=new Ford(2021, 20000, 210, 150000, "white");
        
        System.out.println(t);
        System.out.println(f1);
        System.out.println(f2);
    }
}
