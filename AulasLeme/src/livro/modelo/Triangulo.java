package livro.modelo;
public class Triangulo {
    public float lado1;
    //lado1 = 3.9;
    //lado2 = 4,7;
    //lado3 = 5;
    public boolean eEquilatero(){
        boolean igualdade12, resultado;
        igualdade12 = (lado1 ==lado2);
        boolean igualdade23;
        igualdade23 = (lado2 == lado3);
        if (igualdade12 && igualdade23)
            resultado = true;
        else
            resultado = false;
        return resultado;
    }
    public float calculaPerimetro(float l1, float l2, float l3){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        float resultado = lado1 + lado2 + lado3;
        return resultado;
        
    }
    public float lado2, lado3;

}
