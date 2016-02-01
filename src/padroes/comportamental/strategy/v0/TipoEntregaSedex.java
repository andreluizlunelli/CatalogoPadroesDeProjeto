package padroes.comportamental.strategy.v0;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class TipoEntregaSedex implements TipoEntregaStrategy {
    @Override
    public double calcular(Pedido pedido) {
        double peso = pedido.getPesoTotal();
        if (peso <= 500)
            return 12.50;
        else if (peso <= 750)
            return 20;
        else if (peso <= 1200)
            return 30;
        else if (peso <= 2000)
            return 45;
        else {
            double pesoExtra = peso - 2000;
            return 46.5 + (1.5 * ( (int) pesoExtra / 100));
        }
    }
}
