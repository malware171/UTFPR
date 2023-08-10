import java.util.Scanner;
public class Locadora {
    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);
        
        int titulos=0, aluguel=0;
        
        System.out.println("Digite a quantidade de titulos (fitas e discos) que sua locadora possui:");
        titulos = entrada.nextInt();
        
        System.out.println("Qual o valor do aluguel ?");
        aluguel = entrada.nextInt();;
        
        float faturamento=0.0f, multa_mensal=0.0f, titulos_estragado=0.0f;
                                          
        
        faturamento = ((titulos/3) * aluguel) * 12;
        
        multa_mensal = (titulos/10) * (aluguel*0.10f);
        
        titulos_estragado = (int) Math.ceil((titulos*0.02f) /10);
        
        System.out.println("Faturamento Anual da Locadora: " +faturamento);
        System.out.println("Valor de ganho com multas por mês: " +multa_mensal);
        System.out.println("Quantidade de títulos que a locadora terá no final do ano: " +titulos_estragado);
        
        faturamento=(int)Math.pow (5 , 9);
    }
}