public class Tanque {
    private float quantidade, abastecimento, percentual;
    
    public Tanque(float quantidade, float abastecimento, float pecentual) {
        this.quantidade = quantidade;
        this.abastecimento = abastecimento;
        this.percentual = percentual;
    }
    
    public void setCapacidadeCombustivel() {
        this.quantidade = quantidade;
    }
    
    public float getCapacidadeCombustivel() {
        return quantidade;
    }
    
    public void setQuantidadeAbastecimento() {
        this.abastecimento = abastecimento;
    }
    
    public float getQuantidadeAbastecimento() {
        return abastecimento;
    }
    
    public float TanqueCombustivel() {
        percentual = (abastecimento * 100) / quantidade;
        
        return percentual;
    }
    
    public String DadosCombustivel() {
        return "Quantidade de combuustive: " + abastecimento + "\n" + "Capacidade do Tanque: " + quantidade + "\n" + "Percentual: " + per
    }
}