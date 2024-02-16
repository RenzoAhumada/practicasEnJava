
package autospoo.vehiculo;


public class vehiculos {
   String patente;
   String chasis;

    public vehiculos() {
    }

    public vehiculos(String patente, String chasis) {
        this.patente = patente;
        this.chasis = chasis;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
   
}
