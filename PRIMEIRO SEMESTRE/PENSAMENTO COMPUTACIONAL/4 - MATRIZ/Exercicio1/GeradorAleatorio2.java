import java.util.Random;
public class GeradorAleatorio2 {
    private int[] matriz;
    private static final int TAM = 15;
    
    public GeradorAleatorio2() {
        matriz = new int[TAM];
        Random gerador = new Random();
        
        for(int i = 0; i < TAM; i++) {
            matriz[i] = gerador.nextInt(100);
            
           System.out.println(matriz[i]);
        }
    }
    
     public String toString()
   {
      String aux = "";
      for (int i = 0; i < TAM; i++)
         aux += "[" + i + "] = " + matriz[i] + "\n";

      // System.out.println(aux);
      return aux;
   }
    
    //EXERCICIO (A)
        public boolean isPresente(int numero) {
        for(int elemento : matriz) 
            if (numero == elemento) 
                return true;
        return false;
    }
    
    //EXERCICIO (B)
        public int quantOcorrencias(int numero) {
        int contador = 0;
        for(int elemento : matriz)
            if(numero == elemento)
                contador++;
        return contador;
    }
    
    //EXERCICIO C
    
    public int somaMatriz() {
        int soma = 0;
        for(int elemento : matriz)
            soma += elemento;
            return soma;
    }
    
    //EXERCICIO D
    
       public String numeroParOuImpar() {
        String aux ="";
        for(int elemento : matriz) {
            
            aux += elemento + ": ";

            if (elemento % 2 == 0)
                aux += "Par/n";
            else 
                aux += "impar/n";
        }
        return aux;
    }    

}
