package livro.controle;

import livro.modelo.Data;

public class DemoReferencias {

    public static void main(String[] args) {
       Data nascimentoDeEdgarDegas = null;
       Data nascimentoDeHerbertMarcuse;
       Data jogosOlimpicosEmHelsink = null;
       
       nascimentoDeEdgarDegas = new Data();
       
       nascimentoDeEdgarDegas.inicializaData((byte) 30,(byte) 1, (short) 1948);
       nascimentoDeEdgarDegas.mostraData();
       
      nascimentoDeEdgarDegas = null;
     // nascimentoDeEdgarDegas.mostraData();
      //jogosOlimpicosEmHelsink.mostraData();
      
      if (true != false){
          nascimentoDeHerbertMarcuse = new Data();
          nascimentoDeHerbertMarcuse.inicializaData((byte) 21,(byte) 6, (short) 1965);
      }
      
      nascimentoDeHerbertMarcuse.mostraData();
      
    }
    
}
