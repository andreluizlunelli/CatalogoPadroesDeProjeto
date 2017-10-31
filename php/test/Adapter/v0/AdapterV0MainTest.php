<?php
/**
 * User: André Lunelli <andre@microton.com.br>
 * Date: 31/10/2017
 */

namespace CatalogoPadroesDeProjetoTest\Adapter\v0;

use CatalogoPadroesDeProjeto\Adapter\v0\PlugInLegado;
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

    public function testLegadoFuncionando()
    {
        $tomadaLegado = new TomadaLegado();
        $tomadaLegado->conectar(new PlugInLegado());
    }

}