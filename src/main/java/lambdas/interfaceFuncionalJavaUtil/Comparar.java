package lambdas.interfaceFuncionalJavaUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Comparar implements Comparator<Produto> {

    /*
    * retorno positivo caso o primeiro seja maior que o segundo;
    * retorno 0 se primeiro e segundo forem iguais;
    * retorno negativo caso o primeiro seja menor que o segundo;
    */
    @Override
    public int compare(Produto produtoUm, Produto produtoDois) {
        return produtoUm.nome.toUpperCase(Locale.ROOT).compareTo(produtoDois.nome.toUpperCase(Locale.ROOT));
    }
}

class Programa {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Caneta Azul", 12.34, 0.09));
        lista.add(new Produto("Caneta Verde", 12.34, 0.09));
        lista.add(new Produto("Caneta Preta", 12.34, 0.09));

        lista.sort(new Comparar());

        lista.forEach(System.out::println);


        Comparator<Produto> comparator = new Comparator<Produto>() {
            @Override
            public int compare(Produto produtoUm, Produto produtoDois) {
                return produtoUm.nome.toUpperCase(Locale.ROOT).compareTo(produtoDois.nome.toUpperCase(Locale.ROOT));
            }
        };

        lista.sort(comparator);

        lista.forEach(System.out::println);


        //Expressão Lambda

        Comparator<Produto> comparator1 = (produto1, produto2) -> {
            return produto1.nome.toUpperCase(Locale.ROOT).compareTo(produto2.nome.toUpperCase(Locale.ROOT));
        };

        lista.sort(comparator1);
        lista.forEach(System.out::println);

        Comparator<Produto> comparator2 = (produto1, produto2) -> produto1.nome.toUpperCase(Locale.ROOT).compareTo(produto2.nome.toUpperCase(Locale.ROOT));

        lista.sort(comparator2);
        lista.forEach(produto -> System.out.println(produto));

        lista.sort((produto1, produto2) -> produto1.nome.toUpperCase(Locale.ROOT).compareTo(produto2.nome.toUpperCase(Locale.ROOT)));
        lista.forEach(produto -> System.out.println(produto));

    }
}

