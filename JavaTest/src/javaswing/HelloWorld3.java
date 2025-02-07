/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaswing;

import java.awt.Color;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class HelloWorld3 extends javax.swing.JFrame {

    /**
     * Creates new form HelloWorld3
     */
    public HelloWorld3() {
        initComponents();
        DefaultTableModel dtm=new DefaultTableModel();
        provinceTable.setModel(dtm);
        
        dtm.addColumn("code");
        dtm.addColumn("name");
        
        dtm.addRow(new Object[] {61,"Binh Duong"});
        dtm.addRow(new Object[] {69,"Ca Mau"});
        dtm.addRow(new Object[] {59,"Sai Gon"});
        dtm.addRow(new Object[] {72,"Ba Ria"});
        dtm.addRow(new Object[] {49,"Lam Dong"});
        
        ListSelectionModel lsm= provinceTable.getSelectionModel();
        lsm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsm.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int[] rows = provinceTable.getSelectedRows();
                int[] cols = provinceTable.getSelectedColumns();
                
                int code = (int)provinceTable.getValueAt(rows[0], 0);
                PassLabel.setText("ma tinh "+code);
            }
        });
        
        DefaultListModel dlm=new DefaultListModel();
        dlm.addElement(new Country("Vietnam", "vn"));
        dlm.addElement(new Country("Singapore", "sg"));
        dlm.addElement(new Country("China", "cn"));
        dlm.addElement(new Country("Japan", "jp"));
        countriesList.setModel(dlm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tong = new javax.swing.JButton();
        hieu = new javax.swing.JButton();
        tich = new javax.swing.JButton();
        thuong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vanum1 = new javax.swing.JTextField();
        vanum2 = new javax.swing.JTextField();
        result = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        PassLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        drinkCheck1 = new javax.swing.JCheckBox();
        drinkCheck2 = new javax.swing.JCheckBox();
        namRadioButton = new javax.swing.JRadioButton();
        nuRadioButton = new javax.swing.JRadioButton();
        provinceBox = new javax.swing.JComboBox<>();
        provinceBox.addItem(new Province("Binh Duong",61));
        provinceBox.addItem(new Province("Ca Mau",69));
        provinceBox.addItem(new Province("SaiGon",59));
        provinceBox.addItem(new Province("Ba Ria",72));
        provinceBox.addItem(new Province("Lam Dong",49));
        jScrollPane1 = new javax.swing.JScrollPane();
        provinceTable = new javax.swing.JTable();
        colorBlueButton = new javax.swing.JRadioButton();
        colorPinkButton = new javax.swing.JRadioButton();
        colorGrayButton = new javax.swing.JRadioButton();
        colorBlackButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        countriesList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minh Tu");

        tong.setText("Tong");
        tong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongActionPerformed(evt);
            }
        });

        hieu.setText("Hieu");
        hieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hieuActionPerformed(evt);
            }
        });

        tich.setText("Tich");
        tich.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tichActionPerformed(evt);
            }
        });

        thuong.setText("Thuong");
        thuong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuongActionPerformed(evt);
            }
        });

        jLabel1.setText("num1:");

        jLabel2.setText("num2:");

        result.setText("Ket qua:");

        PassLabel.setText("mat khau la");

        jButton1.setText("Dang nhap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        drinkCheck1.setText("tea");
        drinkCheck1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        drinkCheck2.setText("coffe");
        drinkCheck2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drinkCheck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkCheck2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(namRadioButton);
        namRadioButton.setText("Nam");
        namRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(nuRadioButton);
        nuRadioButton.setText("Nu");
        nuRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        provinceBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        provinceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(61), "Binh Duong"},
                { new Integer(69), "Ca Mau"},
                { new Integer(59), "SaiGon"},
                { new Integer(72), "Ba Ria"},
                { new Integer(49), "Lam Dong"}
            },
            new String [] {
                "code", "name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(provinceTable);

        buttonGroup2.add(colorBlueButton);
        colorBlueButton.setText("Blue");
        colorBlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlueButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(colorPinkButton);
        colorPinkButton.setText("Pink");
        colorPinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorPinkButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(colorGrayButton);
        colorGrayButton.setText("Gray");
        colorGrayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorGrayButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(colorBlackButton);
        colorBlackButton.setText("Black");
        colorBlackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlackButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(countriesList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(provinceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tich))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vanum1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vanum2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(result)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(drinkCheck2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(drinkCheck1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namRadioButton))
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(thuong)
                                .addGap(564, 564, 564)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(colorBlueButton)
                                    .addComponent(colorPinkButton)
                                    .addComponent(colorGrayButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(179, 179, 179)
                                .addComponent(colorBlackButton)
                                .addGap(12, 12, 12))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tong)
                            .addComponent(hieu)
                            .addComponent(tich)
                            .addComponent(thuong)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(colorBlueButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorPinkButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(vanum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(vanum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(result)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(provinceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(drinkCheck1)
                                    .addComponent(namRadioButton)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drinkCheck2)
                            .addComponent(nuRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(colorGrayButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorBlackButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongActionPerformed
        // TODO add your handling code here:
        int x=Integer.parseInt(vanum1.getText());
        int y=Integer.parseInt(vanum2.getText());
        int z=x+y;
        result.setText("Ket qua: "+z);
    }//GEN-LAST:event_tongActionPerformed

    private void hieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hieuActionPerformed
        // TODO add your handling code here:
        int x=Integer.parseInt(vanum1.getText());
        int y=Integer.parseInt(vanum2.getText());
        int z=x-y;
        result.setText("Ket qua: "+z);
    }//GEN-LAST:event_hieuActionPerformed

    private void tichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tichActionPerformed
        // TODO add your handling code here:
        int x=Integer.parseInt(vanum1.getText());
        int y=Integer.parseInt(vanum2.getText());
        int z=x*y;
        result.setText("Ket qua: "+z);
    }//GEN-LAST:event_tichActionPerformed

    private void thuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuongActionPerformed
        // TODO add your handling code here:
        int x=Integer.parseInt(vanum1.getText());
        int y=Integer.parseInt(vanum2.getText());
        try{
            int z=x/y;
            result.setText("Ket qua: "+z);
        }catch(ArithmeticException e){
            System.out.println(e);
            result.setText("loi chia 0");
        }
    }//GEN-LAST:event_thuongActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pass=String.valueOf(PasswordField.getPassword());
        String drink="";
        if(drinkCheck1.isSelected()){
            drink+="tea";
        }
        if(drinkCheck2.isSelected()){
            drink+=" coffee";
        }
        String gender="";
        if(namRadioButton.isSelected()){
            gender+="nam";
        }
        if(nuRadioButton.isSelected()){
            gender+=" nu";
        }
        Province tinh=(Province)provinceBox.getSelectedItem();
        String str="";
        if(countriesList.getSelectedIndex()!=-1){
            List<Country> countries =countriesList.getSelectedValuesList();
            for(Country i:countries){
                str+=" "+i.getCode();
            }
        }
        JOptionPane.showMessageDialog(this, "log in", "thong bao", JOptionPane.INFORMATION_MESSAGE);
        PassLabel.setText("Mat khau: "+pass+"\n Sothich: "+drink+"\n Gioi tinh: "+gender+"\n Tinh: "+tinh.getCode()+"-"+tinh.getName()+"\n ngon ngu: "+str);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void drinkCheck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkCheck2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinkCheck2ActionPerformed

    private void colorBlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlueButtonActionPerformed
        // TODO add your handling code here:
        if(colorBlueButton.isSelected()){
           PassLabel.setForeground(Color.blue);
        }
    }//GEN-LAST:event_colorBlueButtonActionPerformed

    private void colorPinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorPinkButtonActionPerformed
        // TODO add your handling code here:
        if(colorPinkButton.isSelected()){
           PassLabel.setForeground(Color.pink);
        }
    }//GEN-LAST:event_colorPinkButtonActionPerformed

    private void colorGrayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorGrayButtonActionPerformed
        // TODO add your handling code here:
        if(colorGrayButton.isSelected()){
           PassLabel.setForeground(Color.gray);
        }
    }//GEN-LAST:event_colorGrayButtonActionPerformed

    private void colorBlackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlackButtonActionPerformed
        // TODO add your handling code here:
        if(colorBlackButton.isSelected()){
           PassLabel.setForeground(Color.black);
        }
    }//GEN-LAST:event_colorBlackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HelloWorld3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelloWorld3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelloWorld3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelloWorld3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelloWorld3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PassLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton colorBlackButton;
    private javax.swing.JRadioButton colorBlueButton;
    private javax.swing.JRadioButton colorGrayButton;
    private javax.swing.JRadioButton colorPinkButton;
    private javax.swing.JList<Country> countriesList;
    private javax.swing.JCheckBox drinkCheck1;
    private javax.swing.JCheckBox drinkCheck2;
    private javax.swing.JButton hieu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton namRadioButton;
    private javax.swing.JRadioButton nuRadioButton;
    private javax.swing.JComboBox<Province> provinceBox;
    private javax.swing.JTable provinceTable;
    private javax.swing.JLabel result;
    private javax.swing.JButton thuong;
    private javax.swing.JButton tich;
    private javax.swing.JButton tong;
    private javax.swing.JTextField vanum1;
    private javax.swing.JTextField vanum2;
    // End of variables declaration//GEN-END:variables
}
