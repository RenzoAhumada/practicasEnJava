
package cajeroautomatico.cliente;

public class cliente {
    private String nombre;
    private int idCliente;
    private int password;
    private String nombreUsuario;
    private double efectivoEnCuenta;
    
    
    //clase cliente para utilizacion
    public cliente() {
    }

    public cliente(String nombre, int idCliente, int password, String nombreUsuario, double efectivoEnCuenta) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.efectivoEnCuenta = efectivoEnCuenta;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getEfectivoEnCuenta() {
        return efectivoEnCuenta;
    }

    public void setEfectivoEnCuenta(double efectivoEnCuenta) {
        this.efectivoEnCuenta = efectivoEnCuenta;
    }
    
    
}
