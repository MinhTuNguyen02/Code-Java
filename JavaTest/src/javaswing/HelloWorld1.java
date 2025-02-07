
package javaswing;

import javax.swing.JFrame;


public class HelloWorld1 {
    
    public HelloWorld1() {
        JFrame frame=new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("xin chao!");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new HelloWorld1();
    }
   
}
