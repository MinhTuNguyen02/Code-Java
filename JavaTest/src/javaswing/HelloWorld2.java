
package javaswing;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class HelloWorld2 extends JFrame{

    public HelloWorld2() throws HeadlessException {
        setSize(400, 400);
        setTitle("Chaoooo!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HelloWorld2();
    }
    
}
