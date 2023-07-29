public class Contagem {
    private int limiteInferior, limiteSuperior;
    
    public Contagem (int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }
    
    public void setLimiteInferior() {
        this.limiteInferior = limiteInferior;
    }
    
    private int getLimiteInferior() {
        return limiteInferior;
    }
    
    public void setLimiteSuperior() {
        this.limiteSuperior = limiteSuperior;
    }
    
    private int getLimiteSuperior() {
        return limiteSuperior;
    }
    
    public void RealizarContagem() {
        int contador = limiteInferior;
        
        while (contador <= limiteSuperior) { 
            System.out.println(contador);
            
        limiteSuperior--;
        }
    }
}
 