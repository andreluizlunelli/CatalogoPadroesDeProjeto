package padroes.comportamental.strategy.v0;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class ItemDePedido {
    private Produto produto;
    private int qtd;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
