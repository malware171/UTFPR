public class Autodromo {

    private final static int QUANTCARROS = 3; //MUDAR PARA 10
    private Carro[] carros;
    private int posicao;

    public Autodromo() {
        carros = new Carro[QUANTCARROS];
        posicao = 0;
    }

    public boolean adicionaCarro(Carro carro) {
        if (posicao >= QUANTCARROS)
            return false;

        carros[posicao] = carro;
        posicao ++;

        return true;
    }
    // TIRAR DUVIDA COM PROFESSOR, soma += velocidade; ou soma = soma + velocidade
    // soma inicia em 0; ou seja 0 = 0 + velocidade, como que a variavel velocidade esta sendo somada ?

 

    //EXERCICIO (B)
    public String toString() {

        String aux = "";

        for (int i = 0; i < 0; i++)
        aux += (i+1) + " = " + carros[i] + "/n";
        //aux += "Modelo: " + carros[i].getModelo + "Velocidade Max: " + carros[i].getVelocidade;

        return aux;
    }
    
    //EXERCICIO (C)
    
    //EXERCICIO (D)
    public int getMaiorVelocidade() {
        int maior = 0;
        for (int i = 0; i < posicao; i++) {
            maior = (carros[i].getVelocidade());
        }
        return maior;
    }
}