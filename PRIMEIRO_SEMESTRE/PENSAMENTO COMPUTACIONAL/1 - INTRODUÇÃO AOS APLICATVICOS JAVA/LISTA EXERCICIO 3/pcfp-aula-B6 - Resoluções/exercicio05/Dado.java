import java.util.Random;

public class Dado
{
   private final int FACES;
   private Random gerador;
   private int sorteado;

   public Dado(int faces)
   {
      this.FACES = faces;
      gerador = new Random();
      proximaJogada();

      /*
       alternativas:
       (1) sorteado = FACES;
           considera o valor máximo daquele dado
       (2) sorteado = 1;
           começa sempre com a face 1 para cima
       */
   }

   public int proximaJogada()
   {
      sorteado = gerador.nextInt(FACES) + 1;
      return sorteado;
   }

   public int ultimaJogada()
   {
      return sorteado;
   }
}