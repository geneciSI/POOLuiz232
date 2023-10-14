package livro.controle;

import livro.modelo.Triangulo;

public class ExecutaTriangulo {
public static void main(String[] args) {
    Triangulo t1 = new Triangulo();
    t1.lado1 = 7;
    t1.lado2 = 6;
    t1.lado3 = 7;
    if(t1.eEquilatero())
        System.out.println("O triângulo é equilátero");
    else
        System.out.println("O triângulo não é equilátero");
    System.out.println("O perímetro é: " + t1.calculaPerimetro(t1.lado1,t1.lado2,t1.lado3));
     }
    
}
