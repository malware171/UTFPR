//Sintaxe do ARRAY
// tipo[] nomeVariavel = new tipo[5];

public class Array {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Pedro";
        nomes[3] = "Goku";
        nomes[4] = "Henrique";
        
        for (int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++) {
            System.out.println(posicaoVetor);
        }
    }
}