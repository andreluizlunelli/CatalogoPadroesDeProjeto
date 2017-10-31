package padroes.estrutural.decorator.v1;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class Alto extends Decorator {

    public Alto(Pessoa pessoa) {
        super(pessoa);
        setQualidadePadrao("Alto");
    }

    public Alto() {
        setQualidadePadrao("Alto");
    }


}
