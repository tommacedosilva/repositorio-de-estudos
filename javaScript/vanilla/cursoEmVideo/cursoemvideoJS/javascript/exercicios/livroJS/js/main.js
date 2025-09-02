document.getElementById('the-paragraph').innerHTML = "New content";

function alteraNome() {
    document.getElementById('name').value = "Batman";
}

function soma(a, b) {
    return a + b;
}

document.getElementsByClassName ('title').innerHTML = "Isso é um teste";

var para = document.getElementById('testeMDN');

para.addEventListener('click', atualizarNome);

function atualizarNome() {
  var nome = prompt('Insira um novo nome');
  para.textContent = 'Jogador 1: ' + nome;
}

var resultado = soma(4, 9);
resultado = resultado - 1;
console.log("A soma é: ", resultado);