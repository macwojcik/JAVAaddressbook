package addressbook;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class FromCsv extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String[][] text;
    int i = 0;
    
    
    public FromCsv() {
        initComponents();
        conn = Dbconnect.ConnecrDb();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        readButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        csvTable = new javax.swing.JTable();
        sendButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        readButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        readButton.setText("Wczytaj plik .csv");
        readButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readButtonActionPerformed(evt);
            }
        });

        csvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imię", "Nazwisko", "Data urodzenia", "Adres", "Kod pocztowy", "Miasto", "Telefon", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(csvTable);

        sendButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sendButton.setText("Wyślij kontakty do bazy");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("Powrót");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(readButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(readButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readButtonActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            
            File f = chooser.getSelectedFile();
            
            Scanner scanner = new Scanner(f, "windows-1250");
            scanner.useDelimiter(",");
            DefaultTableModel model = (DefaultTableModel) csvTable.getModel();
            i = 0; 
            int j = 0;
            text = new String[5][8];
            while(scanner.hasNext()){
                if(j<8){
                text[i][j] = scanner.next();
                j = j+1;
                }
                if(j == 8){
                    j=0;
                    i=i+1;
                }
            } 
            for(int k=0;k<i;k++) {
            model.addRow(new Object[] {text[k][0], text[k][1], text[k][2], text[k][3], text[k][4], text[k][5], text[k][6], text[k][7]});
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FromCsv.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
    }//GEN-LAST:event_readButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        for(int k=0;k<i;k++){
        Person osoba = new Person();
        osoba.name = text[k][0];
        osoba.surname = text[k][1];
        osoba.birthday = text[k][2];
        osoba.address = text[k][3];
        osoba.zipcode = text[k][4];
        osoba.city = text[k][5];
        osoba.phone = text[k][6];
        osoba.email = text[k][7];
        osoba.group = "";
        
        try {
        String query = "INSERT INTO osoba (imie , nazwisko, adres , kodpocztowy , miasto , telefon , email , urodziny , grupa) VALUES ('"+osoba.name+"' , '"+osoba.surname+"' ,"
                + "'"+osoba.address+"' , '"+osoba.zipcode+"' , '"+osoba.city+"', '"+osoba.phone+"' , '"+osoba.email+"' , '"+osoba.birthday+"', '"+osoba.group+"')";
        pst = conn.prepareStatement(query);
        pst.executeUpdate();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Coś poszło nie tak :(");
        }
        }
        JOptionPane.showMessageDialog(null, "Wysłano pliki do bazy :)");
    }//GEN-LAST:event_sendButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        try {
            Book bk = new Book();
            bk.setLocationRelativeTo(null);
            bk.setVisible(true);
            dispose();
        } catch (MalformedURLException ex) {
            Logger.getLogger(AddPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FromCsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromCsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromCsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromCsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromCsv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable csvTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton readButton;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
