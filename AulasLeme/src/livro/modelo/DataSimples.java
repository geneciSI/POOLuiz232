
package livro.modelo;

public class DataSimples {
    public byte dia, mes;
    public short ano;
       
    public void inicializacaoDataSimples(byte d, byte m, short a){
        if (dataEValida(d,m,a)){
            dia = d;
            mes = m;
            ano = a;
            //mostraDataSimples();
            //System.out.println("Dentro do IF" + dia + "/" + mes + "/" + ano);
        } else{
            dia = 0; mes = 0; ano = 0;
            //System.out.println("Valores no ELSE");
            //System.out.println(dia + "/" + mes + "/" + ano);
        }
    }

    public boolean dataEValida(byte d, byte m, short a) {
        if ((d >= 1 ) && (d <= 31) && (m >= 1) && (m <= 12)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean eIgual(DataSimples outraDataSimples){
        if ((dia == outraDataSimples.dia) && 
            (mes == outraDataSimples.mes) &&
            (ano == outraDataSimples.ano))
            return true;
        else
            return false;
    }
    public void mostraDataSimples(){
        
        if (dataEValida(dia, mes, ano))
            System.out.print("Data VALIDA: ");
        else
            System.out.print("Data INVALIDA: ");
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    
}
