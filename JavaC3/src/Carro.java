public class Carro {
    int velocidade = 0;
    boolean ligado = false;
    String direcao;
    String marcha = "Ponto morto";

    void ligar() {
        if (this.ligado == true) {
            System.out.println("O carro ja está ligado." );
        }
        if (this.ligado == false) {
            ligado = true;
            System.out.println("O carro foi ligado." );
        }
        
    }

    void desligar() {  
        if (this.ligado == true && this.velocidade != 0 || !this.marcha.equals("Ponto morto")) {
            System.out.println("O carro deve estar parado e no ponto morto para desligar." );
        }
        if (this.ligado == false) {
            System.out.println("O carro ja está desligado." );
        }
        if (this.ligado == true && this.velocidade == 0 && this.marcha.equals("Ponto morto")) {
            ligado = false;
            System.out.println("O carro foi desligado." );
        }
    }



}
