<?php
/**
 * User: André Lunelli <andre@microton.com.br>
 * Date: 01/11/2017
 */

namespace CatalogoPadroesDeProjeto\Adapter\v0;

class AdapterPlugInLegado implements PlugInInterface
{
    /**
     * @var PlugInLegado
     */
    private $adaptee;

    public function __construct(PlugInLegado $plugInLegado)
    {
        $this->adaptee = $plugInLegado;
    }

    public function conectar(): string
    {
        return $this->adaptee->connect();
    }
}