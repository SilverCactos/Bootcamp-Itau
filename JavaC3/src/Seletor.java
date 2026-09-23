public class Seletor {
    
    int exercicio;

    void selecionar() {
        if (this.exercicio == 1) {
            //Exercício 1
            Conta conta1 = new Conta();
            conta1.saldo = 1000;

            conta1.pagar();
        }
    }
}
