package bank;

public class CalculoMensalAcaoInternacional implements CalculoMensalValorizacaoAcaoStrategy {
    public double calcularValorizacao(double acoesBalance){
        System.out.println("foi calculado valorização da ação internacional");
        return acoesBalance * (0.22 / 12);
    }
}