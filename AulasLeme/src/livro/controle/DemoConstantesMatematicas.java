package livro.controle;

import livro.modelo.ConstantesMatematicas;

public class DemoConstantesMatematicas {

    public static void main(String[] args) {
        ConstantesMatematicas const1 = new ConstantesMatematicas();
        ConstantesMatematicas const2 = new ConstantesMatematicas();
        System.out.println(const1.raizDe2==const2.raizDe2);
        System.out.println(const1.raizDe3==const2.raizDe3);
        System.out.println(const1.raizDe5==const2.raizDe5);
        System.out.println(const1.raizDe6==const2.raizDe6);
        double raizDe10 = ConstantesMatematicas.raizDe2*ConstantesMatematicas.raizDe5;
        System.out.println("A raiz quadrada de 10 é: "+ raizDe10);
        
    }
    
}
