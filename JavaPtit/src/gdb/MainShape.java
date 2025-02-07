
package gdb;

class Shape{
    private String color="red";
    private boolean filled=true;

    public Shape() {
    }
    
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return getClass().getName()+"[color: "+color+", filled: "+filled+"]";
    }
}

class Circle extends Shape{
    private double radius=1.0;

    public Circle() {
    }
    
    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    public double getPerimeter(){
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return super.toString()+"[radius: "+radius+"]";
    }
}

class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;

    public Rectangle() {
    }
    
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width*length;
    }
    
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return super.toString()+"[width: "+width+", length: "+length+"]";
    }
}

class Square extends Rectangle{

    public Square() {
    }
    
    public Square(double side){
        setWidth(side);
        setLength(side);
    }
    
    public Square(double side, String color, boolean filled){
        setWidth(side);
        setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString()+"[Side: "+getSide()+"]";
    }
}
public class MainShape {
    public static void main(String[] args) {
        Shape c1=new Circle(2, "blue", true);
        Circle c2=new Circle(3.1, "white", false);
        Rectangle r=new Rectangle(4, 5, "black", true);
        Square s=new Square(4.5, "green", false);
        
        System.out.println(c1);        
        System.out.println(c2);
        System.out.println("Area: "+c2.getArea()+" Perimeter: "+c2.getPerimeter());
        System.out.println(r);
        System.out.println("Area: "+r.getArea()+" Perimeter: "+r.getPerimeter());
        System.out.println(s);
        System.out.println("Area: "+s.getArea()+" Perimeter: "+s.getPerimeter());
    }
}
