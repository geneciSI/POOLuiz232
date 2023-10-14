package livro.controle;

import livro.modelo.RegistroAcademicoSemConstrutor;

public class DemoRegistroAcademicoSemConstrutor {

    public static void main(String[] args) {
        RegistroAcademicoSemConstrutor michael = new RegistroAcademicoSemConstrutor();
        RegistroAcademicoSemConstrutor roberto = new RegistroAcademicoSemConstrutor();
        
        michael.inicializaRegistroAcademicoSemConstrutor("Michael Goodrich",34980030,(byte) 2, 100.0);
        
        System.out.println("A mensalidade do Michael é: "+ michael.calculaMensalidade());
        System.out.println("A mensalidade do Roberto é: "+ roberto.calculaMensalidade());

    }
    
}
