package livro.controle;

import java.util.Scanner;
import livro.modelo.Ponto2D;

public class DemoPonto2DK {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D();
        System.out.println("Entre um valor de ponto flutuante (coord x): ");
        double x = in.nextDouble();
        System.out.println("Entre outro valor de ponto flutuante (coord y): ");
        double y = in.nextDouble();
        
        p1.inicializaPonto2D(x, y);
        
        System.out.println("Entre dois valores de ponto flutuante, press <ENTER>");
        System.out.println("após cada um");
        
        p2.inicializaPonto2D(in.nextDouble(), in.nextDouble());
        
        System.out.println("As coordenadas de P1 são: " + p1);
        System.out.println("As coordenadas de P2 são: " + p2);
    }
    
}
