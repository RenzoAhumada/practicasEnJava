
package autospoo.automovil;

import autospoo.vehiculo.vehiculos;


public class automoviles extends vehiculos{
    
    private motor.motores tamañoMotor;
    private tipo.tipoDeAuto tipoDeAuto;
    private String color;

    public automoviles() {
    }

    public automoviles(motor.motores tamañoMotor, tipo.tipoDeAuto tipoDeAuto, String color) {
        this.tamañoMotor = tamañoMotor;
        this.tipoDeAuto = tipoDeAuto;
        this.color = color;
    }

    public automoviles(motor.motores tamañoMotor, tipo.tipoDeAuto tipoDeAuto, String color, String patente, String chasis) {
        super(patente, chasis);
        this.tamañoMotor = tamañoMotor;
        this.tipoDeAuto = tipoDeAuto;
        this.color = color;
    }

    public motor.motores getTamañoMotor() {
        return tamañoMotor;
    }

    public void setTamañoMotor(motor.motores tamañoMotor) {
        this.tamañoMotor = tamañoMotor;
    }

    public tipo.tipoDeAuto getTipoDeAuto() {
        return tipoDeAuto;
    }

    public void setTipoDeAuto(tipo.tipoDeAuto tipoDeAuto) {
        this.tipoDeAuto = tipoDeAuto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    
}
