package lambdas.interfaceFuncionalJavaUtil;

import java.text.DecimalFormat;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("###.00");
        return "Nome: " + nome +
                " | Preço: " + preco +
                " -> Preço com Desconto: R$ " + decimalFormat.format((preco - (preco * desconto)));
    }
}
