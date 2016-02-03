package padroes.criacao.factoryMethod.v1.v1_2;

import padroes.criacao.factoryMethod.v1.Carro;
import padroes.criacao.factoryMethod.v1.FabricaCarro;
import padroes.criacao.factoryMethod.v1.tiposCarro.C206;
import padroes.criacao.factoryMethod.v1.tiposCarro.Clio;
import padroes.criacao.factoryMethod.v1.tiposCarro.Gol;
import padroes.criacao.factoryMethod.v1.tiposCarro.Palio;

/**
 * Created by ANDRE on 02/02/2016.
 */
public class Fabrica2 {

    public Carro criar(Tipos tipoCarro) {
        switch (tipoCarro) {
            case PALIO: return new Palio();
            case GOL: return new Gol();
            case CLIO: return new Clio();
            case C206: return new C206();
            default: throw new TipoCarroInvalidoException();
        }
    }
}
