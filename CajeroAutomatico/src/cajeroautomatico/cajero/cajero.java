/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico.cajero;


import java.util.Scanner;


public class cajero {
    
    public void mostrarOpciones(){
    Scanner sc = new Scanner(System.in);
    cajeroOperaciones cj = new cajeroOperaciones() {};
    
    
    //Utilizamos desde cajero las llamadas correspondietes hacia el flujo de las clases
    //Pondremos un try para tratar de agarrar cualquier tipo de error que pueda producir el programa en ejecucion
            try {
                
                System.out.println("Menu de ingreso");
                System.out.println("Para ingresar como usuario ingrese el numero 1");
                System.out.println("Para retirar efectivo ingrese el numero 2");
                System.out.println("Para ingresar efectivo ingrese 3");
                System.out.println("Para ver los clientes ingrese el numero 4");
                System.out.println("Para generar nuevo cliente ingrese el numero 5");
                
                //la variable aux se reutilizara en algunas acciones
                //y se vuelve a pedir para que la misma no genere un bucle sin fin
                int aux = sc.nextInt();
                switch(aux){
                    //Verificamos con el switch y reutilizamos la variable en algunos casos
                    case 1:
                        System.out.println("Ingrese nombre del cliente");
                        String auxString = sc.next();
                        cj.validarIdentidad(auxString);
                        break;
                        
                    case 2:
                        System.out.println("Ingrese la cantidad de dinero que quiere retirar:");
                        //Caso de reutilizacion de variable
                        aux = sc.nextInt();
                        cj.validarEfectivo(aux);
                        break;
                        
                    case 3:
                        System.out.println("Ingrese la cantidad de efectivo: ");
                        int efectivo = sc.nextInt();
                        cj.ingresarDinero(efectivo);
                        break;
                        
                    case 4:
                        cj.verClientes();
                        break;
                        
                    case 5:
                        cj.crearUsuario();
                        break;
                    default:System.out.println("Opcion no encontrada vuelva a intentarlo"); mostrarOpciones();
                        break;
                    
                }
            
        } catch (Exception e) {
            
                System.out.println("No se pudo procesar la informació, intente mas tarde.");
                mostrarOpciones();
        }
        
    }
    
    
    
}
