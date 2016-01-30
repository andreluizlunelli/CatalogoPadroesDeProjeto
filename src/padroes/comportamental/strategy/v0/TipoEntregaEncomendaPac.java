package padroes.comportamental.strategy.v0;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class TipoEntregaEncomendaPac implements TipoEntregaStrategy {
    @Override
    public double calcular(Pedido pedido) {
        double peso = pedido.getPesoTotal();
        if (peso <= 1000)
            return 10;
        else if (peso <= 2000)
            return 15;
        else if (peso <= 3000)
            return 20;
        else if (peso <= 5000)
            return 30;
        else
            throw new PesoEntregaInvalidoException("Peso inválido");
    }
}
