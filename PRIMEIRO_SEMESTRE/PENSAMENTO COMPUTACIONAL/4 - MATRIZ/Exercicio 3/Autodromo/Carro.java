public class Carro {
    private String modelo;
    private int velocidade;

    public Carro (String modelo, int velocidade) {
        setModelo(modelo);
        setVelocidade(velocidade);
    } 

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String toString () {
        String aux = "";

        aux += "Modelo " + modelo + ", " + velocidade + "Km/h";

        return aux;
    }

}
