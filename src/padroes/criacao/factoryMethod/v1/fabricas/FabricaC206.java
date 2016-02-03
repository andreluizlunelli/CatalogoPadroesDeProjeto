package padroes.criacao.factoryMethod.v1.fabricas;

import padroes.criacao.factoryMethod.v1.Carro;
import padroes.criacao.factoryMethod.v1.FabricaCarro;
import padroes.criacao.factoryMethod.v1.tiposCarro.C206;

/**
 * Created by ANDRE on 02/02/2016.
 */
public class FabricaC206 implements FabricaCarro {
    @Override
    public Carro criar() {
        return new C206();
    }
}
