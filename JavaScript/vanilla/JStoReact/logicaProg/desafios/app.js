/* Desafio parte 1 */

let titulo = document.querySelector('h1')
titulo.innerHTML = "Hora do Desafio"

function clicaConsole() {
    console.log('O botão foi clicado')
}

function clicaAlert() {
    alert("Eu amo JS")
}

function clicaPrompt() {
    let resposta = prompt("Diga uma cidade do Brasil")
    alert(`Estive em  + ${resposta} +  e lembrei de você`)
}

function clicaSoma() {
    let n1 = parseInt(prompt("Digite um número"))
    let n2 = parseInt(prompt("Digite outro número"))
    let soma = n1 + n2
    alert(soma) 
}


/* Desafio parte 2 */

function hello() {
    console.log('Olá, mundo!');
}

hello()

function seuNome() {
    let nome = prompt('Digite seu nome:')
    console.log(`Olá, ${nome}!`);
}

seuNome()

function calculaDobro(numero) {
    return numero * 2
}

let resultadoDoDobro = calculaDobro(5)
console.log(resultadoDoDobro);


function calculaMedia(a, b, c) {
    return (a + b + c) / 3
}

let media = calculaMedia(8, 9, 10)
console.log(media);


function encontraMaior(a, b) {
    return a > b ? a : b
}

let maiorNumero = encontraMaior(19, 8)
console.log(maiorNumero);


function multiplicaNum(numero) {
    return numero * numero
}

let resultadoMultiplicado = multiplicaNum(10)
console.log(resultadoMultiplicado);


/* Desafio parte 3 */

function imc(altura, peso) {
    let imc = peso / (alturaMetros * alturaMetros)
}

function calcularFatorial(numero) {
    if (numero == 0 || numero == 1) {
        return 1
    }

    let fatorial = 1
    for (let i = 2; i < numero; i++) {
        fatorial *= 1        
    }

    return fatorial
}

