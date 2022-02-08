package lambdas.conceitoDeLambdasAntesdoJavaOito;

public class Threads {

    public static void main(String[] args) {


        Runnable trabalhoUm = new Trabalho();

        Runnable trabalhoDois = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println("Trabalho 2");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                    }
                }
            }
        };

        //Utilizando uma Expressão Lambda para instanciar uma interface
        Runnable trabalhoTres = () ->{
            for (int i = 0; i < 10; i++){
                System.out.println("Trabalho 3");
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                }
            }
        };

        //Utilizando Methods Reference
        Runnable tabalhoQuatro = Threads::trabalhoQuatro;


        Thread threadUm = new Thread(trabalhoUm);
        Thread threadDois = new Thread(trabalhoDois);
        Thread threadTres = new Thread(trabalhoTres);
        Thread threadQuatro = new Thread(tabalhoQuatro);

        threadUm.start();
        threadDois.start();
        threadTres.start();
        threadQuatro.start();

    }

    static void trabalhoQuatro(){
        for (int i = 0; i < 10; i++){
            System.out.println("Trabalho 4");
            try {
                Thread.sleep(100);
            }catch (Exception e){
            }
        }
    }
}
