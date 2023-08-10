import java.util.Random;
public class MatrizAleatoria {
    private int[][] m;
    private final int L,C;

    public MatrizAleatoria(int linhas, int colunas) {
        L = linhas;
        C = colunas;
        m = new int[L][C];
        Random gerador = new Random();
        for(int i = 0; i < L; i++) {
            for(int j = 0; j < C; j++) {
                m[i][j] = gerador.nextInt(100);
            }
        }
    }
    public String toString() {
        String aux = "";
        
        for(int i=0; i < L; i++) {
            for(int j=0; j < C; j++) {
                aux += "Linhas: " + m[i] + "Colunas: "+ m[j];
            }
            System.out.println(aux);
        }
        return aux;
    }

}