import java.util.Random;
public class GeradorAleatorio {
   
    private int[] matriz;
    private static final int TAM = 15;
    private int numero;

    public GeradorAleatorio () {
        matriz = new int[TAM];
        Random gerador = new Random();

        for(int i = 0; i < TAM; i++) {
            matriz[i] = gerador.nextInt(100);

            System.out.println(matriz[i]);
        }
    }
}