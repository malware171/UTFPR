public class Individuo {
    private String nome;
    private int idade;
    
    public Individuo (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome() {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setIdade() {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getVerificarMaioridade() {
        if (idade >= 18)
            return "Maior de idade";
        return "Menor de idade";
         
    }
}