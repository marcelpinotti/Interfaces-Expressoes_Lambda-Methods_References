package lambdas.interfaceFuncionalJavaUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupridorFornecedor {

    public static void main(String[] args) {

        Supplier<List<String>> umaLista = () -> Arrays.asList("Bia", "Lia", "Gui", "Ana");

        System.out.println(umaLista.get());

        //Composição Supplier -> Consumer
        umaLista.get().forEach(System.out::println);
    }
}
