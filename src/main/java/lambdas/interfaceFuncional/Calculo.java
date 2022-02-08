package lambdas.interfaceFuncional;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);

    default String metodoDefault(){
        return "Esse é um método default dentro de uma FunctionalInterface!";
    }

    default String metodoDefaultUm(){
        return "Esse é um método defaultUm dentro de uma FunctionalInterface!";
    }

    static void metodoStatic(){
        System.out.println("Esse é um método static dentro de uma FunctionalInterface!");
    }
}
