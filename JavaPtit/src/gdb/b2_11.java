
interface Drawable{
    String draw();
}
class Circle implements Drawable{
    @Override
    public String draw() {
        return "Circle";
    }
}
class Rectangle implements Drawable{
    @Override
    public String draw() {
        return "Rectangle";
    }
}
class Triangle implements Drawable{
    @Override
    public String draw() {
        return "Triangle";
    }
}
public class b2_11 {
    public static void main(String[] args) {
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        
        System.out.println(c.draw());      
        System.out.println(r.draw());
        System.out.println(t.draw());
    }
}
