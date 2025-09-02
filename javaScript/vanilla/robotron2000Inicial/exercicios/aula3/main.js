// const lista = document.querySelector("ul")
// document.querySelector("#botao").addEventListener("click", () => {
//     lista.setAttribute("data-lista", "mostrar")
// })

// document.querySelector(".close").addEventListener("click", () => {
//     lista.setAttribute("data-lista", "esconder")
// })

const lista = document.querySelector('.lista')

document.querySelector('#mostrar').addEventListener('click', () => { lista.hidden = false })

document.querySelector('#ocultar').addEventListener('click', () => { lista.hidden = true })