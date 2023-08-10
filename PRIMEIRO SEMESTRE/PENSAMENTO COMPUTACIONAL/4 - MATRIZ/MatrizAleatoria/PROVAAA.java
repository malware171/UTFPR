    //MATRIZ PONTA CABEÇA
    public int[][] pontaCabeca() {
        for(int i = L-1; i >= 0; i--) {
            for(int j = 0; j < C; j++) {
                m[i][j] += m[i][j];
                System.out.println(m[i][j]);
            }
        }
        return m;
    }

    // [22] [79] [86]   [34] [55] [98]
    // [99] [67] [24] = [99] [67] [24]
    // [34] [55] [98]   [22] [79] [86]

    //MEDIA COLUNA
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

    //MULTIPLICA A MATRIZ POR NUMERO PASSADO
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

    //
    public int[][] somaCom(int n[][]){
      int linhas = n.length;
      int colunas = n[0].length;

      if ((linhas != L) || (colunas != C))
         return m;

      int[][] aux = new int[L][C];
      for (int i = 0; i < L; i++)
         for (int j = 0; j < C; j++)
            aux[i][j] = m[i][j] + n[i][j];

      return aux;
   }

    //
    public void multiplicaPor(int n){
      for (int i = 0; i < L; i++)
         for (int j = 0; j < C; j++)
            m[i][j] *= n;
   }

    //MATRIZ TRANSPOSTA 
    public int [][] transposta() {
        int[][] aux = new int[C][L];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                aux[j][i] = m[i][j];
            }
        }
        return aux;
    } 

    // TRIANGULO INFERIOR PRINCIPAL
    public String trianguloInferiorPrincipal() {
       String aux = "";
 
       if (isQuadrada()){
          for (int i = 1; i < L; i++){
             for (int j = 0; j < i; j++)
                aux = aux + m[i][j] + "\t";
             aux = aux + "\n";
          }
       }
 
       return aux;
    }

    //GERADOR DA MATRIZ 
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
    }

    //MÉTODO PARA IMPRIMIR A MATRIZ
    public String toString() {
      String aux = "";

      for (int i = 0; i < L; i++){
         for (int j = 0; j < C; j++)
            aux += m[i][j] + "\t";

         aux += "\n";
      }
    }
    ////////////////////////////////////////////////////////



import java.util.Random;
public class MatrizAleatoria{
   private final int L, C;
   private int m[][];

   //GERADOR DA MATRIZ 
   public MatrizAleatoria(int linhas, int colunas){
      L = linhas;
      C = colunas;
      m = new int[L][C];

      Random gerador = new Random();
      for (int i = 0; i < L; i++)
         for (int j = 0; j < C; j++)
            m[i][j] = gerador.nextInt(100);
   }
   //MÉTODO PARA IMPRIMIR A MATRIZ
   public String toString(){
      String aux = "";

      for (int i = 0; i < L; i++)
      {
         for (int j = 0; j < C; j++) {
            aux += m[i][j] + "\t";
         }
         aux += "\n";
      }

      // System.out.println(aux);
      return aux;
   }
   //SOMA MATRIZ
   public void somaLinhaColuna() {
      for (int i = 0; i < L; i++)
         for (int j = 0; j < C; j++)
            m[i][j] = i + j;
   }
   //MULTIPLICA MATRIZ POR NUMERO PASSADO
   public void multiplicaPor(int n){
      for (int i = 0; i < L; i++)
         for (int j = 0; j < C; j++)
            m[i][j] *= n;
   }
   //SOMA MATRIZ GERADA COM MATRIZ PASSADA POR PARAMETRO
   public int[][] somaCom(int n[][]){
      int linhas = n.length;
      int colunas = n[0].length;

      if ((linhas != L) || (colunas != C))
         return m;

      int[][] aux = new int[L][C];
      for (int i = 0; i < L; i++)
         for (int j = 0; j < C; j++)
            aux[i][j] = m[i][j] + n[i][j];

      return aux;
   }
   //MATRIZ BINARIA PAR = 0 E IMPAR = 1
   public int[][] binaria(){
      int[][] aux = new int[L][C];
      for (int i = 0; i < L; i++)
         for (int j = 0; j < C; j++)
            aux[i][j] = m[i][j] % 2;

      return aux;
   }
   //SABER SE A MATRIZ É QUADRADA
   public boolean isQuadrada(){
      // retorna se a matriz é quadrada
      return (L == C);
   }
    
   public int[] diagonalPrincipal(){
       if (!isQuadrada())
          return null;

       int aux[] = new int[L];
       for (int i = 0; i < L; i++)
          aux[i] = m[i][i];

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

   public String trianguloInferiorPrincipal(){
      String aux = "";

      if (isQuadrada())
      {
         for (int i = 1; i < L; i++)
         {
            for (int j = 0; j < i; j++)
               aux = aux + m[i][j] + "\t";
            aux = aux + "\n";
         }
      }

      return aux;
   }
   
   public String trianguloSuperiorSecundaria(){
      String aux = "";

      if (isQuadrada())
      {
         for (int i = 0; i < L-1; i++)
         {
            for (int j = 0; j < (L-i-1); j++)
               aux = aux + m[i][j] + "\t";
            aux = aux + "\n";
         }
      }

      return aux;
   }

   public String trianguloInferiorSecundaria() {
      String aux = "";
  
      for (int i = 1; i < L; i++) {
          for (int j = 0; j < i; j++) {
              aux += m[i][j] + " ";
          }
          aux += "\n";
      }
      return aux;
   }  
   
   public int[][] transposta(){
      int aux[][] = new int[C][L];

      for (int i = 0; i < C; i++)
         for (int j = 0; j < L; j++)
            aux[i][j] = m[j][i];

      return aux;
   }

   //MATRIZ PONTA CABEÇA
   public int[][] pontaCabeca() {
    for(int i = L-1; i >= 0; i--) {
        for(int j = 0; j < C; j++) {
            m[i][j] += m[i][j];
            System.out.println(m[i][j]);
        }
    }
    return m;
}

public int[][] pontaCabeca() {
   int[][] resultado = new int[L][C];
   for (int i = 0; i < L; i++) {
       for (int j = 0; j < C; j++) {
           resultado[i][j] = m[L - 1 - i][j];
       }
   }
   return resultado;
}


// [22] [79] [86]   [34] [55] [98]
// [99] [67] [24] = [99] [67] [24]
// [34] [55] [98]   [22] [79] [86]

//MEDIA COLUNA
public float[] mediaColuna() {
    float aux[] = new float[C];
    float matrizSoma [] = new float[C];
    for(int j = 0; j < C; j++) {
        for(int i = 0; i < L; i++) {
            aux[j] += m[i][j];
        } 
        matrizSoma[j] = aux[j]/L;
//        System.out.println(matrizSoma[j]);
    }
    return matrizSoma;
}
}

// [11] [3] [7]   
// [6] [2] [1] 
// [2] [9] [4]   


public int[] amplitude() {
   int[] resultado = new int[C];

   for (int j = 0; j < C; j++) {
       int max = m[0][j];
       int min = m[0][j];

       for (int i = 0; i < L; i++) {
           if (m[i][j] > max) {
               max = m[i][j];
           }
           if (m[i][j] < min) {
               min = m[i][j];
           }
       }
       resultado[j] = max - min;
   }
   return resultado;
}