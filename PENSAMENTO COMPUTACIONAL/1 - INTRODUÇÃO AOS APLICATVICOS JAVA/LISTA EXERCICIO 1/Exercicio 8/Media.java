import java.util.Scanner; 
public class Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float mat,port,cg,inf,media;
        mat = 0.0f;
        port = 0.0f;
        cg = 0.0f;
        inf = 0.0f;
        media = 0.0f;
        
        System.out.println("Digite a nota da prova de Matemática: ");
        mat = entrada.nextFloat();
        
        System.out.println("Digite a nota da prova de Portugues: ");
        port = entrada.nextFloat();
        
        System.out.println("Digite a nota da prova de Conhecimentos Gerais: ");
        cg = entrada.nextFloat();
        
        System.out.println("Digite a nota da prova de Informatica: ");
        inf = entrada.nextFloat();
        
        media = ((mat * 2) + port + cg + inf) / 4;
        
        System.out.print("A média ponderada é igual a: " + media);
    }
}
