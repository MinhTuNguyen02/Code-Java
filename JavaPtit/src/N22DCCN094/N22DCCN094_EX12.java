
package N22DCCN094;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class N22DCCN094_EX12 extends JFrame{
    public static void main(String[] args) {
        JFrame f=new JFrame();
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension d=kit.getScreenSize();
        int widthF=(int)d.getWidth()/3;
        int heightF=(int)d.getHeight()/3;
        f.setSize(widthF, heightF);
        f.setTitle("D22CQCN02");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationByPlatform(true);
        f.setVisible(true);
    }
}
