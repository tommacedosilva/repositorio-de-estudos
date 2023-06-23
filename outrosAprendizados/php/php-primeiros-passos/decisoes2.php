<?php 

$idade = 31;
$numeroDePessoas = 1;

echo "Você só pode entrar se tiver a partir de 18 anos ou."; 
echo "a partir de 16 acompanhada(o)" . PHP_EOL;

if ($idade >= 18) {
    echo "Você tem $idade anos. Pode entrar sozinha(o)";
} else if ($idade >= 16 && $numeroDePessoas > 1) {
    echo "Você tem $idade anos, está acompanhada(o), então pode entrar.";
} else {
    echo "Você só tem $idade anos. Você não pode entrar";
}

echo PHP_EOL; 
echo "Adeus!";