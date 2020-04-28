package bank;

public class CalculoMensalAcaoNacional implements CalculoMensalValorizacaoAcaoStrategy{
    public double calcularValorizacao(double acoesBalance){
        System.out.println("foi calculado valorização da ação nacional");
        return acoesBalance * (0.14 / 6);
    }
}