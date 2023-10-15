package livro.controle;

import livro.modelo.ConversaoDeUnidadesDeComprimento;

public class DemoConversaoDeUnidadesDeComprimento {

    public static void main(String[] args) {
        ConversaoDeUnidadesDeComprimento conv = new ConversaoDeUnidadesDeComprimento();
        System.out.println("Vinte pés são "+conv.pesParaCentimetros(20)+" centimetros");
        System.out.println("Cinco polegadas são "+conv.polegadasParaCentimetros(5)+" centimetros");
        System.out.println("Vinte pés sao "+ConversaoDeUnidadesDeComprimento.pesParaCentimetros(20)+" centimetros");
        System.out.println("Cinco polegadas são "+ConversaoDeUnidadesDeComprimento.polegadasParaCentimetros(5)+" centimetros");
        System.out.println("");
    }
    
}
