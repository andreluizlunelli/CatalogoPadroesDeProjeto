<?php
/**
 * User: André Lunelli <andre@microton.com.br>
 * Date: 01/11/2017
 */

namespace CatalogoPadroesDeProjeto\Adapter\v0;


class TomadaDoNovoProjeto
{
    public function conectarCom(PlugInInterface $plugIn)
    {
        return sprintf("Conectou com %s", $plugIn->conectar());
    }
}