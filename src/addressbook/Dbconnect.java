package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Dbconnect {
    
    Connection conn = null;
    
    public static Connection ConnecrDb() {
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\X\\Documents\\NetBeansProjects\\AddressBook\\database.db");
            return conn;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
