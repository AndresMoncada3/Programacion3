package MomentoFinal;

public class Piso extends Botones {
    private int pisoActual; // Establecer el piso donde es solicitado el ascensor.
    private final int PISO_MAXIMO; // Constante para establecer el ultimo piso
    private final int PISO_MINIMO; // Constante para establecer el primer piso


    // Constructor

    public Piso(String botonSubir, String botonBajar, int botonPisoDeDestino, String mantenerPuertaAbierta,
            String cerrarPuerta, int pisoActual, int pISO_MAXIMO, int pISO_MINIMO) {
        super(botonSubir, botonBajar, botonPisoDeDestino, mantenerPuertaAbierta, cerrarPuerta);
        this.pisoActual = pisoActual;
        PISO_MAXIMO = pISO_MAXIMO;
        PISO_MINIMO = pISO_MINIMO;
    }


    // Getters
    public int getPisoActual() {
        return pisoActual;
    }



    public int getPISO_MAXIMO() {
        return PISO_MAXIMO;
    }



    public int getPISO_MINIMO() {
        return PISO_MINIMO;
    }

    
    public void subirAscensor(){ // Metodo para solicitar que le ascensor suba 
        if (pisoActual<PISO_MAXIMO) {
            pisoActual ++;
            System.out.println(" ¡¡¡ SUBIENDO !!! ");
        } else {
            System.out.println("¡¡¡ ULTIMO PISO, NO SE PUEDE SUBIR !!! ");
        }
    }


    public void bajarAscensor(){
        if (pisoActual>PISO_MINIMO) {
            pisoActual --;
            System.out.println(" ¡¡¡ BAJANDO !!! ");
        } else {
            System.out.println(" ¡¡¡ PRIMER PISO, NO SE PUEDE BAJAR MAS !!! ");
        }
    }

}
