package livro.modelo;

import livro.modelo.RoboSimples0;

public class DemoRoboSimples0 {

    public static void main(String[] args) {
        RoboSimples0 groucho = new RoboSimples0("Groucho", 20, 10, 'S');
        RoboSimples0 chico = new RoboSimples0("Chico");
        RoboSimples0 semNome = new RoboSimples0();
        
        groucho.move(10);
        chico.mudaDirecao('E');
        chico.move(5);
        semNome.move();
        System.out.println(groucho);
        System.out.println(chico);
        System.out.println(semNome);
    }
    
    
}
