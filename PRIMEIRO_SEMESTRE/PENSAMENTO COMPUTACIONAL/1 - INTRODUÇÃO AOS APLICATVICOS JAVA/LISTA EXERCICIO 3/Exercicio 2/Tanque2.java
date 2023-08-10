public class Tanque2 {
    private final float CAPACIDADE;
    private float abastecimento;
    
    
    public Tanque2(float capacidade, float abastecimento) {
        this.CAPACIDADE = capacidade;
        this.abastecimento = abastecimento;
    }
    
    
    public float getCapacidade() {
        return CAPACIDADE;
    }
    
    // Nâo permite alterar a quantidade de combustível
    //public void setQuantidadeAbastecimento() {
    
    public float getAbastecimento() {
        return abastecimento;
    }
    
    public float percentualCombustivel() {
         float percentual= (abastecimento * 100) / CAPACIDADE;
        
        return percentual;
    }
    
    public void encherTanque() {
        this.abastecimento = CAPACIDADE;
    }
    
    public void abastecer(float quantidade) {
        if (quantidade <= 0)
           return ;
        
    }
    
    public String dadosCombustivel() {
        return "Quantidade de combustive: " + abastecimento + "\n" + "Capacidade do Tanque: " + CAPACIDADE + "\n" + "Percentual: ";
    }
}