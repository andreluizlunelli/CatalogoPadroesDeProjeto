package padroes.estrutural.decorator.v0.decorators;

import padroes.estrutural.decorator.v0.CoquetelAbstract;

/**
 * Created by ANDRE on 29/01/2016.
 */
public abstract class CoquetelAbstractDecorator extends CoquetelAbstract {
    private CoquetelAbstract coquetel;

    public CoquetelAbstractDecorator(CoquetelAbstract coquetel) {
        this.coquetel = coquetel;
    }

    public CoquetelAbstract getCoquetel() {
        return coquetel;
    }

    public void setCoquetel(CoquetelAbstract coquetel) {
        this.coquetel = coquetel;
    }

    @Override
    public String getNome() {
        return this.coquetel.getNome() + " + " + super.getNome();
    }

    @Override
    public double getPreco() {
        return this.coquetel.getPreco() + super.getPreco();
    }
}
