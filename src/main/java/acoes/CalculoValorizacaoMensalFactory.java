package acoes;

public class CalculoValorizacaoMensalFactory {
    private final CalculoMensalValorizacaoAcaoStrategy valorizacaoAcaoInternacional = new CalculoMensalAcaoInternacional();
    private final CalculoMensalValorizacaoAcaoStrategy valorizacaoAcaoNacional = new CalculoMensalAcaoNacional();

    public CalculoMensalValorizacaoAcaoStrategy getCalculoJuros(Acoes acoes){
        switch (acoes){
            case ACAO_INTERNACIONAL: return valorizacaoAcaoInternacional;
            case ACAO_NACIONAL: return valorizacaoAcaoNacional;
            default:
                return null;
        }
    }
    
}
