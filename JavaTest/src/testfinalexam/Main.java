
package testfinalexam;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


class SpFrame extends JFrame{
    private static final int w = 500;
    private static final int h = 300;
    private JPanel toppanel;
    private JPanel centralpanel;
    private JPanel botpanel;
//    private JPanel buttonPanel1;
//    private JPanel buttonPanel2;
//    private JPanel labelPanle;
//    private JPanel panel;

    public SpFrame(){
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        int width = (int) d.getWidth()/2;
        int height = (int) d.getHeight()/2;
        setSize(width,height);
        setTitle("Chao");
        setLocationByPlatform(true);
        
        JLabel l = new JLabel("Chao mung cac ban den voi hoc vien hoang gia");
        l.setFont(new Font("Time new roman", Font.BOLD, 24));
        add(l, BorderLayout.CENTER);
        JCheckBox c1 = new JCheckBox("Bold");
        JCheckBox c2 = new JCheckBox("Italic");
        ActionListener atl = event -> {
            int mode =0;
            if(c1.isSelected()){
                mode += Font.BOLD;
            }           
            if(c2.isSelected()){
                mode += Font.ITALIC;
            }
            l.setFont(new Font("Time new roman",mode,24));
        };
                
        JPanel checkPanel = new JPanel();
        c1.addActionListener(atl);
        c2.addActionListener(atl);
        checkPanel.add(c1);
        checkPanel.add(c2);
        add(checkPanel,BorderLayout.SOUTH);
        
        
        
        
//        toppanel = new JPanel();
//        toppanel.setLayout(new GridLayout(2,2));
//        JLabel name = new JLabel("User name:",SwingConstants.RIGHT);
//        JLabel pass = new JLabel("Password:", SwingConstants.RIGHT);
//        JTextField n = new JTextField();
//        JPasswordField p = new JPasswordField();
//        toppanel.add(name); toppanel.add(n);
//        toppanel.add(pass); toppanel.add(p);
//        add(toppanel, BorderLayout.NORTH);
//        
//        JTextArea ta = new JTextArea(8,30);
//        JScrollPane sp = new JScrollPane(ta);
//        add(sp, BorderLayout.CENTER);
//        
//        botpanel = new JPanel();
//        JButton butins = new JButton("insert");
//        butins.addActionListener(event -> ta.setText("Hello "+n.getText()+"\n"+"Pass:"+p.getText()));
//        botpanel.add(butins);
//        add(botpanel, BorderLayout.SOUTH);
        
        
//        JButton b1 = new JButton("red");
//        JButton b2 = new JButton("blue");
//        JButton b3 = new JButton("green");
//        JButton b4 = new JButton("pink");
//        JButton b5 = new JButton("gray");
//        JButton b6 = new JButton("yellow");
//        
//        buttonPanel1 = new JPanel();
//        buttonPanel2 = new JPanel();               
//        
//        buttonPanel1.add(b1); buttonPanel1.add(b2); buttonPanel1.add(b3);
//        buttonPanel2.add(b4); buttonPanel2.add(b5); buttonPanel2.add(b6);
////        add(buttonPanel1,BorderLayout.SOUTH);      
////        add(buttonPanel2, BorderLayout.CENTER);  
//        
//        b1.addActionListener(event -> buttonPanel1.setBackground(Color.red));
//        b2.addActionListener(event -> buttonPanel1.setBackground(Color.blue));
//        b3.addActionListener(event -> buttonPanel1.setBackground(Color.green));
//        
//        b4.addActionListener(event -> buttonPanel2.setBackground(Color.pink));
//        b5.addActionListener(event -> buttonPanel2.setBackground(Color.gray));
//        b6.addActionListener(event -> buttonPanel2.setBackground(Color.yellow));
//        
//        labelPanle = new JPanel();
//        JLabel lb = new JLabel();
//        lb.setText("Xin chao");
//        labelPanle.add(lb);
//        add(labelPanle, BorderLayout.NORTH);
//            
//        panel = new JPanel();
//        panel.setLayout(new GridLayout(3,3));
//        JButton one = new JButton("1");
//        JButton two = new JButton("2");
//        JButton three = new JButton("3");
//        JButton four = new JButton("4");
//        JButton five = new JButton("5");
//        JButton six = new JButton("6");
//        JButton seven = new JButton("7");
//        JButton eight = new JButton("8");
//        JButton nine = new JButton("9");
//        panel.add(one); panel.add(two); panel.add(three);
//        panel.add(four); panel.add(five); panel.add(six);
//        panel.add(seven); panel.add(eight); panel.add(nine);
//        add(panel,BorderLayout.CENTER);
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        SpFrame f = new SpFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
