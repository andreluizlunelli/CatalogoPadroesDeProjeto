package padroes.criacao.factoryMethod.v1;

/**
 * Created by ANDRE on 02/02/2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Carro carro = FabricaDeCarro.criar(FabricaDeCarro.Tipos.C206);
            carro.exibirInfo();

            carro = FabricaDeCarro.criar(FabricaDeCarro.Tipos.GOL);
            carro.exibirInfo();

            carro = FabricaDeCarro.criar(FabricaDeCarro.Tipos.FIESTA);
            carro.exibirInfo();

        } catch (TipoCarroInvalidoException e){
            throw e;
        }

    }
}
