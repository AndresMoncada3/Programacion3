package ControlAscensor;

public class BotonesPiso extends Boton {
    protected int botonSubir;
    protected int botonBajar;

    // Constructor
    public BotonesPiso(int pisoActual, int botonSubir, int botonBajar) {
        super(pisoActual);
        this.botonSubir = botonSubir;
        this.botonBajar = botonBajar;
    }


    // Getters
    public int getBotonSubir() {
        return botonSubir;
    }

    public int getBotonBajar() {
        return botonBajar;
    }

    

    
   


}
