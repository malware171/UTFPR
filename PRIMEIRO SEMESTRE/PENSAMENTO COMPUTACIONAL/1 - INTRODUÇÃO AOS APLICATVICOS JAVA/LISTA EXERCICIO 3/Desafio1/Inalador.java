public class Inalador {
    
    private final int DOSES = 100;
    private int restam = 0;
    
    public Inalador(int restam) {
        this.restam = DOSES;
    }
    
    public int getDoses () {
        return restam;
    }
    
    public String AbrirInalador() {
        if (restam == 0) {
            return "As doses acabaram";
        } 
            restam--;
            return "Quantidade restante de doses: " +DOSES;
        }
    }
}