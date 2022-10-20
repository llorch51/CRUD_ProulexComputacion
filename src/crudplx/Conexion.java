
package crudplx;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static String host = "jdbc:mysql://localhost";
    public static String user = "root";
    public static String password = "root";
    public static String db = "banco";
    public static boolean flag = false;
    
    public Connection getConnection(String host, String user, String password, String db){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(host + "/" + db, user, password);
            
//            if(flag == false){
//                flag = true;
//                JOptionPane.showMessageDialog(null, "Conexión establecida exitosamente");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    } 
}
