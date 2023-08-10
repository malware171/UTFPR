import java.util.Scanner;
public class Divisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int dividendo, divisor, divint, resto;
        dividendo = 0;
        divisor = 0;
        divint = 0;
        resto = 0;
        
        float div;
        div = 0.0f;
        
        System.out.println ("Digite um número dividendo: ");
        dividendo = entrada.nextInt();
        
        System.out.println ("Sugute outro número divisor: ");
        divisor = entrada.nextInt();
        
        div = dividendo / divisor;
        divint = dividendo / divisor;
        resto = dividendo % divisor;
        
        System.out.println("A divisão é igual á: " + div);
        System.out.println("A divisão inteira é: " + divint);
        System.out.println("O resto da divisão destes números é: " + resto);
        
        
        
        
    }
}