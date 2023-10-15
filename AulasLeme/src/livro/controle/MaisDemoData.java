package livro.controle;

import livro.modelo.Data;
import livro.modelo.Triangulo;

public class MaisDemoData {

    public static void main(String[] args) {
        Data nascimentoDeGeorgeBizet;
        Data nascimentoDePabloPicasso;
        Data nascimentoDeJohannStrauss = new Data();
        Data JohnSteinbeckGanhaPremioNobel = new Data();
        Data nascimentoDeNanciCartWright = new Data();
        Triangulo t1 = new Triangulo();
        byte d, m;
        short a;
        d = 25; m = 10; a=1838;
        nascimentoDeJohannStrauss.inicializaData(d, m, a);
        
        d = 25; m = 10; a=1962;
        JohnSteinbeckGanhaPremioNobel.inicializaData(d, m, a);
        
        nascimentoDeNanciCartWright.inicializaData((byte) 25, (byte) 10, (short) 1959);
        
        nascimentoDeGeorgeBizet = nascimentoDeJohannStrauss;
        
        nascimentoDeGeorgeBizet.mostraData();
        
        nascimentoDeJohannStrauss.inicializaData((byte) 25, (byte) 10, (short) 1825);
        nascimentoDeJohannStrauss.mostraData();
        
        nascimentoDeGeorgeBizet.mostraData();
        
        System.out.println(JohnSteinbeckGanhaPremioNobel.eIgual(nascimentoDeNanciCartWright));
        
        short ano1, ano2;
        ano1 = JohnSteinbeckGanhaPremioNobel.retornaAno();
        ano2 = nascimentoDeNanciCartWright.retornaAno();
        if (ano1 > ano2){
            System.out.println("John Steinbeck ganhou o prêmio Nobel de literatura depois");
            System.out.println("do nascimento de Nancy Cart Wright");
        }
            
                
    }
    
}
