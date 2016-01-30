package padroes.estrutural.decorator.v1;

/**
 * Created by ANDRE on 30/01/2016.
 */
public abstract class Pessoa {
    private String qualidade;

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "qualidade='" + qualidade + '\'' +
                '}';
    }
}
