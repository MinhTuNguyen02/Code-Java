
package N22DCCN094;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class SimpleFrame extends JFrame{
    JPanel button;

    public SimpleFrame() throws HeadlessException {
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension d=kit.getScreenSize();
        int widthF=(int)d.getWidth()/3;
        int heightF=(int)d.getHeight()/3;
        setSize(widthF, heightF);
                
        JButton b1=new JButton("btnA");
        JButton b2=new JButton("btnB");
        button=new JPanel();
        button.add(b1);
        button.add(b2);
        add(button);
        
        b1.addActionListener(event -> setTitle("btnA Frame"));
        b2.addActionListener(event -> setTitle("btnB Frame"));        
    }    
}
public class N22DCCN094_EX13 {
    public static void main(String[] args) {
        SimpleFrame f=new SimpleFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationByPlatform(true);
        f.setTitle("Button Frame");
        f.setVisible(true);
    }
}
