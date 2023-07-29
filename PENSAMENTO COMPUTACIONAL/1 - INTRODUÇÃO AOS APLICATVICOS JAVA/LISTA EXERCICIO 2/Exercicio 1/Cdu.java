import java.util.Scanner;
public class Cdu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int centena = 0, dezena = 0, unidade = 0, cdu =0;
        
        System.out.println("Digite uma centena: ");
        cdu = entrada.nextInt();
        
        //245
        centena = (cdu/100);
        dezena = (cdu%100)/10;
        unidade = cdu%10;
          
        System.out.println("Centena: " + centena);
        System.out.println("Dezena: " + dezena);
        System.out.println("Unidade: " + unidade);
    }
}