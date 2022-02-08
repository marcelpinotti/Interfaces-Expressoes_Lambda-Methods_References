package lambdas.interfaceFuncional;

public class CalculoTeste {

    public static void main(String[] args) {

        Calculo calculoInterface = (x, y) -> { return x - y; };
        System.out.println("Instanciando através da interface: " + calculoInterface.executar(4,3));
        calculoInterface = (x, y) -> x / y;
        System.out.println("Instanciando através da interface: " + calculoInterface.executar(6.6,3.3));
        System.out.println("Instanciando através de um método default da interface: " + calculoInterface.metodoDefault());
        Calculo.metodoStatic();
    }
}
