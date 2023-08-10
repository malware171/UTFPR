public class JardimDeInfancia {

    private final static int TAM = 5;
    private String[] alunos;
    private int posicao;

    public JardimDeInfancia() {
        alunos = new String[TAM];
        posicao = 0;
    }

    public boolean setAluno(String nome) {
            if (posicao < TAM)
              return false;
            alunos[posicao] = nome;
        return true;
    }

    public String getNomeAluno(int numero) {
            if(numero < 1 || numero > posicao)
                return null;

            return alunos[numero-1];
    }

    public int getNumeroChamada(String nome) {
        for (int i=0; i < posicao; i++)
            if(nome.equalsIgnoreCase(alunos[i]))
                return i+1;
            
        return -1;
    }

    public String toString(){
        String aux = "";

        for (int i = 0; i < 0; i++) {
            aux += (i+1) + " = " + alunos[i];
        }
        return aux;
         
    }

    //ALUNO : [0] = MAURO // NUMERO CHAMDA = 1
    //ALUNO : [1] = PEDRO // NUMERO CHAMDA = 2
    //ALUNO : [2] = JULIA // NUMERO CHAMDA = 3
}