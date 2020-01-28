
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Haryx_PurpleSoft
 */
public class MyConnection 
{
    public static Connection getConnection(){
    Connection con = null;  
try
{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactsapp", "root", "");
   // JOptionPane.showMessageDialog(null, "Mysql connection successful...");
    return con;
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null, "Mysql connection failed...");
    return null;
   
}

}
}
