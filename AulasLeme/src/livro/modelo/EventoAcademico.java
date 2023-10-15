package livro.modelo;
public class EventoAcademico {
    private String nomeDoEvento, localDoEvento;
    private Data inicioDoEvento, fimDoEvento;
    private int numeroDeParticipantes;
    
    EventoAcademico(String n, String l, Data i, Data f, int num){
        nomeDoEvento = n;
        localDoEvento = l;
        inicioDoEvento = new Data();
        inicioDoEvento.inicializaData(i.retornaDia(),i.retornaMes(),i.retornaAno());
        fimDoEvento = new Data();
        fimDoEvento.inicializaData(f.retornaDia(),f.retornaMes(),f.retornaAno());
        numeroDeParticipantes = num;
    }
    
    public String toString(){
        String relatorio = "";
        relatorio = relatorio + "Evento: " + nomeDoEvento + "\n";
        relatorio = relatorio + "Local : " + localDoEvento + "\n";
        relatorio = relatorio + "De    : " + inicioDoEvento.retornaDia() +"/" +
                                            inicioDoEvento.retornaMes() +"/" +
                                            inicioDoEvento.retornaAno() +" a " +
                                            fimDoEvento.retornaDia() +"/" +
                                            fimDoEvento.retornaMes() +"/" +            
                                            fimDoEvento.retornaAno() +"\n";
        relatorio = relatorio + "Participantes : " + numeroDeParticipantes+"\n";
        return relatorio;
    }
    
    
}
