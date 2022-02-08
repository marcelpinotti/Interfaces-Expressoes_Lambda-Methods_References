package lambdas.interfaceFuncionalJavaUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        /*
        *foreach tem como parâmetro recebido é o Consumer (função que recebe um parâmetro e
        * não retorna nada.
         */

        Consumer<Produto> imprimir = p -> System.out.println("Produto -> " + p.nome);

        Produto produto = new Produto("Caneta Azul", 12.34, 0.09);
        imprimir.accept(produto);

        Produto produtoUm = new Produto("Caneta Preta", 12.34, 0.09);
        Produto produtoDois = new Produto("Caneta Verde", 12.34, 0.09);
        Produto produtoTres = new Produto("Caneta Vermelha", 12.34, 0.09);
        Produto produtoQuatro = new Produto("Caneta Marron", 12.34, 0.09);
        Produto produtoCinco = new Produto("Caneta Bege", 12.34, 0.09);


        List<Produto> produtos = Arrays.asList(produto, produtoUm, produtoDois,
                produtoTres, produtoQuatro, produtoCinco);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.nome));
        produtos.forEach(System.out::println);

    }
}
