
package oppb2;


public class test2 {
    private int num;
    private String str;
    
    static{
        System.out.println("block static");
    }
    
    {
        System.out.println("block");
    }

    public test2(String str, int num) {
        System.out.println("ctr 2p");
        this.str = str;
        this.num = num;
    }

    public test2(String str) {
        this("test2 #"+4,3);
        System.out.println("ctr 1p");
        
    }

    public test2() {
        System.out.println("ctr 0p");
    }
    
    @Override
    public String toString(){
        return str+" "+num;
    }
}
