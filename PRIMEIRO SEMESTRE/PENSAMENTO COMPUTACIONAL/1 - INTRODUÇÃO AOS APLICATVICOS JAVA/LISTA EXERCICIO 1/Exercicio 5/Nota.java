import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int nota1, nota2;
        
        nota1 = 0;
        nota2 = 0;
        
        System.out.println ("Digite a nota do seu Primeiro Semestre");
        nota1 = entrada.nextInt();
        
        System.out.println ("Digite a nota do seu Segundo Semestre");
        nota2 = entrada.nextInt();
        
        int media;
        media = 0;
        
        media = (nota1+nota2)/2;
        
        System.out.println("A média anual é igual a: "+ media);
    }
}