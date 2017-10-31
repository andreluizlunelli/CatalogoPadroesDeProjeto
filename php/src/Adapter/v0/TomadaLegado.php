<?php
/**
 * User: André Lunelli <andre@microton.com.br>
 * Date: 31/10/2017
 */

namespace CatalogoPadroesDeProjeto\Adapter\v0;

class TomadaLegado
{

    public function conectar(PlugInInterface $plugIn)
    {
        echo $plugIn->conectar();
    }
}