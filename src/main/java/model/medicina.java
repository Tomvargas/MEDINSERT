package model;
/*
    Atributos( tipo, fech_elaboracion, fech_expiracion )
    getters( getTipo, getFech_elaboracion, getFech_expiracion )
    setters( setTipo, setFech_elaboracion, setFech_expiracion )
    Metodos( tostr, tiempocad ) 
 */
//  @author VARGAS_TOMAS

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class medicina extends producto {
    
    private String tipo;
    private Date fech_elaboracion;
    private Date fech_expiracion;
    
    //constructor
    public medicina(String nombre,String tipo, double precio, Date fech_elaboracion, Date fech_expiracion) {
        super(nombre, precio);
        this.tipo = tipo;
        this.fech_elaboracion = fech_elaboracion;
        this.fech_expiracion = fech_expiracion;
    }
    
    //getter
    public String getTipo() {return tipo;}
    public Date getFech_elaboracion() {return fech_elaboracion;}
    public Date getFech_expiracion() {return fech_expiracion;}
    
    //setter
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setFech_elaboracion(Date fech_elaboracion) {this.fech_elaboracion = fech_elaboracion;}
    public void setFech_expiracion(Date fech_expiracion) {this.fech_expiracion = fech_expiracion;}
    
    //metodo tostr
    @Override
    public String tostr(){
        String formatf="dd/MM/yyyy";
        SimpleDateFormat date= new SimpleDateFormat(formatf);

        return "\n"+"============================="+"\n"+super.tostr()+"\n"+"Tipo: "+tipo+"\n"+"Fecha de elaboracion: "+date.format(fech_elaboracion)+"\n"+"Fecha de expiracion: "+date.format(fech_expiracion)+"\n"+tiempocad(fech_expiracion)+"\n"+"============================="+"\n";
    }
    
    //metodo tiempocad
    public String tiempocad(Date date2){
        Date today=new Date();
        
        String x=" Estado: --";
        
        if(date2.compareTo(today)==1){
            int dias=(int)((today.getTime()-date2.getTime())/86400000);
            x="Estado: Consumible ("+dias*-1+ " días para caducar)";
        }
        else if(date2.compareTo(today)==0){
            x="Estado: Proximo a caducar";
        }
        else if(date2.compareTo(today)==-1){
            
            x="Estado: Caducado";
            
        }
        
        return x;
    } 
}
