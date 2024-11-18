package MomentoFinal;
import java.util.Scanner;



public class Ascensor extends Botones {
    private int seleccionarPisoDestino;

    // Constructor
    public Ascensor(String botonSubir, String botonBajar, int botonPisoDeDestino, String mantenerPuertaAbierta,
            String cerrarPuerta, int seleccionarPisoDestino) {
        super(botonSubir, botonBajar, botonPisoDeDestino, mantenerPuertaAbierta, cerrarPuerta);
        this.seleccionarPisoDestino = seleccionarPisoDestino;
    }

    // Getters
    public int getSeleccionarPisoDestino() {
        return seleccionarPisoDestino;
    }

    
    public void seleccionarPisoDestino(){
        int numeroPiso;
        Scanner numeroPiso= new Scanner(System.in);

    }



    
}
