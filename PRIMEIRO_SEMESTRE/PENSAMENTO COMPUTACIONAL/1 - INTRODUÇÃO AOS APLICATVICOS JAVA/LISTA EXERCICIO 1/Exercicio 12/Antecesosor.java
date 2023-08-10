import java.util.Scanner; 
public class Antecesosor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = 0, antes = 0, depois = 0;
        
        System.out.println("Digite um numero inteiro");
        n = entrada.nextInt();
        
        antes = n - 1;
        depois = n + 1;
        
        System.out.println("O antecessor deste número é igual: " + antes);
        System.out.println("O sucessor deste número é igual: " + depois);
    }
}