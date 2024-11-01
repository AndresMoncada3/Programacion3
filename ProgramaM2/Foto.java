package ProgramaM2;

public class Foto {
    private String fichero;

    //Constructor
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    //Gets and Sets   
    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    //Metodo 
    public void mostrarFoto(){
        System.out.println("Foto:"+" "+fichero);
    }
}
