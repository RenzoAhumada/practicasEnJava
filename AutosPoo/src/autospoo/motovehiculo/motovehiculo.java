
package autospoo.motovehiculo;

import autospoo.vehiculo.vehiculos;


public class motovehiculo extends vehiculos{
    private cilindradas.cilindros tipoDeMotor;
    String color;

    public motovehiculo() {
    }

    public motovehiculo(cilindradas.cilindros tipoDeMotor, String color) {
        this.tipoDeMotor = tipoDeMotor;
        this.color = color;
    }

    public motovehiculo(cilindradas.cilindros tipoDeMotor, String color, String patente, String chasis) {
        super(patente, chasis);
        this.tipoDeMotor = tipoDeMotor;
        this.color = color;
    }

    public cilindradas.cilindros getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(cilindradas.cilindros tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    
}
