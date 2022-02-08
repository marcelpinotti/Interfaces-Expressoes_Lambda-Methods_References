package lambdas.interfaceFuncionalJavaUtil;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(33));
        System.out.println(parOuImpar.apply(32));

        /*
        * Composição de função = parOuImpar <Integer, String> -> oREsultadoE <String, String>
        * Entra -> (Sai -> Entra) -> Sai
        * Integer -> (String -> String) -> String
         */

        Function<String, String> oResultadoE = resultado -> "O resultado é " + resultado;

        String resultado = parOuImpar.apply(32);
        System.out.println(oResultadoE.apply(resultado));

        resultado = parOuImpar.andThen(oResultadoE).apply(22);
        System.out.println(resultado);

        System.out.println(oResultadoE.apply(parOuImpar.apply(33)));

    }
}
