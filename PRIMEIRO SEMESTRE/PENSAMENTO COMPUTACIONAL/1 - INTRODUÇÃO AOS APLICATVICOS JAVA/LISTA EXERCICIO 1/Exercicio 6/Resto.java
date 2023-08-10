import java.util.Scanner;
public class Resto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n1, resto, div;
        n1 = 0;
        resto = 0;
        div = 0;
        
        System.out.println("Digite um número inteiro: ");
        n1 = entrada.nextInt();
        
        resto = n1 % 2;
        
        System.out.print("O resto da divisão de " + n1 + "por 2, é igual á: " + resto);

        
    }
}