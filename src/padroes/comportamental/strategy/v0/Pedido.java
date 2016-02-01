package padroes.comportamental.strategy.v0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class Pedido {
    private Calendar data;
    private List<ItemDePedido> itens = new ArrayList<ItemDePedido>();
    private String nomeCliente;
    private int numero;
    private TipoEntregaStrategy tipoEntrega;

    public void incluirItem(Produto p, int qtd) {
        ItemDePedido itemPedido = new ItemDePedido();
        itemPedido.setProduto(p);
        itemPedido.setQtd(qtd);
        itens.add(itemPedido);
    }

    public double getPesoTotal() {
        double peso = 0;
        for (ItemDePedido item : itens) {
            peso = peso + item.getProduto().getPeso() * item.getQtd();
        }
        return peso;
    }

    public double calcularEntrega() {
        return tipoEntrega.calcular(this);
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public List<ItemDePedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemDePedido> itens) {
        this.itens = itens;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoEntregaStrategy getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(TipoEntregaStrategy tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }
}
