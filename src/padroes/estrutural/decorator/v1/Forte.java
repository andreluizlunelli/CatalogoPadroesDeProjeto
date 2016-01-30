package padroes.estrutural.decorator.v1;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class Forte extends Decorator {
    public Forte(Pessoa pessoa) {
        super(pessoa);
        this.setQualidade("Forte");
    }

    public Forte() {
        this.setQualidade("Forte");
    }
}
