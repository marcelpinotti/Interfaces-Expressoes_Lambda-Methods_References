package lambdas.forEach;

import java.util.Arrays;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<String> aprovados = Arrays
                .asList("Ana", "Lia", "Bia", "Gui");

        for (int i = 0; i >= aprovados.size(); i++){
            System.out.println("For): " + aprovados.get(i));
        }

        for(String nome : aprovados){
            System.out.println("Foreach: " + nome);
        }

        aprovados.forEach((nome) -> {System.out.println( "Lambda foreach - forma 1: " + nome);});

        aprovados.forEach(nome -> System.out.println("Lambda foreach - forma 2: " + nome));

        System.out.println("Lambda foreach - method reference - forma 3: ");
        aprovados.forEach(System.out::println);

        aprovados.forEach(nome -> imprimir(nome));

        aprovados.forEach(Teste::imprimirMethod);


    }
    static void imprimir(String nome){
        System.out.println("Função Static para impressão personalizaada do Foreach Lambda: " + nome);
    }

    static void imprimirMethod(String nome){
        System.out.println("Função Static para impressão personalizaada do Foreach Method Reference: " + nome);
    }
}
