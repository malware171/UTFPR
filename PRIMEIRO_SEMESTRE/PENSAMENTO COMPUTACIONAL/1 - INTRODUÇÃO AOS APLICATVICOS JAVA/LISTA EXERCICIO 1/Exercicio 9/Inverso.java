import java.util.Scanner;
public class Inverso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = 0;
        float inverso = 0.0f;
        
        System.out.println("Digite um numero inteiro: ");
        n = entrada.nextInt();
        
        inverso = 1/n;
        
        System.out.println("O inverso deste número é " +inverso);
    }
}