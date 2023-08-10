public class Inalador2 {
    
    private final int DOSES = 100;
    private int restam = 0;
    
    public Inalador2 (){
        this.restam = DOSES;
    }
    
    public int getDoses () {
        return restam;
    }
    
    public String abrirInalador() {
        if (restam == 0)
            return "As doses acabaram";
        
        restam--;
        return "Quantidade restante de doses: " +restam;   
    }
}