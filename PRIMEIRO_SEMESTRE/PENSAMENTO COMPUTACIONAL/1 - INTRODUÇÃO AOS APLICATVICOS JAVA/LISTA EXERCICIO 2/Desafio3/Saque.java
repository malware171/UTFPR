import java.util.Scanner;
public class Saque {
    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);
        
        int total = 0, resto=0, saque=0, nota1=0, nota5=0, nota10=0, nota20=0, nota50=0, nota100=0;
        
        System.out.println("Digite o valor a ser sacado: ");
        saque = entrada.nextInt();
        
        resto = saque%100;
        nota100= saque/100;  
        nota50= resto/50;
        nota20= (resto - (nota50*50)) / 20;
        nota10 = (resto - ((nota20*20) + (nota50*50))) / 10; 
        nota5= (resto - ((nota10*10) + (nota20*20) + nota50*50)) / 5;
        nota1 = (resto - ((nota5*5) + (nota10*10) + (nota20*20) + nota50*50)) / 1;
        total = (nota100*100) + (nota50*50) + (nota20*20) + (nota10*10) + (nota5*5) + (nota1*1);
        
        System.out.println("Nota(s) de 100 Reais: "+ nota100);
        System.out.println("Nota(s) de 50 Reais: "+ nota50);
        System.out.println("Nota(s) de 20 Reais: "+ nota20);
        System.out.println("Nota(s) de 10 Reais: "+ nota10);
        System.out.println("Nota(s) de 5 Reais: "+ nota5);
        System.out.println("Nota(s) de 1 Real: "+ nota1);
        System.out.println("Total a ser sacado: "+ total);
    }
}