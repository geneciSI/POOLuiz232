package livro.controle;
public class CalculoDePrecoDeTerreno {

    public static void main(String[] args) {
        double preco;
        System.out.println("O preço do terreno N1 é: ");
        preco = precoDoTerreno(450, 1);
        System.out.println(preco);
        System.out.println("O preço do terreno Q2 é: ");
        preco = precoDoTerreno(475, 4);
        System.out.println(preco);
        System.out.println("O preço do terreno 3 é: ");
        preco = precoDoTerreno(525,2);
        System.out.println(preco);
    }

    public static double precoDoTerreno(double area, int localizacao) {
        double preco = 0;
        if (localizacao == 1) preco = area * 22.00;
        if (localizacao == 2) preco = area * 27.00;
        if (localizacao == 3) preco = area * 29.50;
        if (localizacao == 4) preco = area * 31.50;
        if (localizacao == 5) preco = area * 34.50;
        return preco;
    }
}
