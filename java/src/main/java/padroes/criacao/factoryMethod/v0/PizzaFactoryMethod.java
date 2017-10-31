package padroes.criacao.factoryMethod.v0;

/**
 * Created by ANDRE on 01/02/2016.
 */
public class PizzaFactoryMethod {
    public static Pizza criar(String tipo) throws TipoPizzaInvalidaException {
        Pizza pizza = null;
        if (tipo.equals("queijo")) {
            pizza = new PizzaQueijo();
        } else if (tipo.equals("brocolis")) {
            pizza = new PizzaBrocolis();
        } else if (tipo.equals("peperoni")) {
            pizza = new PizzaPeperoni();
        } else {
            throw new TipoPizzaInvalidaException("Tipo de pizza inválido");
        }
        return pizza;
    }
}
