import java.util.Scanner;
public class Troca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a = 0, b = 0, troca = 0;
        
        System.out.println("Digite um valor para A: ");
        a = entrada.nextInt();
        
        System.out.println("Digite outro valor para B: ");
        b = entrada.nextInt();
    
        troca = a;
        a = b;
        b = troca;
        
        System.out.println("O valor de A: "+ a);
        System.out.println("O valor de B: "+ b);
    }
}