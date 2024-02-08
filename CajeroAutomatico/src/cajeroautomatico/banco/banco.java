
package cajeroautomatico.banco;

import cajeroautomatico.cliente.cliente;
import java.util.ArrayList;

//nuestra clase banco la cual solo almacena nuestros clientes en una lista

public class banco {
    
    private ArrayList<cliente> listaClientes = new ArrayList();

    public ArrayList<cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    
    
 public banco() {
    this.listaClientes = new ArrayList<>();
}

public banco(ArrayList<cliente> listaClientes) {
    this.listaClientes = listaClientes;
}

public void agregarCliente(cliente cl) {
    listaClientes.add(cl);
}
}
