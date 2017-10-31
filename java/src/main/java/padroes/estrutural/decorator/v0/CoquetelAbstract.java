package padroes.estrutural.decorator.v0;

/**
 * Created by ANDRE on 28/01/2016.
 */
public abstract class CoquetelAbstract {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return getNome() + " " + getPreco();
    }
}
