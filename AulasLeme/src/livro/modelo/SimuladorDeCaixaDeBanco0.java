package livro.modelo;
public class SimuladorDeCaixaDeBanco0 {
    private int numeroDoCliente;
    private int numeroDoCaixa;
    
    SimuladorDeCaixaDeBanco0(int n){
        numeroDoCaixa = n;
        numeroDoCliente = 0;
        System.out.println("Iniciou operação:"+"Caixa "+numeroDoCaixa);
    }
    /*
    SimuladorDeCaixaDeBanco0(){
        numeroDoCaixa = 1;
        numeroDoCliente = 0;
        System.out.println("Iniciou operação:"+"Caixa "+numeroDoCaixa);
    }*/
    
    public void proximoAtendimento(){
        numeroDoCliente = numeroDoCliente + 1;
        System.out.println("Cliente com a senha numero "+numeroDoCliente+" favor ");
        System.out.println("dirigir-se ao caixa numnero "+numeroDoCaixa);
        }
}