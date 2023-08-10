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

     public int[][] somaCom(int n[][]) {
        int linhas = n.length;
        int colunas = n[0].length;
        if (linhas  != L || colunas != C)
            return m;
        
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
    
    public int[] diagonalPrincipal() {
        int[] resultado = new int[C];
        for (int i = 0; i < L; i++) {
            for(int j = 0; j < C; j++) {
                if (i == j)
                    resultado[j] = m[i][j];
            }
        }
        return resultado;
    }

    //METODO OTIMIZADO
     public int[] diagonalPrincipal2() {
        int[] aux = new int[L];
        for(int i = 0; i < L; i++) {
            aux[i] = m[i][i];
        }
        return aux;  
    }
    
    
    public int[] diagonalSecundaria() {
        if (L != C)
            return null;
        int[] aux = new int[L];
        for(int i = 0; i < L; i++) {
            aux[i] = m[i][C-1-i];
        }
        return aux;
    }
    
    public String trianguloSuperiorPrincipal() {
        String aux = "";

        for (int i = 0; i < L-1; i++) {
            for (int j = i + 1; j < C ; j++){
                aux += m[i][j] + " ";
            }
            aux += "\n";
        }
        return aux;
    }   

    public String trianguloInferiorPrincipal() {
        String aux = "";
        for (int i = 1; i < L; i++) {
            for (int j = 0; j <= i - 1; j++) {
                aux += m[i][j] + " ";
            }
            aux += "\n";
        }
        return aux;
    }
    
    public String trianguloSuperiorSecundaria() {
        String aux = "";
        for(int i = 0; i < L - 1; i++) {
            for (int j = 0; j < C-1-i; j++) {
                aux += m[i][j] + " ";
            }
            aux += "\n";
        }
        return aux;
    } 

   // public String trianguloInferiorSecundaria() {
   //     String aux = "";
   //     
   //     for (int i = 1; i < L; i++) {
   //         for (int j = C-1; j < C ; j--) {
   //             aux += m[i][j] + " ";
   //         }
   //         aux += "\n";
   //     }
   //     return aux;
   // }

    public String trianguloInferiorcundaria() {
        String aux = "";
        
        for (int i = 3; i > 0; i--) {
            for (int j = 1; j < i ; j++) {
                aux += m[i][j] + " ";
            }
            aux += "\n";
        }
        return aux;
    }

    public int [][] transposta() {
        int[][] aux = new int[C][L];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                aux[j][i] = m[i][j];
            }
        }
        return aux;
    }

    public int[][] multiplicaPor(int n[][]) {
        int linhas = n.length;
        int colunas = n[0].length;
        if (linhas != L || colunas != C)
            return null;

        int[][] aux = new int[L][C]; 
        for (int i = 0; i < L; i++) {
            for(int j = 0; j < C; j++) {
                aux[i][j] = m[i][j] * n[i][j];
            }
        }
        return aux;
    }
    
    public float[] mediaColuna() {
        float aux[] = new float[C];
        float matrizSoma [] = new float[C];
        for(int j = 0; j < C; j++) {
            for(int i = 0; i < L; i++) {
                aux[j] += m[i][j];
            } 
            matrizSoma[j] += aux[j]/L;
            System.out.println(matrizSoma[j]);
        }
        return matrizSoma;
    }

    public int[][] pontaCabeca() {
        for(int i = L-1; i >= 0; i--) {
            for(int j = 0; j < C; j++) {
                m[i][j] += m[i][j];
                System.out.println(m[i][j]);
            }
        }
        return m;
    }
}