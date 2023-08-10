import java.util.Scanner;
public class Barra {
    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);
        
        final int BARRA=4;
        
        float perimetro=0.0f, sobra=0.0f, compra=0.0f;
        System.out.println("Digite o perimetro do comodo: ");
        perimetro = entrada.nextFloat();
        
        sobra = perimetro*1.10f;
        
        compra = (int) Math.ceil(sobra / BARRA);
        
        System.out.println("Compre: " +compra + "barras");
    }
}