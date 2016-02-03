package padroes.criacao.factoryMethod.v1.fabricas;

import padroes.criacao.factoryMethod.v1.Carro;
import padroes.criacao.factoryMethod.v1.FabricaCarro;
import padroes.criacao.factoryMethod.v1.tiposCarro.Palio;

/**
 * Created by ANDRE on 02/02/2016.
 */
public class FabricaPalio implements FabricaCarro {
    @Override
    public Carro criar() {
        return new Palio();
    }
}
