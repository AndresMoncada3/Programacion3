package ProgramaM2;

import java.util.*;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;
    private int numeroTarjetaDeCredito;

    //Constructor
    public Pedido(Cliente cliente, List<Producto> productos, Date fecha, int numeroTarjetaDeCredito) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = fecha;
        this.numeroTarjetaDeCredito = numeroTarjetaDeCredito;
    }

    public void agregarProductos(Producto producto){
        productos.add(producto);
    }

    public void mostrarInformacion() {
        System.out.println("Pedido de: " + cliente.getNombre() + " (Cédula: " + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de tarjeta de crédito: " + numeroTarjetaDeCredito);
        System.out.println("Productos en el pedido:"+productos);
        for (Producto producto : productos) {
            System.out.println("Producto Número: " + producto.getNumero());
        }
    }


}
