package lambdas.IntefaceFuncionalJavaLangFuction;

import java.util.function.BinaryOperator;

public class CalculoTeste {

    public static void main(String[] args) {

        // Generics só permite tipo primitivo.
        BinaryOperator<Double> calcularBinaryOperator = (x , y) -> x + y;
        System.out.println("Usando a FunctionalInterface BinaryOperator do java.util. O Resultado é: " + calcularBinaryOperator.apply(4.4 ,4.6));

        calcularBinaryOperator = (x , y) -> { return x - y; };
        System.out.println("Usando a FunctionalInterface BinaryOperator do java.util. O Resultado é: " + calcularBinaryOperator.apply(8.6 ,4.6));
    }
}
