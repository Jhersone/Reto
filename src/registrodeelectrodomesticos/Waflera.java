/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeelectrodomesticos;

/**
 *
 * @author Proyector
 */
public class Waflera implements Electrodomestico {
    
    private String nombre;
    private String marca;
    private String tipop;
    
   public Waflera() {
        
      }
    
    public Waflera(String nombre, String marca,String tipop) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipop = tipop;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }
    
    
    
    public String getTexto() {
    String tipoText;
    if ("Industrial".equals(tipop)) {
        tipoText = "industrial";
    } else if ("Hogar".equals(tipop)) {
        tipoText = "Hogar";
    } else if ("Lujo".equals(tipop)) {
        tipoText = "Lujo";
    } else {
        tipoText = "Tipo desconocido";
    }

    return this.nombre + " | Temp " + this.marca + " | Tipo " + tipoText;
}
      
    public void Electrodomesticar() {

    }

}
