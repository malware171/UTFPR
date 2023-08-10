import java.util.Random;
public class Dado {
    private int faces, numero;
    
    Random random = new Random();
    
    public Dado (int faces) {
        this.faces = faces;
        this.numero = numero;
    }
    
    public void setNumeroDeFaces() {
        this.faces = faces;
    }
    
    public int getNumeroDeFaces() {
        return faces;
    }
    
    private void setNumeroAleatorio(int numero) {
         numero = random.nextInt(faces);
    }   
    
    public int getNumeroAleatorio() {
        return numero;
    }
    
    public String rolarDado() {
         return "Número do dado: " + numero;
    }
    
}