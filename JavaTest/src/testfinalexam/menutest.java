
package testfinalexam;

import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

class menu extends JFrame{
    private JMenuBar menubar;
    public menu(){
        setSize(500,300);
        setLocationByPlatform(true);
        setTitle("test menu");
        
        menubar = new JMenuBar();
        add(menubar,BorderLayout.NORTH);
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        JMenu editMenu = new JMenu("Edit");
        menubar.add(editMenu);
        JMenu helpMenu = new JMenu("Help");
        menubar.add(helpMenu);
        
        JMenuItem newItem = new JMenuItem("New");
        fileMenu.add(newItem); newItem.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem); openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        fileMenu.addSeparator();
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(saveItem); saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        JMenuItem saveasItem = new JMenuItem("Save As");
        fileMenu.add(saveasItem); 
        fileMenu.addSeparator();                
        
        JMenuItem cutItem = new JMenuItem("Cut");
        editMenu.add(cutItem); cutItem.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
        JMenuItem copyItem = new JMenuItem("Copy");
        editMenu.add(copyItem); copyItem.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(pasteItem); pasteItem.setAccelerator(KeyStroke.getKeyStroke("ctrl V"));
        
        JMenuItem exitItem = new JMenuItem("Exit",'E');
        exitItem.addActionListener(event -> {
            int r= JOptionPane.showConfirmDialog(this, "Ban muon thoat?", "Thoat chuong trinh", JOptionPane.YES_NO_OPTION);
            if(r==0){
                System.exit(0);
            }
        });
        exitItem.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
        fileMenu.add(exitItem);
        exitItem.setToolTipText("Thoat chuong trinh");
        
        JMenu optionMenu = new JMenu("Option");
        editMenu.add(optionMenu);
        
        JCheckBoxMenuItem cbmi = new JCheckBoxMenuItem("Read-only");
        cbmi.setSelected(true);
        optionMenu.add(cbmi);
        optionMenu.addSeparator();
        
        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("Insert");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("Overtype");
        r1.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(r1); group.add(r2);
        optionMenu.add(r1); optionMenu.add(r2);
        
        cbmi.addActionListener(event -> {
            saveItem.setEnabled(cbmi.isSelected());
            saveasItem.setEnabled(cbmi.isSelected());
        });
          
        saveItem.addActionListener(event -> 
                JOptionPane.showMessageDialog(this, "da luu","thong bao",JOptionPane.INFORMATION_MESSAGE)
        );
   
    }
    
}

public class menutest {
    public static void main(String[] args) {
        menu m = new menu();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
