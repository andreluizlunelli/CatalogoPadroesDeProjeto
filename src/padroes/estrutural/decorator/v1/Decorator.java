package padroes.estrutural.decorator.v1;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class Decorator extends Pessoa {
    private Pessoa pessoa = null;

    public Decorator(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Decorator() {
    }

    @Override
    public String getQualidade() {
        if (pessoa != null)
            return super.getQualidade() + " " + this.pessoa.getQualidade();
        return super.getQualidade();
    }

    @Override
    public String toString() {
        return getQualidade();
    }
}
