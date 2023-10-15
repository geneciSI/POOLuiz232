package livro.modelo;
public class DemoRoboSimples {

    public static void main(String[] args) {
        RoboSimples groucho = new RoboSimples("Groucho", 20, 10, 'S');
        RoboSimples chico = new RoboSimples("Chico");
        RoboSimples semNome = new RoboSimples();
        
        groucho.move(10);
        chico.mudaDirecao('E');
        chico.move(5);
        semNome.move();
        System.out.println(groucho);
        System.out.println(chico);
        System.out.println(semNome);
    }
    
}
