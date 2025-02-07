
package gdb;

import java.util.Scanner;

class NoVowelsException extends Exception{
    public NoVowelsException() {
    }
    public NoVowelsException(String s){
        super(s);
    }
}
public class MainE {
    public static int countVowels(String s) throws NoVowelsException {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i, i+1).equals("-")){
                count++;
            }
        }
        if(count==0){
            throw new NoVowelsException();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        try {
            int count=countVowels(s);
            System.out.println(count);
        } catch (NoVowelsException e) {
            System.out.println(e);
        }
    }
}
