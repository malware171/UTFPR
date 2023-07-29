public class Produto2
{
   private String descricao;
   private double peso, preco;

   public Produto2(String descricao, double peso, double preco)
   {
      this.descricao = descricao;
      this.peso = peso;
      this.preco = preco;
   }

   public String getDescricao()
   {
      return descricao;
   }

   public void setDescricao(String descricao)
   {
      this.descricao = descricao;
   }

   // Implementar gets e sets para os demais atributos
   
   public double getPrecoQuilo()
   {
      return (preco / peso);
   }
   
   public String geraEtiqueta()
   {
      String aux =
         String.format(
            "- - -\n" +
            "%s\n" +
            "Peso: %.3f kg\n" +
            "Preço: R$ %.2f\n" +
            "Preco do quilo: R$ %.2f\n" +
            "- - -\n",
            descricao,
            peso,
            preco,
            getPrecoQuilo());

       //System.out.println(aux);
      return aux;
      // Também poderia ser retornado o próprio resultado de String.format(), 
      // sem o uso da variável auxiliar
   }
}