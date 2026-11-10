package aula1;
public class Mobi implements Carro {
    
    @Override
    public void acelerar() {
        System.out.println("O Mobi está acelerando.");
    }

    @Override
    public void freiar() {
        System.out.println("O Mobi está freando.");
    }

    @Override
    public void parar() {
        System.out.println("O Mobi parou.");
    }
}
