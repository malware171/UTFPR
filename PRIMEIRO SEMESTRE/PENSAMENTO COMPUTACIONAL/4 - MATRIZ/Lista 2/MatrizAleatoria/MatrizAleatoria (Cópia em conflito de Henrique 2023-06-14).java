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
                aux += m[i][j] + " ";
            }
           aux += "\n";
        }
        System.out.println(aux);
        return aux;
    }

    public int somaLinhaColuna() {
        int soma = 0;
        for(int i = 0; i < L; i++) {
            for(int j = 0; j < C; j++){
                soma += m[i][j];
            }
        }
        return soma;
    }

       //VER PORQUE ESTA DANDO ERRO !!!!!\\
    public int multiplicaPor2(int n) {
        for(int i = 0; i < L; i++) {
            for(int j = 0; j < C; j++) {
                n *= m[i][j];
            }
        }
        return n;
    } 

     public int[][] somaCom(int[][] n) {
        if (n.length != L || n[0].length != C) {
            throw new IllegalArgumentException("As dimensões da matriz N devem ser iguais às dimensões da matriz M."); 
        }
        
        int[][] resultado = new int[L][C];
        for(int i = 0; i < L; i++){
            for (int j = 0; j < C; j++) {
                resultado[i][j] = m[i][j] + n[i][j];
            }
        }
        return resultado;
    }

    public int[][] binaria() {
        int[][] resultado = new int[L][C];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++ ) {
                resultado[i][j] = m[i][j];

                if (resultado[i][j] % 2 == 0) {

                    resultado[i][j] = 0;
                 
                resultado[i][j] = 1;
                }
            }
        }
        return resultado; 
    }
}