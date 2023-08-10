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
    
    public float[] mediaColuna() {
        float aux[] = new float[C];
        float matrizSoma [] = new float[C];
        for(int j = 0; j < C; j++) {
            for(int i = 0; i < L; i++) {
                aux[j] += m[i][j];
            }
            matrizSoma[j] = aux[j]/L;
 //           System.out.println(matrizSoma[j]);
        }
        return matrizSoma;
    }

    public int[][] pontaCabeca() {
        int aux[][] = new int[L][C];
        for(int i = L-1; i > 0; i--) {
            for(int j = 0; j < C; j++) {
                aux[i][j] += m[i][j];
            }
            System.out.println(aux[i][j]);
        }
        return aux;
    }

    public int[] amplitude2() {
        int resultado[] = new int[C];
        for(int j = 0; j < C; j++) {
            int max = j[0];
            int min = j[0];
            for(int i = 0; i < C; i++) {
                if ( max > m[i][j]) {
                    max = m[i][j];
                }
                if (min < m[i][j]) {
                    min = m[i][j];
                }
            }
            resultado[j] += (max - min);
        }
        return resultado;
    }

    public int[] amlitude() {
        int aux[] = new int[C];
        
        for(int j = 0; j < C; j++) {
            int min = m[0][j];
            int max = m[0][j];
            
            for (int i = 0; i < L; l++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
                if (m[i][j] < min) {
                    min = m[i][j];
                }
            }
            aux[j] = max - min;
        }
        return aux;
    }
}