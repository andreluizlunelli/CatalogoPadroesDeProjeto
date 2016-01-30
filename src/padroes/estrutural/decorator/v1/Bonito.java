package padroes.estrutural.decorator.v1;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class Bonito extends Decorator {
    public Bonito(Pessoa pessoa) {
        super(pessoa);
        this.setQualidade("Bonito");
    }

    public Bonito() {
        this.setQualidade("Bonito");
    }
}
