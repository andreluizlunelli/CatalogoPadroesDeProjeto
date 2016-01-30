package padroes.estrutural.decorator.v1;

import java.util.HashSet;
import java.util.Set;

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

    private Set<String> concatenarSets(Set<String> set1, Set<String> set2) {
        set1.addAll(set2);
        return set1;
    }

    protected void setQualidadePadrao(String value) {
        Set<String> s = new HashSet<String>();
        s.add(value);
        this.setQualidade(s);
    }

    @Override
    public Set<String> getQualidade() {
        if (pessoa != null)
            return concatenarSets(super.getQualidade(), pessoa.getQualidade());
        return super.getQualidade();
    }

    @Override
    public String toString() {
        return "Decorator{" +
                "qualidade=" + getQualidade().toString() +
                '}';
    }


}
