<?php

$peso = 78.25;
$altura = 1.74;
$imc = $peso / $altura ** 2;

if ($imc < 18.5) {
    echo "Seu IMC é de $imc. Isso indica que você está abaixo do peso ideal";
} else if ($imc <= 24.9) {
    echo "Seu IMC é de $imc. Isso indica que você está no peso ideal";
} else {
    echo "Seu IMC é de $imc. Isso indica que você está acima do peso ideal";
}