let minhaImagem = document.querySelector('img');

minhaImagem.onclick = function() {
    let meuSrc = minhaImagem.getAttribute('src');
    if(meuSrc === '/img/david-bowie-1604289_1280.jpg') {
        minhaImagem.setAttribute ('src', 'img/segunda-foto.jpg');
    } else {
        minhaImagem.setAttribute ('src', 'img/david-bowie-1604289_1280.jpg');
    }
}

let meuBotao = document.querySelector('button');
let meuCabecalho = document.querySelector('h1');

function defineNomeUsuario() {
    let meuNome = prompt('Por favor, digite seu nome.');
    if(!meuNome || meuNome === null) {
        defineNomeUsuario();
    } else {
    localStorage.setItem('nome', meuNome);
    meuCabecalho.innerHTML = 'Música é nossa religião, ' + meuNome;
    }
}

if(!localStorage.getItem('nome')) {
    defineNomeUsuario();
} else {
    let nomeGuardado = localStorage.getItem('nome');
    meuCabecalho.textContent = 'Música é nossa religião, ' + nomeGuardado;
}

meuBotao.onclick = function() { defineNomeUsuario(); }