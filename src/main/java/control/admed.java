package control;

/*
    Atributos( Array<lista>, Array<tpre>, (medicina)p, (validacion)v )
    getters( getLista )
    setters( setLista )
    Metodos( validar, save, tprec ) 
*/
//  @author VARGAS_TOMAS

import java.util.ArrayList;
import java.util.Date;
import model.medicina;

public class admed {
    ArrayList<medicina> lista=new ArrayList<medicina>();
    ArrayList<Double> tpre=new ArrayList<Double>();
    medicina p=null;
    validacion v=new validacion();
    
    public ArrayList<medicina> getLista(){
        return lista;
    }
    
    public void setLista(ArrayList<medicina> lista){
        this.lista=lista;
    }
    
    //metodo validar de campos de medicina
    public boolean validar(String nombre, String tipo, String precio, Date elab, Date expi)
    {
        boolean x=true;
        if(!nombre.isEmpty()&&!tipo.isEmpty()&&!precio.isEmpty()&&elab!=null&&expi!=null){
            x=true;
        }
        else
            x=false;
        
        return x;
    }
    
    //metodo tprec
    
    
    //metodo guardar
    public String save(String nombre, String tipo, String precio, Date elab, Date expi)
    {
        String x="";
        double prec=v.todouble(precio);
        tpre.add(prec);
        p=new medicina(nombre, tipo, prec, elab, expi);
        lista.add(p);
        x=p.tostr();
        return x;
    }
    
    public double tprec()
    {
        double s=0;
        for(double d:tpre)
            s+=d;
        return s;
    }
}
