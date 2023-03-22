<?php

$conta1 = [
    'titular' => 'Tom',
    'saldo' => 2000
];

$conta2 = [
    'titular' => 'Cin',
    'saldo' => 1600
];

$conta3 = [
    'titular' => 'Demi',
    'saldo' => 1000
];

$contasCorrente = [$conta1, $conta2, $conta3];

for ($i = 0; $i < count($contasCorrente); $i++) {
    echo $contasCorrente[$i]['titular'] . PHP_EOL;
}

