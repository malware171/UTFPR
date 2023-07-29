import java.util.Scanner;

public class Produto
{
   public static void main (String[] args)
   {
      Scanner entrada = new Scanner(System.in);

    double taxa = 0.0, valorliquido = 0.0, valorbruto = 0.0;
      
      System.out.print("Digite o valor a receber ");
      valorliquido = entrada.nextInt();
      System.out.print("digite a taxa ");
      taxa = entrada.nextDouble();
      
      taxa = 100%taxa;
      System.out.println("Valor da taxa: ");
      valorbruto = (valorliquido * 100)/taxa;
      
      System.out.println("valor a pagar:" +valorbruto);
  

   }
}