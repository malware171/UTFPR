import java.util.Scanner;
public class GastoEnergia {
    public static void main(String[] agrs) {
        Scanner entrada = new Scanner(System.in);
        
        float kw=0.0f, custo=0.0f, precokw = 1.86f, desconto = 0.0f;
        
        System.out.println("Digite o gasto de energia em KW: ");
        kw = entrada.nextFloat();
        
        custo = kw*precokw;
        desconto = custo*0.90f;
        
        System.out.println("O preço a pagar de energia R$" + custo);
        System.out.println("O novo valor com desconto de 10% R$"+ desconto);
        
    }
}