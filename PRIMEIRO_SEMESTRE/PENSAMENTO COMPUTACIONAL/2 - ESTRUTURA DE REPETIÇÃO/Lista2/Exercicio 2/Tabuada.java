public class Tabuada {
    private int n;
    
    public Tabuada(int n) {
        this.n = n;
    }
    
    public void setNumero() {
        this.n = n;
    }
    
    public int getNumero()  {
        return n;
    }
    
    public String tabuada() {
        String aux = "";
        
        for (int i = 0; i <= 10; i++)
          System.out.println(n*5); 
    }
}