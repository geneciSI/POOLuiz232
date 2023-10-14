package livro.modelo;
public class RegistroAcademicoSemConstrutor {
    private String nomeDoAluno;
    private int numeroDeMatricula;
    private byte codigoDoCurso;
    private double percentualDeCobranca;
    
    public void inicializaRegistroAcademicoSemConstrutor(String n, int m, byte c, double p){
        nomeDoAluno = n;
        numeroDeMatricula = m;
        codigoDoCurso = c;
        percentualDeCobranca = p;
    }
    public double calculaMensalidade(){
        double mensalidade = 0;
        if (codigoDoCurso == 1) 
            mensalidade = 450.00;
        if (codigoDoCurso == 2) 
            mensalidade = 500.00;
        if (codigoDoCurso == 3) 
            mensalidade = 550.00;
        if (codigoDoCurso == 4) 
            mensalidade = 380.00;
        if (percentualDeCobranca == 0)
            mensalidade = 0;
        else
            mensalidade = (mensalidade - (mensalidade * 0.50));
        return mensalidade;
              
    }
}
