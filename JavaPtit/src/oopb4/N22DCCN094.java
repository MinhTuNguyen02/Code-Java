
package oopb4;

class Animal{
    private String color;

    public Animal() {
    }

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public String eat(){
        return "I can eat";
    }
}

class Dog extends Animal{
    private String owner;

    public Dog(String owner, String color) {
        super(color);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
    public String eat(){
        return "Eat rice + meat";
    }
     
    public String bark(){
        return "I can bark";
    } 
}

class Lion extends Animal{
    private String jungle;

    public Lion(String jungle, String color) {
        super(color);
        this.jungle = jungle;
    }

    public String getJungle() {
        return jungle;
    }
    
    public String eat(){
        return "Only eat raw meal";
    }
    
    public String roar(){
        return "I can roar";
    }
    
}

public class N22DCCN094 {
    public static void main(String[] args) {
        Animal[] A=new Animal[3];
        A[0] = new Animal("Red");
        A[1] = new Dog("Tu","Back");
        A[2] = new Lion("ABC","Yellow");
        
        for(Animal i:A){
            System.out.println(i.getColor());
            System.out.println(i.eat());
        }
    }
}
