public class CaixaSecreta {
    private String segredo, senha, senhaSecreta;
    
        public CaixaSecreta (String segredo, String senhaSecreta) {
        this.senhaSecreta = senhaSecreta;
        this.segredo = segredo;
    }
    
    public String getSenhaAbrirCaixa(String senha) {
        this.senha = senha;
        return senha;
    }
      
    public String getAbrirCaixa () {
        if (senhaSecreta.equals(senha))
            return "Segredo: " + segredo;
        return "Senha invalida !";
    }
}