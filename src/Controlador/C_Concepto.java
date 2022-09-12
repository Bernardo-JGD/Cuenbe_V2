/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Concepto;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PRIDE RABBIT
 */
public class C_Concepto {
    
    public static ArrayList <Concepto> listaConceptos(){
        
        ArrayList<Concepto> lista = new ArrayList<Concepto>();
        
        try{
            
            Conexion.conectar();
            String query = "{CALL SP_ConsultarConceptos()}";
            
            CallableStatement cs = Conexion.mantenerConexion().prepareCall(query);
            ResultSet rs = Conexion.ejecutarStoredProcedure(cs);
            
            if(rs != null){
                while(rs.next()){
                    Concepto concepto = new Concepto();
                    concepto.setIdConcepto(rs.getInt("idConcepto"));
                    concepto.setNombre(rs.getString("nombre"));
                    concepto.setTotal(rs.getShort("total"));
                    concepto.setFechaInicio(rs.getDate("fechaInicio"));
                    lista.add(concepto);
                }
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al abrir la conexion");
            return null;
        }finally{
            
            try{
                Conexion.mantenerConexion().close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexion");
            }
            
        }
        return lista;
    }
    
}
