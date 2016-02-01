package padroes.criacao.factoryMethod.v0;

/**
 * Created by ANDRE on 01/02/2016.
 */
public class Pizzaria {
    public Pizza comprarPizza(String tipo) {
        Pizza pizza = null;
        try {
            pizza = PizzaFactoryMethod.criar(tipo);
        } catch (TipoPizzaInvalidaException e) {
            System.out.println(e);
        }
        return pizza;
    }
}
