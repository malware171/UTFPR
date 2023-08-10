public class Autodromo {

    private final static int QUANTCARROS = 3; //MUDAR PARA 10
    private int[] carros;
    private int posicao;

    public Autodromo() {
        carros = new int[QUANTCARROS];
        posicao = 0;
    }

    public boolean adicionaCarro(Carro carro) {
        if (carros > QUANTCARROS)
            return false;

        carros[posicao] = carro;

        return true;
    }
}