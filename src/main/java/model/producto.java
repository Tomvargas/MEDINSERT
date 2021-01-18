package model;
/*
    Atributos( nombre, precio )
    Getters( getNombre, getPrecio )
    setters( setNombre, setPrecio )
    Metodos ( String- tostr )
*/
//  @author VARGAS_TOMAS

public class producto {
    private String nombre;
    private double precio;
    //constructor
    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //getters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    //setters
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPrecio(double precio) {this.precio = precio;}
    //metodo tostr
    public String tostr(){
        return "Nombre: "+nombre+"\n"+"Precio: "+precio;
    }
}
