package lambdas.interfaceFuncionalJavaUtil;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = produto -> produto.preco >= 750;

        Produto produto = new Produto("Notebook", 3500.00, 0.15);
        System.out.println(isCaro.test(produto));

        Predicate<Produto> isCaroUm = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto produtoUm = new Produto("Notebook", 3500.00,  0.85);
        System.out.println(isCaroUm.test(produtoUm));

        //Composição

        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        Predicate<Integer> isTresDigitos = numero -> numero >=100 && numero<= 999;

        System.out.println(isPar.test(122));

        // Operador lógico &&
        System.out.println(isPar.and(isTresDigitos).test(122));
        System.out.println(isPar.and(isTresDigitos).test(123));
        // Operador lógico de !
        System.out.println(isPar.and(isTresDigitos).negate().test(123));
        // Operador lógico ||
        System.out.println(isPar.or(isTresDigitos).test(123));

    }
}
