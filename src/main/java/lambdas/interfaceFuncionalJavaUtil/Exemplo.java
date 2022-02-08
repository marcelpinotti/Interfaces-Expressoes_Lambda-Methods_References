package lambdas.interfaceFuncionalJavaUtil;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Exemplo {

    public static void main(String[] args) {

        /*
        * 1. A partir do produto calcular o preço real (com desconto);
        * 2. Imposto Municipal: >= 2500 (8.5%) / < 2500 (isento);
        * 3. Frete: >= 3000 (100) / < 3000 (50)
        * 4. Arredondar: Deixar com duas casas decimais
        * 5. Formatar: R$1234,56
         */

        Produto produto = new Produto("iPad", 3235.00, 0.13);

        System.out.println("Solução #1");

        Function<Produto, Double> precoReal = produto1 -> produto1.preco - (produto1.preco * produto1.desconto);
        UnaryOperator<Double> impostoMunicipal= preco -> preco >= 2500.00 ? (preco + (preco * 0.085)) : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000.00 ? (preco + 100) : (preco + 50);
        Function<Double, String> arredondar = precoFinal -> {
            DecimalFormat decimalFormat = new DecimalFormat("###.00");
            return decimalFormat.format(precoFinal);
        };
        UnaryOperator<String> cifra = formatado -> "R$ " + formatado.replace(".", ",");

        System.out.println(precoReal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(cifra).apply(produto));

        // Solução proposta pelo curso, para mim está dando uma Exception NumberFormatException -> linha 43 conversão -> Double.parseDouble(String.format("%.2f", preco));

//        System.out.println("\nSolução #2");
//
//        Function<Produto, Double> precoUm =
//                produto1 -> produto1.preco - (produto1.preco * produto1.desconto);
//        UnaryOperator<Double> impostoMunicipalUm =
//                preco -> preco >= 2500.00 ? (preco + (preco * 0.5)) : preco;
//        UnaryOperator<Double> freteUm =
//                preco -> preco >= 3000.00 ? (preco + 100) : (preco + 50);
//        UnaryOperator<Double> arredondarUm =
//                preco -> Double.parseDouble(String.format("%.2f", preco));
//        Function<Double, String> cifraUm =
//                formatado -> ("R$ " + formatado).replace("." , ",");
//
//        System.out.println(precoUm.andThen(impostoMunicipalUm).andThen(freteUm).andThen(arredondarUm).andThen(cifraUm).apply(produto));
//
    }
}
