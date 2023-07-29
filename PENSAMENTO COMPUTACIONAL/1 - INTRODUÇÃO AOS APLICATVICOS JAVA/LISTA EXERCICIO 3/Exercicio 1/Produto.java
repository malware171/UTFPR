public class Produto {
    private String nome;
    private double peso=0.0, preco=0.0, precoQuilo=0.0;
    
    public Produto(String nome, double peso, double preco, double precoQuilo) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
        this.precoQuilo = precoQuilo;
    }
    
    public void setNome() {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setPeso() {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPreco() {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public double getprecoQuilo() {
        precoQuilo = preco/peso;
        return precoQuilo;
    }
     
}