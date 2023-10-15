package livro.modelo;

import livro.modelo.SimuladorDeCaixaDeBanco;

public class DemoSimuladorDeCaixaDeBanco {

    public static void main(String[] args) {
        SimuladorDeCaixaDeBanco c1 = new SimuladorDeCaixaDeBanco(1);
        SimuladorDeCaixaDeBanco c2 = new SimuladorDeCaixaDeBanco(2);
        SimuladorDeCaixaDeBanco c3 = new SimuladorDeCaixaDeBanco(3);
        SimuladorDeCaixaDeBanco c4 = new SimuladorDeCaixaDeBanco(4);
        SimuladorDeCaixaDeBanco c5 = new SimuladorDeCaixaDeBanco(5);
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
