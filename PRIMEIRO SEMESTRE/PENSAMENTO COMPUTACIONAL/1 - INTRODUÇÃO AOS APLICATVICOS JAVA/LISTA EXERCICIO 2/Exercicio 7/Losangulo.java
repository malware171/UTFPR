import java.util.Scanner;
public class Losangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int dmaior = 0, dmenor = 0, a = 0;
        
        System.out.println("Digite a diagonal maior do losangulo: ");
        dmaior = entrada.nextInt();
        
        System.out.println("Digite a diagonal menor do losangulo: ");
        dmenor = entrada.nextInt();
        
        a = (dmaior*dmenor)/2;
        
        System.out.println("A area deste losangulo é igual a: " + a);
    }
}