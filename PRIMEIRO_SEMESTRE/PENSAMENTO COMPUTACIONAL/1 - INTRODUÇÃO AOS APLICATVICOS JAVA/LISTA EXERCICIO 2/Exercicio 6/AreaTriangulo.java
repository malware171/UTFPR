import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float b=0.0f, h=0.0f, area=0.0f;
        
        System.out.println("Digite o valor da base do triangulo: ");
        b = entrada.nextFloat();
        
        System.out.println("Digite o valor da altura do triangulo: ");
        h = entrada.nextInt();
        
        area = (b*h)/2;
        
        System.out.println("A area deste triangulo: " +area);
        
    }
}