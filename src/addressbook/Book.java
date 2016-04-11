package addressbook;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Book extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public static int idd = -1;
    
    public Book() throws MalformedURLException {
        initComponents();
        setLocationRelativeTo(null);
        conn = Dbconnect.ConnecrDb();
        FillList();
        //ImageFrame add = new ImageFrame();
        //add.start();
        //add.setAlwaysOnTop(true);
       
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contactLabel = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactList = new javax.swing.JList();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
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
        groupField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        vcfButton = new javax.swing.JButton();
        groupComboBox = new javax.swing.JComboBox();
        setgroupLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        exitItem = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KSIĄŻKA ADRESOWA");
        setResizable(false);

        contactLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        contactLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactLabel.setText("Twoje kontakty");

        detailsLabel.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        detailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailsLabel.setText("Szczegóły");

        contactList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contactList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        contactList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contactList);

        editButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editButton.setText("Edytuj kontakt");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setText("Dodaj kontakt");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        zipcodeField.setEditable(false);
        zipcodeField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressLabel.setText("Adres:");

        addressField.setEditable(false);
        addressField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        phoneLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneLabel.setText("Telefon:");

        birthdayField.setEditable(false);
        birthdayField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        birthdayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        birthdayLabel.setText("Data urodzenia:");

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityLabel.setText("Miasto:");

        emailField.setEditable(false);
        emailField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        phoneField.setEditable(false);
        phoneField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        surnameField.setEditable(false);
        surnameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cityField.setEditable(false);
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

        groupField.setEditable(false);
        groupField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addressField)
                        .addComponent(birthdayField)
                        .addComponent(surnameField)
                        .addComponent(nameField)
                        .addComponent(zipcodeField)
                        .addComponent(cityField)
                        .addComponent(phoneField)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(groupField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(groupField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteButton.setText("Usuń kontakt");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        vcfButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vcfButton.setText("Zapisz wizytówkę vCard");
        vcfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcfButtonActionPerformed(evt);
            }
        });

        groupComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wszystkie" }));
        groupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupComboBoxActionPerformed(evt);
            }
        });

        setgroupLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setgroupLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setgroupLabel.setText("Wybierz grupę do wyświetlenia:");
        setgroupLabel.setToolTipText("");

        menu1.setText("Plik");

        exitItem.setText("Wyjście");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        menu1.add(exitItem);

        menuBar.add(menu1);

        menu2.setText("Pomoc");

        aboutMenuItem.setText("O Programie");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        menu2.add(aboutMenuItem);

        menuBar.add(menu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(contactLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(detailsLabel)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(setgroupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(vcfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(detailsLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(vcfButton)
                        .addGap(42, 42, 42)
                        .addComponent(setgroupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(detailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void contactListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactListMouseClicked
        String str = (String) contactList.getSelectedValue();
        String id = null;
        if (str.contains(" ")) {
            id = str.substring(0, str.indexOf(" "));
        }
        idd = Integer.parseInt(id);
        SetValues();
    }//GEN-LAST:event_contactListMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (idd == -1) {
            JOptionPane.showMessageDialog(null, "Wybierz kontakt do edycji!");
        }
        else {
            EditPerson edit = new EditPerson();
            edit.setLocationRelativeTo(null);
            edit.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(null, "      Projekt JAVA \n 'Książka Adresowa' \n   by Maciej Wójcik");
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AddPerson add = new AddPerson();
        add.setLocationRelativeTo(null);
        add.setVisible(true);
        dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (idd == -1) {
            JOptionPane.showMessageDialog(null, "Wybierz kontakt do usunięcia!");
        }
        else {
            try {
                String query = "DELETE FROM osoba WHERE idosoba = '"+idd+"'";
                pst = conn.prepareStatement(query);
                pst.executeUpdate();
                FillList();
                nameField.setText("");
                surnameField.setText("");
                birthdayField.setText("");
                addressField.setText("");
                zipcodeField.setText("");
                cityField.setText("");
                phoneField.setText("");
                emailField.setText("");
                groupField.setText("");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Coś poszło nie tak :(");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void vcfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcfButtonActionPerformed
        if (idd != -1) {
            VCard vCard = new VCard();
            String str = "BEGIN:VCARD\r\nVERSION:4.0\r\nFN:"+nameField.getText()+" "+surnameField.getText()+"\r\nTEL;TYPE=cell:"+phoneField.getText()+"\r\nEMAIL:"+emailField.getText()+"\r\nEND:VCARD\r\n";
            vCard = Ezvcard.parse(str).first();
        
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(null);
            
            File file = new File(chooser.getSelectedFile()+".vcf");
            try {
                Ezvcard.write(vCard).version(VCardVersion.V4_0).go(file);
            } catch (IOException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Zapisano wizytówkę VCard :)");
        }
        




    
    }//GEN-LAST:event_vcfButtonActionPerformed

    private void groupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupComboBoxActionPerformed
        String wybor = (String) groupComboBox.getSelectedItem();
        String query = null;
        if(wybor.equals("Wszystkie")){
            FillList();
        }
        else if(wybor.equals("Praca")){
            query = "SELECT idosoba, imie, nazwisko FROM osoba INNER JOIN grupa on osoba.grupa = grupa.nazwa WHERE grupa.nazwa = 'Praca'";
            RefreshList(query);
        }
        else if(wybor.equals("Dom")){
            query = "SELECT idosoba, imie, nazwisko FROM osoba INNER JOIN grupa on osoba.grupa = grupa.nazwa WHERE grupa.nazwa = 'Dom'";
            RefreshList(query);
        }
        else if(wybor.equals("Szkoła")){
            query = "SELECT idosoba, imie, nazwisko FROM osoba INNER JOIN grupa on osoba.grupa = grupa.nazwa WHERE grupa.nazwa = 'Szkoła'";
            RefreshList(query);
        }
    }//GEN-LAST:event_groupComboBoxActionPerformed

    
    public void FillList() {
        DefaultListModel dlm = new DefaultListModel();
        try {
            String query = "SELECT idosoba, imie, nazwisko FROM osoba";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                String name = rs.getString("imie");
                String surname = rs.getString("nazwisko");
                String id = rs.getString("idosoba");
                String fullname = id+" | "+name+" "+surname;
                dlm.addElement(fullname);
            }
            
            contactList.setModel(dlm);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd przy połączeniu z bazą danych");
        }
    }
    
     public void RefreshList(String query) {
        DefaultListModel dlm = new DefaultListModel();
        try {
            //query = "SELECT idosoba, imie, nazwisko FROM osoba";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                String name = rs.getString("imie");
                String surname = rs.getString("nazwisko");
                String id = rs.getString("idosoba");
                String fullname = id+" | "+name+" "+surname;
                dlm.addElement(fullname);
            }
            
            contactList.setModel(dlm);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd przy połączeniu z bazą danych");
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
                osoba.group = rs.getString("grupa");
            }
            nameField.setText(osoba.name);
            surnameField.setText(osoba.surname);
            birthdayField.setText(osoba.birthday);
            addressField.setText(osoba.address);
            zipcodeField.setText(osoba.zipcode);
            cityField.setText(osoba.city);
            phoneField.setText(osoba.phone);
            emailField.setText(osoba.email);
            groupField.setText(osoba.group);
       }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Błąd przy połączeniu z bazą danych");
        }
    }
    
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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Book().setVisible(true);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField birthdayField;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JList contactList;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JComboBox groupComboBox;
    private javax.swing.JTextField groupField;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel setgroupLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JButton vcfButton;
    private javax.swing.JTextField zipcodeField;
    private javax.swing.JLabel zipcodeLabel;
    // End of variables declaration//GEN-END:variables
}
