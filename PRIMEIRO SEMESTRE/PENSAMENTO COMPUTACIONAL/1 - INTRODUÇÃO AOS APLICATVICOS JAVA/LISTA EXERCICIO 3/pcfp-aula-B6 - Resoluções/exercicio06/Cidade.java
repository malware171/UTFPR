public class Cidade
{
   private String nome;
   private int populacao;
   private double area;

   public Cidade(String nome, int populacao, double area)
   {
      this.nome = nome;
      this.populacao = populacao;
      this.area = area;
   }

   // Implementar gets e sets para os atributos

   public double calculaDensidade()
   {
      return populacao / area;
   }

   public String toString()
   {
      return String.format("%s: %.1f habitantes por km2\n", nome, calculaDensidade());
   }
}

/*
 O nome da cidade, pela abstração, poderia até ser omitido.
 Acabou sendo utilizado para fornecer uma saída detalhada ao método
 toString().
*/