<?php
/**
 * User: André Lunelli <andre@microton.com.br>
 * Date: 31/10/2017
 */

namespace CatalogoPadroesDeProjeto\Adapter\v0;

class PlugInLegado implements PlugInInterface
{

    public function conectar(): string
    {
        return "PlugInLegado";
    }
}