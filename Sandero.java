package aula1;
public class Sandero implements Carro {
    
    int limiteDeVelocidade = 150;

    int velocidadeAtual = 100;


    @Override
    public void acelerar() {
        if(velocidadeAtual < limiteDeVelocidade && velocidadeAtual > 0) {
            this.velocidadeAtual += 10;
            System.out.println("O Sandero está acelerando.");
        } else if (velocidadeAtual == 0) {
            System.out.println("O Sandero estava parado, e começou a acelerar..");
            this.velocidadeAtual += 10;
        } else if (velocidadeAtual == limiteDeVelocidade) {
            System.out.println("O Sandero alcançou a velocidade máxima permitida.");
        }
        System.out.println("Velocidade Atual: " + this.velocidadeAtual);
    }

    @Override
    public void freiar() {
        if(velocidadeAtual > 0) {
            this.velocidadeAtual -= 30;
            System.out.println("O Sandero está freando.");
        }
        System.out.println("Velocidade Atual: " + this.velocidadeAtual);
    }

    @Override
    public void parar() {
        for (int i = velocidadeAtual; i > 0; i -=30) {
            this.velocidadeAtual -= 30;
            System.out.println("O sandero está parando...");
            System.out.println("Velocidade Atual: " + this.velocidadeAtual);
        }
        
        if(velocidadeAtual == 0) {
            System.out.println("O Sandero parou.");
        }

    }
}
