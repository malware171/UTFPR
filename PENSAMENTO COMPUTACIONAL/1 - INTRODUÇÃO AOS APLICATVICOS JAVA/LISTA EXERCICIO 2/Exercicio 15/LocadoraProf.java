
import java.util.Scanner;

public class LocadoraProf
{
   public static void main (String[] args)
   {
      Scanner entrada = new Scanner(System.in);

       double preco, taxa, taxa1, preco_final;
       taxa1 = 0.0;
       preco = 0.0;
       preco_final = 0.0;
      
       System.out.print("Digite o valor a receber ");
       preco = entrada.nextInt();

        System.out.print("digite a taxa ");
      
      taxa1 = entrada.nextDouble();
      
       taxa = (taxa1/100)*preco;
       preco_final = (((preco-taxa)*4.0)*4.0);
      
      



       System.out.println("valor a pagar:" + preco_final);
  

   }
}