
package autospoo.camiones;

import autospoo.camiones.tipoCamioneta.tipoCamionetas;
import autospoo.vehiculo.vehiculos;


public class camionetas extends vehiculos{
    private String color;
    private tipoCamioneta.tipoCamionetas tiposDeCamioneta;

    public camionetas() {
    }

    public camionetas(String color, tipoCamionetas tiposDeCamioneta) {
        this.color = color;
        this.tiposDeCamioneta = tiposDeCamioneta;
    }

    public camionetas(String color, tipoCamionetas tiposDeCamioneta, String patente, String chasis) {
        super(patente, chasis);
        this.color = color;
        this.tiposDeCamioneta = tiposDeCamioneta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public tipoCamionetas getTiposDeCamioneta() {
        return tiposDeCamioneta;
    }

    public void setTiposDeCamioneta(tipoCamionetas tiposDeCamioneta) {
        this.tiposDeCamioneta = tiposDeCamioneta;
    }

   
    
}
