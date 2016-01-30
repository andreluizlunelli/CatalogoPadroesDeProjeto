package padroes.estrutural.decorator.v1;

import java.util.Set;

/**
 * Created by ANDRE on 30/01/2016.
 */
public abstract class Pessoa {
    private Set<String> qualidade;

    public Set<String> getQualidade() {
        return qualidade;
    }

    public void setQualidade(Set<String> qualidade) {
        this.qualidade = qualidade;
    }
}
