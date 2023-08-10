import java.util.Scanner;
public class Graus {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float c = 0.0f,f = 0.0f;
        
        System.out.println("Digite a temperatura em C°: ");
        c = entrada.nextFloat();
        
        f = (c*1.8f) + 32;
        
        System.out.println("A temperatura em F°: " + f);
        
    }
}