package padroes.criacao.factoryMethod.v1.tiposCarro;

import padroes.criacao.factoryMethod.v1.Carro;

/**
 * Created by ANDRE on 02/02/2016.
 */
public class C206 implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro: 206\nMarca: Peugeot");
    }
}
