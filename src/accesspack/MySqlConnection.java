
package accesspack;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class MySqlConnection {
public static Connection getConnection(){    

Connection connect = null;

//url means unid=form result locator

String url= "jdbc:mysql://localhost:3306/medicaldb";


String user ="root";


String password = "";

try {
Class.forName("com.mysql.jdbc.Driver");
connect = DriverManager.getConnection(url, user, password);
    
    
    
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}

return connect;
}
}