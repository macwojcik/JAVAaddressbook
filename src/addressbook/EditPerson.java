package addressbook;

import static addressbook.Book.idd;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditPerson extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public EditPerson() {
        initComponents();
        conn = Dbconnect.ConnecrDb();
        SetValues();
        
        try {
            String query = "SELECT nazwa FROM grupa";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                groupComboBox.addItem(rs.getString("nazwa"));
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    private void SetValues() {
        try {
            String query = "SELECT * FROM osoba WHERE idosoba = '"+idd+"'";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            Person osoba = new Person();
            
            while(rs.next()) {
                osoba.name = rs.getString("imie");
                osoba.surname = rs.getString("nazwisko");
                osoba.birthday = rs.getString("urodziny");
                osoba.address = rs.getString("adres");
                osoba.zipcode = rs.getString("kodpocztowy");
                osoba.city = rs.getString("miasto");
                osoba.phone = rs.getString("telefon");
                osoba.email = rs.getString("email");
            }
            nameField.setText(osoba.name);
            surnameField.setText(osoba.surname);
            birthdayField.setText(osoba.birthday);
            addressField.setText(osoba.address);
            zipcodeField.setText(osoba.zipcode);
            cityField.setText(osoba.city);
            phoneField.setText(osoba.phone);
            emailField.setText(osoba.email);
            groupComboBox.setSelectedItem(osoba.group);
       }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd przy połączeniu z bazą danych");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsPanel = new javax.swing.JPanel();
        zipcodeField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        birthdayField = new javax.swing.JTextField();
        birthdayLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        surnameLabel = new javax.swing.JLabel();
        zipcodeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        groupComboBox = new javax.swing.JComboBox();
        editLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDYCJA KONTAKTU");
        setResizable(false);

        zipcodeField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressLabel.setText("Adres:");

        addressField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        phoneLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneLabel.setText("Telefon:");

        birthdayField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        birthdayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        birthdayLabel.setText("Data urodzenia:");

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityLabel.setText("Miasto:");

        emailField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        phoneField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        surnameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cityField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        surnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surnameLabel.setText("Nazwisko:");

        zipcodeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zipcodeLabel.setText("Kod pocztowy:");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLabel.setText("E-mail:");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLabel.setText("Imię:");

        groupLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        groupLabel.setText("Grupa:");

        groupComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(groupLabel)
                    .addComponent(emailLabel)
                    .addComponent(surnameLabel)
                    .addComponent(nameLabel)
                    .addComponent(birthdayLabel)
                    .addComponent(addressLabel)
                    .addComponent(zipcodeLabel)
                    .addComponent(cityLabel)
                    .addComponent(phoneLabel))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addressField)
                    .addComponent(birthdayField)
                    .addComponent(surnameField)
                    .addComponent(nameField)
                    .addComponent(zipcodeField)
                    .addComponent(cityField)
                    .addComponent(phoneField)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(groupComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayLabel)
                    .addComponent(birthdayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodeLabel)
                    .addComponent(zipcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupLabel)
                    .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        editLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        editLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editLabel.setText("Edycja kontaktu");

        editButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editButton.setText("Zapisz zmiany");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelButton.setText("Anuluj");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editLabel)
                .addGap(18, 18, 18)
                .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        try {
            Book bk = new Book();
            bk.setLocationRelativeTo(null);
            bk.setVisible(true);
            dispose();
        } catch (MalformedURLException ex) {
            Logger.getLogger(EditPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        
        Person osoba = new Person();
        osoba.name = nameField.getText();
        osoba.surname = surnameField.getText();
        osoba.birthday = birthdayField.getText();
        osoba.address = addressField.getText();
        osoba.zipcode = zipcodeField.getText();
        osoba.city = cityField.getText();
        osoba.phone = phoneField.getText();
        osoba.email = emailField.getText();
        osoba.group = (String) groupComboBox.getSelectedItem();
        
        try {
        String query = "UPDATE osoba SET imie = '"+osoba.name+"' , nazwisko = '"+osoba.surname+"' , urodziny = '"+osoba.birthday+"' , urodziny = '"+osoba.birthday+"' , adres = '"+osoba.address+"' ,"
                + " kodpocztowy = '"+osoba.zipcode+"' , miasto = '"+osoba.city+"' , telefon = '"+osoba.phone+"' , email = '"+osoba.email+"' , grupa = '"+osoba.group+"' WHERE idosoba = '"+idd+"'";
        pst = conn.prepareStatement(query);
        pst.executeUpdate();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Coś poszło nie tak :(");
        }
        
        JOptionPane.showMessageDialog(null, "Edytowano kontakt :)");
        Book bk = null;
        try {
            bk = new Book();
        } catch (MalformedURLException ex) {
            Logger.getLogger(EditPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
        bk.setLocationRelativeTo(null);
        bk.setVisible(true);
        dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(EditPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField birthdayField;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel editLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JComboBox groupComboBox;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField zipcodeField;
    private javax.swing.JLabel zipcodeLabel;
    // End of variables declaration//GEN-END:variables
}
