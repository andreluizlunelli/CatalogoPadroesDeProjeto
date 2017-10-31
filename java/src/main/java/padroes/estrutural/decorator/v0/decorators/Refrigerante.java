package padroes.estrutural.decorator.v0.decorators;

import padroes.estrutural.decorator.v0.CoquetelAbstract;

/**
 * Created by ANDRE on 29/01/2016.
 */
public class Refrigerante extends CoquetelAbstractDecorator {
    public Refrigerante(CoquetelAbstract coquetel) {
        super(coquetel);
        setNome("Refrigerante");
        setPreco(3.50);
    }
}
