package ProgramaM2;

import java.util.*;

public class Impresion extends Producto {
    
    private String color;
    private ArrayList<Foto> fotos;

   public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos= new ArrayList<>();
   }

   public void agregarFoto(Foto foto){
        fotos.add(foto);
   }

   public void imprimir(){
    System.out.println("Imprimiendo foto en color"+" "+color);
    for(Foto foto : fotos){
        foto.mostrarFoto();
    }
   }
    
}
