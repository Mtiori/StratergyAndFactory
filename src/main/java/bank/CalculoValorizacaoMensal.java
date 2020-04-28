package bank;

public class CalculoValorizacaoMensal {
    private final CalculoValorizacaoMensalFactory calcularValorizacao = new CalculoValorizacaoMensalFactory();

    public double calcularValorizacao(Acoes acoes, double acoesBalance){
        CalculoMensalValorizacaoAcaoStrategy interestCalculationStrategy = calcularValorizacao.getCalcularValorizacao(acoes);
        if(interestCalculationStrategy != null){
            return interestCalculationStrategy.calcularValorizacao(acoes);
        }else{
            return 0;
        }
    }

}