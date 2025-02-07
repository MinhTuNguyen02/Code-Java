
package N22DCCN094;

import java.util.ArrayList;

class Animal {
    private String color;

    public Animal() {
    }

    public Animal(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String eat(){
        return "I can eat";
    }
    
    @Override
    public String toString(){
        return getClass().getName() + "[color: " +color+"]";
//        return "color: " + color;
    }
}

public class N22DCCN094_EX7 {
    public static void main(String[] args) {
        ArrayList<Animal> A=new ArrayList<>();
        A.add(new Animal("white"));
        A.add(new Animal("red"));
        A.add(new Animal("black"));
        A.add(new Animal("yellow"));
        A.add(new Animal("green"));
        
        System.out.println("The first animal:");
        System.out.println(A.get(0).toString());     
        
        A.get(A.size()-1).setColor("unknown");
        
        A.add(new Animal("mixed"));
        
        System.out.println("All animals:");
        for(Animal i:A){
            System.out.println(i.toString());
        }
    }
}
