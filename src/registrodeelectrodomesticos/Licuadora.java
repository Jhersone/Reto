/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeelectrodomesticos;

/**
 *
 * @author Proyector
 */
public class Licuadora implements Electrodomestico {
   private String nombre;
   private String velocidad;
   private String voltaje;
   private String modelo;

    public Licuadora() {
        
      }
   
    public Licuadora(String nombre, String velocidad, String voltaje) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.voltaje = voltaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String Voltaje) {
        this.voltaje = Voltaje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }
   
   public String getTexto(){
    return this.nombre + ","+"| Velo " + this.velocidad + ","+"| V " + 
            this.voltaje+ ","+"| M " + this.modelo;
    }
  
    public void Electrodomesticar() {

    }
    
}
