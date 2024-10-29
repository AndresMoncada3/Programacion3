package ProgramaM2;

import java.util.*;

public class Ejecutar {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente1 = new Cliente("Andrés Moncada", "001115333");

        // Crear un pedido
        Pedido pedido1 = new Pedido(cliente1, null, new Date(), 30011023);

        // Crear productos
        Impresion impresion = new Impresion(1, "Azul");
        Foto foto1 = new Foto("foto1.jpg");
        foto1.mostrarFoto(); // Imprimir la foto
        impresion.agregarFoto(foto1);

        Camara camara = new Camara(1, "Sony", " A7");

        // Agregar productos al pedido
        pedido1.agregarProductos(impresion);
        pedido1.agregarProductos(camara);

        // Mostrar información del pedido
        pedido1.mostrarInformacion();
    }
    
}