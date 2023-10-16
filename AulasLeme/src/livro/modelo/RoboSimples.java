package livro.modelo;

public class RoboSimples {
   private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private char direcaoAtual;
    
    RoboSimples(String n, int px, int py, char d){
        nomeDoRobo = n;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual= d;
    }
    
    RoboSimples(String n){
        this(n, 0, 0, 'N');
    }
    
     RoboSimples(){
        this("",0,0, 'N');
    }
     
     public void move(){
         move(1);
     }
     
     public void move(int passos){
         if (direcaoAtual =='N') posicaoYAtual = posicaoYAtual + passos;
         if (direcaoAtual =='S') posicaoYAtual = posicaoYAtual - passos;
         if (direcaoAtual =='E') posicaoXAtual = posicaoXAtual + passos;
         if (direcaoAtual =='O') posicaoXAtual = posicaoXAtual - passos;
         
     }
     
     public void mudaDirecao(char novaDirecao){
         direcaoAtual = novaDirecao;
     }
     
     public String toString(){
         String posicao = "Nome do Robo: " + nomeDoRobo + "\n";
         posicao = posicao + "Posicao do Robo: (" + posicaoXAtual +","+ posicaoYAtual +")"+"\n";
         posicao = posicao + "Direcao do Robô: "+ direcaoAtual;
         return posicao;
     }
     
}
