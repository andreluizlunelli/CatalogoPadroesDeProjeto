package padroes.comportamental.strategy.v0;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class TipoEntregaRetiradaLocal implements TipoEntregaStrategy {
    @Override
    public double calcular(Pedido pedido) {
        return 0;
    }
}
