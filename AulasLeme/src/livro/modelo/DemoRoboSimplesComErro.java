package livro.modelo;
public class DemoRoboSimplesComErro {

   public static void main(String[] args) {
        RoboSimples numero5 = new RoboSimples("Numero 5", 'N', '5', (char) 69);
        byte coordX1 = -3;
        byte coordY1 = 8;
        RoboSimples gort = new RoboSimples("Gort", coordX1, coordY1, 'E');
        
        //float coordX1 = 10.0f;
        //float coordY1 = 22.0f;
        RoboSimples rose = new RoboSimples("Rosie", (byte) coordX1, (byte) coordY1,'S');
        
        //RoboSimples data = new Robosimples(true);
        
        //RoboSimples clonado = new RoboSimples(numero5);
        
        byte distancia = 12;
        rose.move(distancia);
        //numero5.move(3.2);
        //datas.move(falsa);
        
        
        
        System.out.println(numero5);
        System.out.println(gort);
    }
    
}
