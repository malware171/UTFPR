import java.util.Scanner;
public class Prestacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        double prestacao = 0.0, valor=0.0, taxa = 0.0;
        int tempo_atraso=0, tempo=0;
        
        
        System.out.println("Digite o valor da prestação: ");
        valor = entrada.nextDouble();
        
        System.out.println("Digite o valor que voce vai cobrar a taxa: ");
        taxa = entrada.nextDouble();
        
        System.out.println("Digite quantos dias o cliente atrasou a prestação: ");
        tempo = entrada.nextInt();
        
        
        prestacao = valor + (valor * (taxa/100) * tempo);
        
        System.out.println("O valor a ser pago: " + prestacao + " Reais");
    }
}