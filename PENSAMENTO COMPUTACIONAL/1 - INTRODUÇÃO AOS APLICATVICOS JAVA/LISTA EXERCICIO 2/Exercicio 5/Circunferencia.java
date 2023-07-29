import java.util.Scanner;
public class Circunferencia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        final float PI = 3.14159f;
        float raio=0.0f, area=0.0f, cir=0.0f;
        
        System.out.println("Digite valor para o raio de um circulo: ");
        raio = entrada.nextFloat();
        
        area = PI * (raio*raio);
        
        cir = 2*PI*raio;
        
        System.out.println("A area deste circulo: " +area);
        System.out.println("O comprimento da circunferencia: " + cir);
        
    }
}