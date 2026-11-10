package aula1;
public class Humano extends SerVivo {
    
    public Humano() {
        super(25);
    }
    @Override
    public void respirar() {
        System.out.println("Idade: " + this.idade);
        System.out.println("Respirando...");
    }
}
