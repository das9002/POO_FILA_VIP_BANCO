package VIP_BANCO;


import java.util.LinkedList;

public class BancoVip {

    private LinkedList<String> FilaCliente = new LinkedList<>();

    public void agregarClienteNormal(String nombre){
        FilaCliente.addLast(nombre);
        System.out.println("Cliente " + nombre + " a sido agregado.");
    }

    public  void agregarClienteVip(String nombre){
        FilaCliente.addFirst(nombre);
        System.out.println("Cliente VIP " + nombre + "a sido agregado.");
    }

    public void atenderCliente(){
        if (FilaCliente.isEmpty()){
            System.out.println("No hay clientes");
            return;
        }
        String atendiendo = FilaCliente.removeFirst();
        System.out.println("Atendiendo a: " + atendiendo);
    }

    public void mostrarFila(){
        if (FilaCliente.isEmpty()){
            System.out.println("La fila esta vacia");
            return;
        }
        System.out.println("Fila actual " + FilaCliente.size() + " cliente");

        int posicion = 1;
        for (String cliente:FilaCliente){
            System.out.println(posicion + " " + cliente);
            posicion ++;
        }

    }
}
