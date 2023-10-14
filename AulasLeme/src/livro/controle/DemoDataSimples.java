package livro.controle;

import livro.modelo.DataSimples;

public class DemoDataSimples {
    
    public static void main(String[] args) {
        DataSimples hoje = new DataSimples();
        DataSimples independenciaDoBrasil = new DataSimples();
        
        byte d1;
        byte m1;
        short a1;
        d1 = 9;
        m1 = 12;
        a1 = 2023;
        hoje.inicializacaoDataSimples(d1, m1, a1);
        hoje.mostraDataSimples();
        d1 = 9;
        m1 = 12;
        a1 = 2023;
        independenciaDoBrasil.inicializacaoDataSimples(d1, m1, a1);
        independenciaDoBrasil.mostraDataSimples();
        if (hoje.eIgual(independenciaDoBrasil))
            System.out.println("As datas são iguais");
        else
            System.out.println("As datas são diferentes");
        hoje.dia = 0;
        hoje.mes = 1;
        hoje.ano = 2001;
        hoje.mostraDataSimples();
        independenciaDoBrasil.mes = 13;
        independenciaDoBrasil.mostraDataSimples();

    }
    
}
