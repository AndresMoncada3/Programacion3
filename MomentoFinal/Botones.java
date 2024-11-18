package MomentoFinal;

public class Botones {
    private String botonSubir; // Este boton es el que llama el ascensor para subir. 
    private String botonBajar; // Este boton llama al ascensor para najar.

    private int botonPisoDeDestino; 
    private String mantenerPuertaAbierta;
    private String cerrarPuerta;

    // Constructor
    public Botones(String botonSubir, String botonBajar, int botonPisoDeDestino, String mantenerPuertaAbierta,
            String cerrarPuerta) {
        this.botonSubir = botonSubir;
        this.botonBajar = botonBajar;
        this.botonPisoDeDestino = botonPisoDeDestino;
        this.mantenerPuertaAbierta = mantenerPuertaAbierta;
        this.cerrarPuerta = cerrarPuerta;
    }

    // Getters
    public String getBotonSubir() {
        return botonSubir;
    }


    public String getBotonBajar() {
        return botonBajar;
    }


    public int getBotonPisoDeDestino() {
        return botonPisoDeDestino;
    }


    public String getMantenerPuertaAbierta() {
        return mantenerPuertaAbierta;
    }


    public String getCerrarPuerta() {
        return cerrarPuerta;
    }

    // Metodos
    public void bajarEnAscensor(){
        System.out.println(" ¡¡¡ BAJANDO !!! ");
    }

    

}
