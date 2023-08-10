import java.util.Scanner;
public class Reajuste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float salario=0.0f, reajuste=0.0f, reducao=0.0f;
        
        System.out.println("Digite o valor de seu salario: ");
        salario = entrada.nextFloat();
        
        reajuste = (salario*0.01f) + salario;
        reducao = salario - (salario*0.01f);
        
        System.out.println("O reajuste de 1%: " + reajuste);
        System.out.println("A redução de 1%: " + reducao);
    }
}