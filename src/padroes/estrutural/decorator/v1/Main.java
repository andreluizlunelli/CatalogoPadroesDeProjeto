package padroes.estrutural.decorator.v1;

/**
 * Created by ANDRE on 30/01/2016.
 */
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Bonito();
        System.out.println(p);

        p = new Alto(p);
        System.out.println(p);

        p = new Forte(p);
        System.out.println(p);

    }
}
