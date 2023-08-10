import java.util.Scanner;
public class Udc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cdu=0, centena=0, dezena=0, unidade=0;
        
        System.out.println("Digite uma número em centena: ");
        cdu = entrada.nextInt();
        
        //254
        unidade  = (cdu%10) % 10;
        dezena = (cdu%100) / 10;
        centena = cdu/100;
        
        System.out.println("Unidade: " + unidade);
        System.out.println("Dezena: " + dezena);
        System.out.println("Centena: " + centena);
    }
}