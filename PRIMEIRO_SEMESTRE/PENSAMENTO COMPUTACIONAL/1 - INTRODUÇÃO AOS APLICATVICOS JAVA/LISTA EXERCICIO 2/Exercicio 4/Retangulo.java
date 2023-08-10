import java.util.Scanner;
public class Retangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int base=0, h=0, perimetro=0, area=0;
        
        System.out.println("Digite a Base de um retangulo: ");
        base = entrada.nextInt();
        
        System.out.println("Digite a altura do retangulo: ");
        h = entrada.nextInt();
        
        perimetro = 2*(base+h);
        area = base*h;
        
        System.out.println("O perimetro deste retangulo: " + perimetro);
        System.out.println("A area deste retangulo: " +area);
        
    }
}