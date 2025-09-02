const meuCabecalho = document.querySelector('h1');
meuCabecalho.textContent = 'Olá, mundo!';

/* Variáveis */

let minhaVariavel = 'Tom';

minhaVariavel;

let outraVariavel = 19;

let essaVariavel = true;

let estaVariavel = [31, 'Tom', 'Cin', 26];

/* Operadores */

let minhaVariavel = "Hi " + "I´m Tom";

let outraVariavel = 31 - 26;

/* Condicionais */

let sorvete = 'chocolate';

if (sorvete === 'chocolate') {
    alert('Opa, eu amo sorvete de chocolate!');
} else {
    alert('Ahh, mas chocolate é meu favorito...');
}

/* Funções */

function multiplica(num1, num2) {
    let resultado = num1 * num2;
    return resultado;
}

multiplica(20, 20); // retorna 400

/* Eventos */

document.querySelector('html').onclick = function() {
    alert('Ai! Pare de me cutucar!');
}
