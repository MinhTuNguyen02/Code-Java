
package testfinalexam;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class fra extends JFrame{
    private JPanel panel = new JPanel();
    public fra(){
        setSize(500, 300);
        setLocationByPlatform(true);         
        setTitle("GridBagLayout Test");
        
        panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=0;
        
        JLabel falabel = new JLabel("Face:");
        panel.add(falabel,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=1;
        JLabel silabel = new JLabel("Size:");
        panel.add(silabel,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=1;
        c.gridy=0;
        JComboBox<String> facb = new JComboBox<>();
        facb.addItem("Serif");
        facb.addItem("Time new roman");
        facb.addItem("Dialog");
        panel.add(facb,c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx=1;
        c.gridy=1;
        JComboBox<Integer> sicb = new JComboBox<>();
        sicb.addItem(8);
        sicb.addItem(16);
        sicb.addItem(32);
        panel.add(sicb,c);
        
        
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx=1;
        c.gridy=2;
        c.gridheight =2;
        JCheckBox ch1 = new JCheckBox("Bold");
        panel.add(ch1,c);
        
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx=1;
        c.gridy=4;
        c.gridheight=2;
        JCheckBox ch2 = new JCheckBox("Italic");
        panel.add(ch2,c);
        
        c.fill = GridBagConstraints.VERTICAL;
        c.ipadx=80;
        c.gridx=2;
        c.gridy=0;
        c.gridheight=6;
        JTextArea t = new JTextArea("chao");   
        JScrollPane s = new JScrollPane(t);
        panel.add(s,c);
        
        add(panel);
        pack();
    }
    
}

public class layout {
    public static void main(String[] args) {
        fra f = new fra();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
