import java.util.Scanner;
public class Quadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n =0, quadrado = 0;
        
        System.out.println("Digite um número para descobrir o seu quadrado ");
        n = entrada.nextInt();
        
        quadrado = n*n;
        
        System.out.println("O quadrado deste número é: " + quadrado);
    
        
    }
}