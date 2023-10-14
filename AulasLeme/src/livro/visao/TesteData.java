
package livro.visao;

import livro.modelo.DataSimples;

public class TesteData {

    public static void main(String[] args) {
        DataSimples d1 = new DataSimples();
        DataSimples d2 = new DataSimples();
        DataSimples a1 = new DataSimples();
        byte d11 = 8;
        byte m11 = 3;
        short a11 = 1980;
        d1.inicializacaoDataSimples(d11, m11, a11);
        if (d1.dataEValida(d11, m11, a11))
            d1.mostraDataSimples();
        else
            System.out.println("Data incorreta");
/*
        //d1.dataEValida(d11, m11, a11);
        d1.mostraDataSimples();
        System.out.println("Teste");
        d2.inicializacaoDataSimples(40,05, 1740);
        //d2.dataEValida(4,05,1740);
        d2.mostraDataSimples();
*/
    }
    
}
