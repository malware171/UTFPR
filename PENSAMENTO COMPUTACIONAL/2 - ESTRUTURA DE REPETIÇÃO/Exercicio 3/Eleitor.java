public class Eleitor {
    private int idade;
    private String nome;
    
    public Eleitor (int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome () {
        this.nome = nome;
    }
    
    public String getNome () {
        return nome;
    }
    
    public void setIdade() {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getVerificarVoto () {
        if (idade >= 18 and <=70) 
            return "Obrigatório";
        if (idade >=16  and <=18 or idade >70)
            return "Facultativo";
        return "Não permitido";
    }
}