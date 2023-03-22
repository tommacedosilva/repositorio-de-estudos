var filmes = ['Yesterday', 'A Chegada', 'Escola de Rock'];

// adiciona novos elementos
filmes.push("Harry Potter");

// ##### imprime lista de acordo com tamanho do array ##### 
for (var indice = 0; indice < 4; indice + 1) {
    document.write("<p>" + filmes[indice] + "</p>");    
}

/* Como funciona sem listas */

/* 

var filme1 = "Yesterday";
var filme2 = "A Chegada";
var filme3 = "Escola de Rock";

document.write("<p>" + filme1 + "</p>");
document.write("<p>" + filme2 + "</p>");
document.write("<p>" + filme3 + "</p>"); 

*/ 

/* Como funciona com listas */

/* 
    ##### imprime lista digitando linha por linha #####

document.write("<p>" + filmes[0] + "</p>");
document.write("<p>" + filmes[1] + "</p>");
document.write("<p>" + filmes[2] + "</p>");
document.write("<p>" + filmes[3] + "</p>"); 

*/

// **quando coloca o índice que não tem na array, aparece undefined