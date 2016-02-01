package padroes.comportamental.strategy.v0;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class Produto {
    private String descricao;
    private double peso;
    private double valor;

    public Produto(String descricao, double peso, double valor) {
        this.descricao = descricao;
        this.peso = peso;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
