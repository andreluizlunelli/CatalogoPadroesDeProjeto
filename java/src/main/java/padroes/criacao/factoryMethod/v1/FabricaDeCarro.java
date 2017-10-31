package padroes.criacao.factoryMethod.v1;

import padroes.criacao.factoryMethod.v1.tiposCarro.*;

/**
 * Created by ANDRE on 02/02/2016.
 */
public class FabricaDeCarro {

    public enum Tipos {PALIO, GOL, CLIO, C206, FIESTA}

    public static Carro criar(Tipos tipoCarro) {
        switch (tipoCarro) {
            case PALIO: return new Palio();
            case GOL: return new Gol();
            case CLIO: return new Clio();
            case C206: return new C206();
            default: throw new TipoCarroInvalidoException();
        }
    }
}
