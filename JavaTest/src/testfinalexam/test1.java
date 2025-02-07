
package testfinalexam;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

class fr extends JFrame{
    private JPanel comboP;
    private JPanel sliderP;
    private JPanel lableP;
    private JLabel label;
    private JComboBox combx;
    private JSlider sli;
    public fr(){
        setLocationByPlatform(true);
        setSize(500,300);
        
        
        comboP = new JPanel();
        sliderP = new JPanel();
        lableP = new JPanel();
        label = new JLabel("Xin Chao Cac Ban");
        label.setFont(new Font("Time new roman",Font.BOLD,24));   
        lableP.add(label);
        add(lableP,BorderLayout.CENTER);
        
        combx = new JComboBox();
        combx.addItem("Serif");
        combx.addItem("Time new roman");
        combx.addItem("Dialog");
        combx.addItem("Monospaced");
        combx.addActionListener(event -> label.setFont(new Font
        ((String) combx.getItemAt(combx.getSelectedIndex()),Font.BOLD,sli.getValue())));
        comboP.add(combx);
        add(comboP,BorderLayout.NORTH);
        
        sli = new JSlider(10, 40);        
        sli.addChangeListener(l -> label.setFont((new Font
        ((String) combx.getItemAt(combx.getSelectedIndex()),Font.BOLD,sli.getValue()))));
        sliderP.add(sli);
        add(sliderP,BorderLayout.SOUTH);       
        
    }
    

    
}

public class test1 {
    public static void main(String[] args) {
        fr f = new fr();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
