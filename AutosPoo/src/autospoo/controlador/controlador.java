
package autospoo.controlador;

import autospoo.automovil.automoviles;
import autospoo.automovil.motor;
import autospoo.automovil.tipo;
import autospoo.camiones.camionetas;
import autospoo.camiones.tipoCamioneta;
import autospoo.motovehiculo.cilindradas;
import autospoo.motovehiculo.motovehiculo;
import autospoo.vehiculo.vehiculos;
import java.util.ArrayList;
import java.util.Scanner;

//Solamente desde el controlador utilizamos todos los recursos necesarios
//Estos mismos podriamos tambien dividirlos en sub clases por cada tipo de vehiculo
//y tener un poco de mayor de control
public class controlador {
    private final ArrayList<vehiculos> listaVehiculos;
    Scanner sc = new Scanner(System.in);
    
    //Instanciamos una lista nueva para poder empezar a llenarla
    public controlador() {
    listaVehiculos = new ArrayList<>();
    }
    
    //Llenamos el menu el cual nos enviara a cada funcion para poder colocar los datos
    //de cada objeto instanciado
    public void creacionDelVehiculoNuevo(){
        System.out.println("Ingrese 1 para generar un auto nuevo");
        System.out.println("Ingrese 2 para generar una moto nueva");
        System.out.println("Ingrese 3 para generar una camioneta nueva");
        System.out.println("Ingrese 4 para ver todos los vehiculos generados");
        System.out.println("Ingrese cualquier tecla para salir del programa");
        int aux = sc.nextInt();
        
        switch(aux){
            case 1:
                autoNuevo();
                break;
            case 2:
                motoNuevo();
                break;
            case 3:
                camionetaNueva();
                break;
            case 4:
                verTodosLosVehiculos();
                break;
            default:
                System.out.println("Saliendo del programa");
                break;
        }
    }
    
    //Instanciamos un nuevo auto, teniendo en cuenta que este crea un nuevo vehiculo
    //de tipo auto
    public void autoNuevo(){
        System.out.println("Ingrese patente del vehiculo");
        automoviles auto = new automoviles();
        String aux = sc.next();
        auto.setPatente(aux);
        System.out.println("Ingrese chasis del vehiculo");
        aux = sc.next();
        auto.setChasis(aux);
        System.out.println("Elija el tamaño del motor, los cuales son: " + verMotor());
        aux = sc.next().toUpperCase();
        
        try {
            motor.motores tipoSeleccionado = motor.motores.valueOf(aux);
            auto.setTamañoMotor(tipoSeleccionado);
                       
        } catch (Exception e) {
            System.out.println("No se pudo crear el auto con exito, vuelva a intentarlo");
            creacionDelVehiculoNuevo();
            
        }
        
        System.out.println("Elija el tipo de vehiculo que creara:" + verTipoDeAuto());
        aux = sc.next().toUpperCase();
        
         try {
            tipo.tipoDeAuto tipoSeleccionado = tipo.tipoDeAuto.valueOf(aux);
            auto.setTipoDeAuto(tipoSeleccionado);
                       
        } catch (Exception e) {
            System.out.println("No se pudo crear el auto con exito, vuelva a intentarlo");
            creacionDelVehiculoNuevo();            
        }
         
         System.out.println("Ingrese el color del vehiculo");
         aux = sc.next();
         auto.setColor(aux);
         
         listaVehiculos.add(auto);
         creacionDelVehiculoNuevo();
        
        
    }
    
        //Instanciamos una nueva moto, teniendo en cuenta que este crea un nuevo vehiculo
    //de tipo moto
    public void motoNuevo(){
        System.out.println("Ingrese patente del vehiculo");
        motovehiculo moto = new motovehiculo();
        String aux = sc.next();
        moto.setPatente(aux);
        System.out.println("Ingrese chasis del vehiculo");
        aux = sc.next();
        moto.setChasis(aux);
        System.out.println("Ingrese el color del vehiculo");
        aux = sc.next();
        moto.setColor(aux);
        System.out.println("Elija el tamaño del motor, los cuales son: " + verTipoDeCilindradas());
        aux = sc.next().toUpperCase();
        
         try {
            cilindradas.cilindros tipoSeleccionado = cilindradas.cilindros.valueOf(aux);
            moto.setTipoDeMotor(tipoSeleccionado);
                       
        } catch (Exception e) {
            System.out.println("No se pudo crear el auto con exito, vuelva a intentarlo");
            creacionDelVehiculoNuevo();
            
        }
        listaVehiculos.add(moto);
        creacionDelVehiculoNuevo();
    }
    
    //Instanciamos una nueva camioneta, teniendo en cuenta que este crea un nuevo vehiculo
    //de tipo camioneta
    public void camionetaNueva(){
        System.out.println("Ingrese patente del vehiculo");
        camionetas camioneta = new camionetas();
        String aux = sc.next();
        camioneta.setPatente(aux);
        System.out.println("Ingrese chasis del vehiculo");
        aux = sc.next();
        camioneta.setChasis(aux);
        System.out.println("Ingrese el color del vehiculo");
        aux = sc.next();
        camioneta.setColor(aux);
        System.out.println("Elija el tamaño del motor, los cuales son: " + verTipoDeCamioneta());
        aux = sc.next().toUpperCase();
         try {
            tipoCamioneta.tipoCamionetas tipoSeleccionado = tipoCamioneta.tipoCamionetas.valueOf(aux);
            camioneta.setTiposDeCamioneta(tipoSeleccionado);
                       
        } catch (Exception e) {
            System.out.println("No se pudo crear el auto con exito, vuelva a intentarlo");
            creacionDelVehiculoNuevo();
            
        }
         listaVehiculos.add(camioneta);
         creacionDelVehiculoNuevo();
    }
    
    
    //Instancia para ver todos los vehiculos creados
    //Se llama a la lista y se verifica si esta vacia o no para traer los vehiculos
    public void verTodosLosVehiculos(){
    if (listaVehiculos.isEmpty()) {
        System.out.println("No hay vehículos registrados.");
        return;
    }
    for (vehiculos vehiculo : listaVehiculos) {
        if (vehiculo instanceof automoviles) {
            automoviles auto = (automoviles) vehiculo;
            System.out.println("Patente: " + auto.getPatente() + ", Chasis: " + auto.getChasis() + ", Motor: " + auto.getTamañoMotor() + ", Tipo: " + auto.getTipoDeAuto() + ", Color: " + auto.getColor());
        }
        
        
        
    }
    
    creacionDelVehiculoNuevo();
}
        
    
    ///Desde estas funciones podemos ver los diferentes tipos de enum de todos los tipos
    //para cualquier tipo de vehiculo
    
    //Estas mismas podrian utilizarce en otro controlador o en otra clase
    public String verTipoDeCilindradas(){
         StringBuilder cilindros = new StringBuilder(); 
        for (cilindradas.cilindros Tipo : cilindradas.cilindros.values()) {
            cilindros.append(Tipo.name()).append(", ");
        }
        return cilindros.toString().replaceAll(", $", "");
        
    }
    
    
    public String verTipoDeCamioneta(){
         StringBuilder tipoCamionetas = new StringBuilder(); 
        for (tipoCamioneta.tipoCamionetas Tipo : tipoCamioneta.tipoCamionetas.values()) {
            tipoCamionetas.append(Tipo.name()).append(", ");
        }
        return tipoCamionetas.toString().replaceAll(", $", "");
        
    }
    
    public String verTipoDeAuto(){
         StringBuilder tipoDeAuto = new StringBuilder(); 
        for (tipo.tipoDeAuto Tipo : tipo.tipoDeAuto.values()) {
            tipoDeAuto.append(Tipo.name()).append(", ");
        }
        return tipoDeAuto.toString().replaceAll(", $", "");
        
    }
    
    public String verMotor(){
        StringBuilder motores = new StringBuilder(); 
        for (motor.motores Tipo : motor.motores.values()) {
            motores.append(Tipo.name()).append(", ");
        }
        return motores.toString().replaceAll(", $", "");
    }
}
