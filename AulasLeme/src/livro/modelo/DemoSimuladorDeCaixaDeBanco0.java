package livro.modelo;

import livro.modelo.SimuladorDeCaixaDeBanco0;

public class DemoSimuladorDeCaixaDeBanco0 {

   public static void main(String[] args) {
        SimuladorDeCaixaDeBanco0 c1 = new SimuladorDeCaixaDeBanco0(1);
        SimuladorDeCaixaDeBanco0 c2 = new SimuladorDeCaixaDeBanco0(2);
        SimuladorDeCaixaDeBanco0 c3 = new SimuladorDeCaixaDeBanco0(3);
        SimuladorDeCaixaDeBanco0 c4 = new SimuladorDeCaixaDeBanco0(4);
        SimuladorDeCaixaDeBanco0 c5 = new SimuladorDeCaixaDeBanco0(5);
        System.out.println("==============================");
        c1.proximoAtendimento();
        c2.proximoAtendimento();
        c3.proximoAtendimento();
        c4.proximoAtendimento();
        c5.proximoAtendimento();
        System.out.println("==============================");
        c1.proximoAtendimento();
        c2.proximoAtendimento();
        c3.proximoAtendimento();
        System.out.println("==============================");
        c1.proximoAtendimento();
        c2.proximoAtendimento();
        System.out.println("==============================");
        c1.proximoAtendimento();
        c1.proximoAtendimento();
        c1.proximoAtendimento();
    }
    
}
