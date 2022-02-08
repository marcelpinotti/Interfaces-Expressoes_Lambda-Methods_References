package lambdas.introducao;

public class CalculoTeste {

    public static void main(String[] args) {

        Calculo calculo = new Soma();
        System.out.println("Instanciando a classe: " + calculo.executar(2,3));

        // Usando expressões lambda usando o par de chaves
        Calculo calculoSomaLambda = (x, y) -> { return x + y; };
        System.out.println("Instanciando uma função anônima: " + calculoSomaLambda.executar(2,3));

        System.out.println("----------------------");

        calculo = new Multiplicacao();
        System.out.println("Instanciando a classe: " + calculo.executar(2.0, 3.3));

        // Usando expressões lambda sem o par de chaves
        Calculo calculoMultiplicacaoLambda = (x, y) -> x * y;
        System.out.println("Instanciando uma função anônima: " + calculoMultiplicacaoLambda.executar(2,3.3));

    }
}
