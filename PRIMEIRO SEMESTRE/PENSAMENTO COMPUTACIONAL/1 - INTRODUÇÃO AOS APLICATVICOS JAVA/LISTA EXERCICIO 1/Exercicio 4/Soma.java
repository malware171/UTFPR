import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2, n3;
        n1 = 0;
        n2 = 0;
        n3 = 0;
        
        System.out.println("Digite um número inteiro: ");
        n1 = entrada.nextInt();
        
        System.out.println("Digite um outro número inteiro: ");
        n2 = entrada.nextInt();
        
        System.out.println("Digite um outro número inteiro: ");
        n3 = entrada.nextInt();
        
        int soma;
        soma = 0;
        
        soma = n1+n2+n3;
        
        System.out.println ("A soma destes números é igual a: "+ soma);
    }
}