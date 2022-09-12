
package Modelo;

import java.sql.Date;
public class Concepto {
    
    private int idConcepto;
    private String nombre;
    private short total;
    private Date fechaInicio;
    
    public Concepto(){
        
    }
    
    public Concepto(String nombre, short total, Date fechaInicio){
        this.nombre = nombre;
        this.total = total;
        this.fechaInicio = fechaInicio;
    }
    
    public Concepto(int idConcepto, String nombre, short total, Date fechaInicio){
        this.idConcepto = idConcepto;
        this.nombre = nombre;
        this.total = total;
        this.fechaInicio = fechaInicio;
    }
    
    public int getIdConcepto(){
        return idConcepto;
    }
    
    public void setIdConcepto(int idConcepto){
        this.idConcepto = idConcepto;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public short getTotal(){
        return total;
    }
    
    public void setTotal(short total){
        this.total = total;
    }
    
    public Date getFechaInicio(){
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    
}
