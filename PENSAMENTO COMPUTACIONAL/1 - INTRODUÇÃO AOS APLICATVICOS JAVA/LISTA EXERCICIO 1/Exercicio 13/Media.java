import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float n1=0.0f,n2=0.0f,n3=0.0f,n4=0.0f,media=0.0f;
        
        System.out.println("Digite um valor para o primeiro numero: ");
        n1 = entrada.nextFloat();
        
        System.out.println("Digite um valor para o segundo numero: ");
        n2 = entrada.nextFloat();
        
        System.out.println("Digite um valor para o terceiro numero: ");
        n3 = entrada.nextFloat();
        
        System.out.println("Digite um valor para o quarto numero: ");
        n4 = entrada.nextFloat();
        
        media = (n1 + (n2*2) + (n3*3) + (n4*4)) / 4;
        
        System.out.println("A média pondera é igual a: " + media);
    }
}