public class Aluno {
    private float notaSemestre1, notaSemestre2, exame;
    
    public Aluno (float notaSemestre1, float notaSemestre2, float exame) {
        this.notaSemestre1 = notaSemestre1;
        this.notaSemestre2 = notaSemestre2;
        this.exame = exame;
    }
    
    public void setNotaPrimeiroSemestre () {
        this.notaSemestre1 = notaSemestre1;
    }
    
    public float getNotaPrimeiroSemestre() {
        return notaSemestre1;
    }
    
    public void setSegundoSemestre () {
        this.notaSemestre2 = notaSemestre2;
    }
    
    public float getNotaSegundoSemestre() {
        return notaSemestre2;
    }
    
    public void setNotaExame () {
        this.exame = exame;
    }
    
    public float getNotaExame() {
        return exame;
    }
    
    public String getMaiorNotaSemestre () {
        if (notaSemestre1 > notaSemestre2)
            return "A maior nota é do primeiro semestre";
        return "A maior nota é do segundo semestre";
    }
    
    public String getMaiorNotaComAvaliação () {
        
        float maior = getMaiorNotaSemestre();
        
        if (notaSemestre1 > maior ) 
            return "A maior nota é do primeiro semestre";
        return "A maior nota é do Exame";
    }
}