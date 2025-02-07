
package N22DCCN094;


import java.util.Arrays;

class Animal implements Comparable<Animal>{
    private String color;

    public Animal() {
    }

    public Animal(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public String eat(){
        return "I can eat";
    }

    @Override
    public int compareTo(Animal o) {
        return this.color.compareTo(o.color);
    }
}



public class N22DCCN094_EX6 {
    public static void main(String[] args) {
        Animal[] A=new Animal[5];
        A[0] = new Animal("white");
        A[1] = new Animal("red");
        A[2] = new Animal("black");
        A[3] = new Animal("pink");
        A[4] = new Animal("green");
        
        Comparable x=new Animal();
        Arrays.sort(A);
        for(Animal i:A){
            System.out.println(i.getColor());
        }
    }
}
