package livro.controle;

import livro.modelo.Data;

public class DemoData {
    public static void main(String[] args) {
        Data nascimento = new Data();
        Data descobrimentoDoBrasil = new Data();
        byte umDia, umMes;
        short umAno;
        umDia = 22; umMes = 13; umAno = 2000;
        nascimento.inicializaData(umDia, umMes, umAno);
        nascimento.mostraData();
        umDia = 22; umMes = 4; umAno = 1500;
        descobrimentoDoBrasil.inicializaData(umDia, umMes, umAno);
        descobrimentoDoBrasil.mostraData();
        if (nascimento.eIgual(descobrimentoDoBrasil))
            System.out.println("As datas são iguais");
        else
            System.out.println("As datas são diferentes");
        //nascimento.mes = 10;
        //descobrimentoDoBrasil.mes = -1;
        System.out.println(nascimento.retornaDia());
        System.out.println(descobrimentoDoBrasil.retornaDia());
    }
    
}
