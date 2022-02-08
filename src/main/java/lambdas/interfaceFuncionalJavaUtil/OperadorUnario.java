package lambdas.interfaceFuncionalJavaUtil;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = numero -> numero + 2;
        UnaryOperator<Integer> vezesDois = numero -> numero * 2;
        UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;

        //Função que faz composição de Função é a andThen

        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2));

        Integer numeroSoma = maisDois.apply(2);
        Integer numeroMultiplicacao = vezesDois.apply(numeroSoma);
        Integer numeroAoQuadrado = aoQuadrado.apply(numeroMultiplicacao);

        System.out.println(numeroAoQuadrado);

        //Função que faz composição de Função é o compose (composição de trás para frente)

        System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(2));

        Integer resultado = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(2);
        System.out.println(resultado);
    }
}
