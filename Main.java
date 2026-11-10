package aula1;
import java.io.IOException;

public class Main {
    public static void main() {

        Carro mobi = new Mobi();
        Carro sandero = new Sandero();

        mobi.acelerar();
        mobi.freiar();
        mobi.parar();

        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.acelerar();
        sandero.freiar();
        sandero.parar();
        sandero.acelerar();

        Humano serHumano = new Humano();
        serHumano.respirar();
        serHumano.dormir();

    Carro meuCarroFurado = null;

    try {
        meuCarroFurado.acelerar();
    } catch (NullPointerException exception) {
        System.out.println("Vende-se Carro");
    }

    }
    
}
