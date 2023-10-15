package livro.modelo;
public class DataComFabrica {
    private byte dia, mes;
    private short ano;
    
    DataComFabrica(byte d, byte m, short a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    public String toString(){
        return dia +"/"+mes+"/"+ano;
    }
    
    public static DataComFabrica Natal(short an){
        return new DataComFabrica((byte) 25, (byte) 12, an);
    }
    
}
