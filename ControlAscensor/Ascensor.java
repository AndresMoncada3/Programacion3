package ControlAscensor;

public class Ascensor extends Piso{
    private String estado;
    private int dirreccion;
    private int ubicacion;
    private int cambiarDirreccion;
    private String detener;

    // Constructor
    public Ascensor(int pisoActual, String estado, int dirreccion, int ubicacion, int cambiarDirreccion,
            String detener) {
        super(pisoActual);
        this.estado = estado;
        this.dirreccion = dirreccion;
        this.ubicacion = ubicacion;
        this.cambiarDirreccion = cambiarDirreccion;
        this.detener = detener;
    }


    // Getters
    public String getEstado() {
        return estado;
    }

    public int getDirreccion() {
        return dirreccion;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public int getCambiarDirreccion() {
        return cambiarDirreccion;
    }

    public String getDetener() {
        return detener;
    }

    
    // Metodos
    public void moverAscensor(){
        if (dirreccion>pisoActual) {
            pisoActual++;
            System.out.println("¡¡¡ SUBIENDO DE PISO !!!");
        }else{
            System.out.println("¡¡¡ BAJANDO DE PISO !!!");
        }
    }
    
    
    

}
