<?php

$contasCorrente = [
    12345678910 => [
        'titular' => 'Tom',
        'saldo' => 2000
    ],
    1234567809 => [
        'titular' => 'Cin',
        'saldo' => 1600
    ],
    1234567980 => [
        'titular' => 'Demi',
        'saldo' => 1000
    ]
];

$contasCorrente[123457689701] = [
    'titular' => 'Claudia',
    'saldo' => 3000
];

foreach ($contasCorrente as $cpf => $conta) {
    echo $cpf . " " . $conta['titular'] . PHP_EOL;
}