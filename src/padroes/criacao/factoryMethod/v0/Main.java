package padroes.criacao.factoryMethod.v0;

/**
 * Created by ANDRE on 01/02/2016.
 */
public class Main {
    public static void main(String[] args) {
        String tipo = "queijo";
        Pizzaria pizzaria = new Pizzaria();
        Pizza pizza = pizzaria.comprarPizza(tipo);
        System.out.println(pizza);
    }
}
