package livro.modelo;
public class RoboSimples0 {
    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private char direcaoAtual;
    
    RoboSimples0(String n, int px, int py, char d){
        nomeDoRobo = n;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual= d;
    }
    
    RoboSimples0(String n){
        nomeDoRobo = n;
        posicaoXAtual = 0;
        posicaoYAtual = 0;
        direcaoAtual = 'N';
        
    }
    
     RoboSimples0(){
        nomeDoRobo = "";
        posicaoXAtual = 0;
        posicaoYAtual = 0;
        direcaoAtual = 'N';
    }
     
     public void move(){
         if (direcaoAtual =='N') posicaoYAtual = posicaoYAtual + 1;
         if (direcaoAtual =='S') posicaoYAtual = posicaoYAtual - 1;
         if (direcaoAtual =='E') posicaoXAtual = posicaoXAtual + 1;
         if (direcaoAtual =='O') posicaoXAtual = posicaoXAtual - 1;
         
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
