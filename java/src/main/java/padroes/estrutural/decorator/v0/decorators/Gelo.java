package padroes.estrutural.decorator.v0.decorators;

import padroes.estrutural.decorator.v0.CoquetelAbstract;

/**
 * Created by ANDRE on 29/01/2016.
 */
public class Gelo extends CoquetelAbstractDecorator {
    public Gelo(CoquetelAbstract coquetel) {
        super(coquetel);
        setNome("Gelo");
        setPreco(1);
    }
}
