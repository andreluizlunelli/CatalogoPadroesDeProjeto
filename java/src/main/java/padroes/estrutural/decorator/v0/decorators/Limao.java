package padroes.estrutural.decorator.v0.decorators;

import padroes.estrutural.decorator.v0.CoquetelAbstract;

/**
 * Created by ANDRE on 29/01/2016.
 */
public class Limao extends CoquetelAbstractDecorator {
    public Limao(CoquetelAbstract coquetel) {
        super(coquetel);
        this.setNome("Limão");
        this.setPreco(1);
    }
}
