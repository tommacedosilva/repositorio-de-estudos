function adicionarFilme() {
    var filmeFavorito = document.getElementById("filme").value;
    if (filmeFavorito.endsWith(".jpg")) {
        listarFilmes(filmeFavorito);
    } else {
        console.error("Endereço de filme inválido");
    }

    document.getElementById("filme").value = ""

}

function listarFilmes(filme) {
    var valorFilme = "<img src=" + filme + ">";
    var listaFilmes = document.getElementById("listaFilmes");
    listaFilmes.innerHTML = listaFilmes.innerHTML + valorFilme;
}



/* Revisão 
    
*/

/* Desafios desta aula!
     - Criar um botão para remover um filme na tela
     - Além de colocar a imagem do filme, também adicionar o nome por meio de outro input
     - Guardar todos os filmes adicionados em uma lista/array e percorrer essa lista toda vez que quiser imprimir ou remover o filme
     - Conversor de moedas: criar funções para cada tipo de conversão e chamá-las dependendo do que você quiser fazer, podendo colocar inputs ou botões e quando clicar chamar cada função converteDolar(), converteReal(), converteEuro() e converteBitcoin(), por exemplo
    

*/