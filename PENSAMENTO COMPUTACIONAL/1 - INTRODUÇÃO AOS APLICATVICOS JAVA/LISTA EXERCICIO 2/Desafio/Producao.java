import java.util.Scanner;
public class Producao {
    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);
        
        int producao =0, meiaduzia=0, duzia=0, resto=0, meiaproducao=0, sobra=0;
        
        System.out.println("Quantidade de ovos produzidos: ");
        producao = entrada.nextInt();
        
        meiaproducao = producao/2;
        duzia = meiaproducao/12;
        resto = meiaproducao%12;
        meiaduzia = (meiaproducao+resto)/6;
        sobra = (meiaproducao+resto) % 6;
        
        System.out.println("Duzia: " +duzia);
        System.out.println("Meia-Duzia: " +meiaduzia);
        System.out.println("Sobram: " +sobra);
    }
}