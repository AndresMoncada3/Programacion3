package ControlAscensor;

public abstract class Boton {
    protected boolean estado;

    
    public void activarSeñal(){
        if ( estado = true) {
            System.out.println("¡¡¡ - EL BOTON FUE PRESIONADO - !!!");
        }else{
            System.out.println("¡¡¡ - NO SE HA PRESIONAdo EL BOTON - !!!");
        }
    }
}
