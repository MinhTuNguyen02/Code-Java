
package gdb;

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    public String toString(){
        return getClass().getName()+"("+x+","+y+")";
    }
}

class LineSub extends Point{
    private Point end;
    public LineSub(double beginX, double beginY, double endX, double endY){
        super(beginX,beginY);
        end=new Point(endX,endY);
    }
    public LineSub(Point begin, Point end){
        super(begin.getX(),begin.getY());
        this.end=end;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    
    public double getLength(){
        return Math.sqrt((Math.pow(end.getX()-this.getX(), 2)+
                (Math.pow(end.getY()-this.getY(), 2))));
    }

    @Override
    public String toString() {
        return getClass().getName()+"("+this.getX()+","+this.getY()+")("
                +end.getX()+","+end.getY()+")";
    }
}
public class MainLaP {
    public static void main(String[] args) {
        Point p1=new Point(6, 12);
        Point p2=new Point(6, -2);
        LineSub l1=new LineSub(2, 5, 2, -6);
        LineSub l2=new LineSub(p1, p2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("Do dai line1: "+l1.getLength());
    }
}
