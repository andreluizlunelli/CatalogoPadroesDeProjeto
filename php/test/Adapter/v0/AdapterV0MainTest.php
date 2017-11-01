<?php
/**
 * User: André Lunelli <andre@microton.com.br>
 * Date: 31/10/2017
 */

namespace CatalogoPadroesDeProjetoTest\Adapter\v0;

use CatalogoPadroesDeProjeto\Adapter\v0\AdapterPlugInLegado;
use CatalogoPadroesDeProjeto\Adapter\v0\PlugInLegado;
use CatalogoPadroesDeProjeto\Adapter\v0\PlugInNovoTipoA;
use CatalogoPadroesDeProjeto\Adapter\v0\TomadaDoNovoProjeto;
use CatalogoPadroesDeProjeto\Adapter\v0\TomadaLegado;
use PHPUnit\Framework\TestCase;

class AdapterV0MainTest extends TestCase
{
    /* classes:
     * TomadaLegado
     * TomadaNova
     * PlugInNovoAdaptee
     * PlugInLegado
     */

    /**
     * Como funcionava no legado
     */
    public function testLegadoFuncionando()
    {
        $tomadaLegado = new TomadaLegado();
        $r = $tomadaLegado->conecta(new PlugInLegado());
        self::assertEquals("Conectou com PlugInLegado", $r);
    }

    /**
     * Como funcionaria com o adapter para uma nova implementação sem modificar a antiga
     */
    public function testNovaImplementacao()
    {
        $tomada = new TomadaDoNovoProjeto();
        self::assertEquals("Conectou com PlugInNovoTipoA", $tomada->conectarCom(new PlugInNovoTipoA()));

        // projeto novo conecta com classe do legado

        self::assertEquals("Conectou com PlugInLegado", $tomada->conectarCom(new AdapterPlugInLegado(new PlugInLegado())));
    }

}