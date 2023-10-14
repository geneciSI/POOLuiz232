package livro.modelo;
public class Ponto2D {
    private double x, y;
    public void inicializaPonto2D(double _x, double _y){
        x = _x;
        y = _y;
    }
    
    public boolean eIgual(Ponto2D outroPonto2D){
        if ((x == outroPonto2D.x) && (y == outroPonto2D.y))
            return true;
        else
            return false;
    }
    
    public Ponto2D origem(){
        Ponto2D temporario = new Ponto2D();
        temporario.inicializaPonto2D(0,0);
        return temporario;
    }
    
    public Ponto2D clona(){
        Ponto2D temporario = new Ponto2D();
        temporario.inicializaPonto2D(this.x,this.y);
        return temporario;
        
    }
    
    @Override
    public String toString(){
        String resultado = "("+x+" , "+y+")";
        return resultado;
    }
}
