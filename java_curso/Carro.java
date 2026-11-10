package aula1.java_curso;
public class Carro {

    String modelo;

    public static void main(String[] args) {
        System.out.println("Linha de Chegada!");
    }
        
    public Carro (String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("O carro " + this.modelo + " está acelerando!");
    }
}