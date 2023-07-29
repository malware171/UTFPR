import java.util.Scanner;
public class NumeroInteiro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero; 
        
        numero = 0;
        
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        
        System.out.print (numero);
    }
}