<?php

include 'funcoes.php';

$contasCorrente = [
    '12345678910' => [
        'titular' => 'Tom',
        'saldo' => 2000
    ],
    '1234567809' => [
        'titular' => 'Cin',
        'saldo' => 1600
    ],
    '1234567980' => [
        'titular' => 'Demi',
        'saldo' => 1000
    ]
];


$contasCorrente['1234567980'] = sacar(
    $contasCorrente['1234567980'],
    500
);

$contasCorrente['12345678910'] = sacar(
    $contasCorrente['12345678910'],
    300
);

$contasCorrente['1234567809'] = depositar(
    $contasCorrente['1234567809'],
    900
);

titularComLetrasMaiusculas($contasCorrente['1234567809']);

foreach ($contasCorrente as $cpf => $conta) {
    list('titular' => $titular, 'saldo' => $saldo) = $conta;
    exibeMensagem(
        "$cpf $titular $saldo"
    );
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banco do Tom</title>
</head>
<body>
    <h1>Contas corrente</h1>

    <dl>
        <?php foreach($contasCorrente as $cpf => $conta) { ?>
        <dt>
            <h3><?= $conta['titular']; ?> - <?= $cpf; ?></h3>
        </dt>
        <dd>
            Saldo: <?= $conta['saldo']; ?>
        </dd>
        <?php } ?>
    </dl>

</body>
</html>
