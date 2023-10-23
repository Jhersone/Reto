/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodeelectrodomesticos;

/**
 *
 * @author Proyector
 */
public class Plancha implements Electrodomestico{
    
    private String nombre;
    private String temperatura;
    private String tipop;
  
    
     public Plancha() {
        
      }

    public Plancha(String nombre, String temperatura, String tipop) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.tipop = tipop;
    }

  

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
       
     public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }
    
    

public String getTexto() {
    String tipoText;
    if ("a vapor".equals(tipop)) {
        tipoText = "a vapor";
    } else if ("sin vapor".equals(tipop)) {
        tipoText = "sin vapor";
    } else {
        tipoText = "Tipo desconocido";
    }

    return this.nombre + " | Temp " + this.temperatura + " | Tipo " + tipoText;
}


    public void Electrodomesticar() {

    }
}

        
        



