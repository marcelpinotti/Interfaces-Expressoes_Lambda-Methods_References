package lambdas.interfaceFuncionalJavaUtil;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinarioEBiFunction {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (numeroUm, numeroDois) -> (numeroUm + numeroDois) / 2;
        System.out.println(media.apply(9.8, 5.7));

        // Pode ou não passar os tipos primitivos nas variáveis
        BinaryOperator<Integer> soma = (Integer numeroUm, Integer numeroDois) -> numeroUm + numeroDois;
        System.out.println(soma.apply(3, 2));

        BiFunction<Double, Double, String> resultado =
                (numeroUm, numeroDois) -> ((numeroUm + numeroDois) / 2) >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(3.2, 4.8));

        BiFunction<Double, Double, String> resultadoUm = (numeroUm, numeroDois) -> {
            Double retorno = (numeroUm + numeroDois) / 2;
            return retorno >=7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(7.0, 7.0));

        //Composição BinaryOperator e Function
        Function<Double, String> aprovadoReprovado = medias -> medias >=7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(aprovadoReprovado).apply(7.0, 7.0));

    }

}
