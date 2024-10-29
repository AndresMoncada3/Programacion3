package ProgramaM2;

public class Camara extends Producto{
    private String marca;
    private String modelo;

    //Constructor
    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }


    //Gets and Sets
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   public void informacionCamara(){
    System.out.println("Camara"+" "+marca+" "+"modelo"+" "+modelo +" "+", Número" +" "+ numero);
   }

    
}
