public class Pessoa {
    private String nome;
    
    public Pessoa (String nome) {
        this.nome = nome;
    }
    
    public void setNome(){
        this.nome=nome;
    }
    
    public String getNome() {
        return nome;
    }
        
    public String comprimetarSemNome() {
        return "Olá";
    }
    
    public String comprimentar(String nome) {
        return "Olá, " + nome;
    }
    
    public String comprimentar(Pessoa outraPessoa) {
        return "Olá, " + outraPessoa.getNome();
    }

}