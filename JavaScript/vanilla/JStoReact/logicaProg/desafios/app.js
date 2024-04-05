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