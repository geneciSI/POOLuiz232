package livro.controle;

import livro.modelo.Ponto2D;

public class DemoPonto2D {

    public static void main(String[] args) {
        Ponto2D p1;
        Ponto2D p2, p3, p4;
        p1 = new Ponto2D();
        p2 = new Ponto2D();
        
        p1.inicializaPonto2D(-1.34, 9.17);
        
        System.out.println("As coordenadas de P1 sao: "+ p1);
        System.out.println("As coordenadas de P2 sao: "+ p2);
        
        p3 = p1.clona();
        p4 = p1.origem();
        
        System.out.println("As coordenadas de P3 sao: "+ p3);
        System.out.println("As coordenadas de P4 sao: "+ p4);
        
        System.out.println("P1 está na mesma posição de p2? "+ p1.eIgual(p2));
        System.out.println("P1 está na mesma posição de p3? "+ p1.eIgual(p3));
        System.out.println("P1 está na mesma posição de p4? "+ p1.eIgual(p4));
        System.out.println("P2 está na mesma posição de p4? "+ p2.eIgual(p4));
        
        System.out.println(new Ponto2D());
    }
    
}
