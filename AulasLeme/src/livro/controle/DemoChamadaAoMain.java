package livro.controle;
public class DemoChamadaAoMain {

    public static void main(String[] args) {
        DemoConstantesMatematicas.main(args);
        DemoConversaoDeUnidadesDeComprimento.main(args);
        System.out.print("O preço do terreno J1 é: ");
        System.out.println(CalculoDePrecoDeTerreno.precoDoTerreno(600,5));
    }
}
