<?php
/**
 * User: André Lunelli <andre@microton.com.br>
 * Date: 01/11/2017
 */

namespace CatalogoPadroesDeProjeto\Adapter\v0;

/**
 * Plugue de um novo projeto
 *
 * Class PlugInNovoTipoA
 * @package CatalogoPadroesDeProjeto\Adapter\v0
 */
class PlugInNovoTipoA implements PlugInInterface
{

    public function conectar(): string
    {
        return "PlugInNovoTipoA";
    }
}