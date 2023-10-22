/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeelectrodomesticos;

/**
 *
 * @author Proyector
 */
public class Waflera {
    
    private String nombre;
    private String marca;

    
   public Waflera() {
        
      }
    
    public Waflera(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
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
    
      String getTexto(){
    return this.nombre + ","+"| Marca: " + this.marca;
    }

     
    
}
