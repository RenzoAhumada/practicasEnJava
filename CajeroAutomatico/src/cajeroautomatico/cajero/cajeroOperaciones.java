/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico.cajero;

import cajeroautomatico.banco.banco;
import cajeroautomatico.cliente.cliente;
import java.util.Scanner;

/**
 *
 * @author Laptop
 */
abstract class cajeroOperaciones extends cajero{
    cliente cl = new cliente();
    Scanner sc = new Scanner(System.in);
    banco bn = new banco();
    
    
    //clase abstracta solamente para la verificacion y la comunicacion entre clases
    
    public void crearUsuario(){
        
        //para que el programa si en algun momento se detiene por una variable mal ingresada
        //se traera en bucle y se devolvera hacia la clase cajero y volvera al menu principal
        //para su recursividad
        System.out.println("Ingrese nombre del usuario");
        String nombre = sc.next();
        cl.setNombre(nombre);
        System.out.println("Genere una clave numerica");
        int aux = sc.nextInt();
        cl.setPassword(aux);
        aux = (int) (Math.random()*10);
        System.out.println("Su numero de cuenta es: " + aux);
        cl.setIdCliente(aux);
        System.out.println("¿Desea ingresar dinero?");
        aux = sc.nextInt();
        if (aux ==1) {
            System.out.println("Ingrese el monto a depositar");
            aux = sc.nextInt();
            cl.setEfectivoEnCuenta(aux);
            System.out.println("Ingreso exitoso");
        }if(aux==2){
            System.out.println("Recuerde que puede hacerlo en cualquier momento");
            cl.setEfectivoEnCuenta(0);
    }else{
            System.out.println("Opcion no encontrada");
            cl.setEfectivoEnCuenta(0);
        }
        bn.agregarCliente(cl); 
        mostrarOpciones();
    }
    
    public void validarIdentidad(String aux){
        ///Validamos el nombre con el ingresado para saber que utilizamos el cliente deseado
        if (aux.equals(cl.getNombre())) {
           
            System.out.println("Ingrese su contraseña:");
            int auxInt = sc.nextInt();
            
            if (auxInt == cl.getPassword()) {
                
                System.out.println("Bienvenido: " + cl.getNombre());
                System.out.println("Su usuario es: " + cl.getNombreUsuario());
                System.out.println("Su numero de cuenta es el: " + cl.getIdCliente());
                System.out.println("Su dinero disponible es de: " + cl.getEfectivoEnCuenta());
                mostrarOpciones();
            }
        }else{
            System.out.println("No existe usuario asociado");
            mostrarOpciones();
        }
        
        
    }
    public void validarEfectivo(int n){
        //En este mismo se valida si el cliente posee el efectivo para retirar
        //trayendo la variable de cajero pero verificando con la clase cliente
        if (n > cl.getEfectivoEnCuenta()) {
            System.out.println("No puede retirar esa cantidad de efectivo ya que es mayor a lo que tiene");
            System.out.println("Disponible es de: " + cl.getEfectivoEnCuenta());
            mostrarOpciones();
        }else{
            
            System.out.println("Retire el efectivo");
            cl.setEfectivoEnCuenta(n-cl.getEfectivoEnCuenta());
            System.out.println("Dinero en cuneta es de: " + cl.getEfectivoEnCuenta());
            mostrarOpciones();
        }
        
        
    }
    public void verClientes(){
        
        //En caso de querer ver los clientes que tenemos, llamamos a nuestra clase banco ya que la misma
        //almacena la lista de cliente para su posterior uso
        System.out.println("Los clientes son: ");
        System.out.println(bn.getListaClientes());
        
    }

    void ingresarDinero(int n) {
        
        System.out.println("Ingrese el numero de usuario: ");
        int usuario = sc.nextInt();
        if (usuario == cl.getIdCliente()) {
            System.out.println("Ingreso realizado con exito");
            cl.setEfectivoEnCuenta(n + cl.getEfectivoEnCuenta());
            mostrarOpciones();
        }else{
            System.out.println("No existe usuario");
            mostrarOpciones();
        }
        
    }
}
