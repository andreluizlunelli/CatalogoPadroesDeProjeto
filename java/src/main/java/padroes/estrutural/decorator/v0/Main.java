package padroes.estrutural.decorator.v0;

import padroes.estrutural.decorator.v0.decorators.Refrigerante;

/**
 * Created by ANDRE on 29/01/2016.
 */
public class Main {
    public static void main(String[] args) {
        CoquetelAbstract coquetel = new Cachaca();
        System.out.println(coquetel);

        coquetel = new Refrigerante(coquetel);
        System.out.println(coquetel);


    }
}
