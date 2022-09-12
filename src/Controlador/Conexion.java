
package Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/Cuenbe?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contra = "17@93j3A_1jE";
    
    private static Connection conexion;
    
    public static Connection conectar(){
        
        conexion = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contra);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion: " + ex);
        }
        return conexion;
    }
    
    
    
    public static ResultSet ejecutarStoredProcedure(CallableStatement cs){
        
        try{
            return cs.executeQuery();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en la query");
            return null;
        }
        
    }
    
    public static Connection mantenerConexion(){
        return conexion;
    }
}
