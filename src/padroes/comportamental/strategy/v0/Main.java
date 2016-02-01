package padroes.comportamental.strategy.v0;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class Main {
    public static void main(String[] args) {

        /** Exemplo de uso do Padrão Strategy
         *  linha:23
         *  a
         */

        Produto p1 = new Produto("Livro", 85.60, 320);
        Produto p2 = new Produto("DVD", 40, 100);
        Produto p3 = new Produto("Video Game", 900, 2200);

        Pedido p = new Pedido();
        p.incluirItem(p1, 1);
        p.incluirItem(p2, 2);
        p.incluirItem(p3, 1);

        // strategy
        p.setTipoEntrega(new TipoEntregaSedex());

        System.out.println(p.calcularEntrega());
    }


}
