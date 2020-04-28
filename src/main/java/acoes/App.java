package acoes;

public class App {
    public static void main(String[] args) {
        CalculoValorizacaoMensal internacional = new CalculoValorizacaoMensal();
        internacional.calcularValorizacao(Acoes.ACAO_INTERNACIONAL, 3000);

        CalculoValorizacaoMensal nacional = new CalculoValorizacaoMensal();
        nacional.calcularValorizacao(Acoes.ACAO_NACIONAL, 27000);
    }
}