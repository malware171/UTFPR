public class Pessoa
{
   private String nome;

   public Pessoa(String nome)
   {
      this.nome = nome;
   }

   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public String cumprimenta()
   {
      return "Olá!";
   }

   public String cumprimenta(String nome)
   {
      return "Olá, " + nome + "!";
   }

   public String cumprimenta(Pessoa outraPessoa)
   {
      return "Olá, " + outraPessoa.getNome() + "!";
   }

   public String toString()
   {
      return nome;
   }
}