var listaFilmes = [
    "https://upload.wikimedia.org/wikipedia/pt/7/79/Yesterday_%282019%29_poster.jpg",
    "https://s2.glbimg.com/fCNS_fXPhGRwlpnAaQLzvGYC1y0=/362x536/https://s2.glbimg.com/UPI9xlM9R9O41YRqSO7R3hTNk_s=/i.s3.glbimg.com/v1/AUTH_c3c606ff68e7478091d1ca496f9c5625/internal_photos/bs/2020/q/V/Avo9ISQQO3grnARi3JCA/2020-914-a-chegada-poster.jpg",
    "https://m.media-amazon.com/images/I/91K7ZYVR-fL._AC_SY445_.jpg"
];

for (var i = 0; i < listaFilmes.length; i++) {
    document.write("<img src=" + listaFilmes[i] + ">");
}



/* Revisão 
    
*/

/* Desafios desta aula!

    - Escolher o seu tema preferido para adaptar ao nosso código, ou seja, ao invés de filmes pode ser uma lista de animes, HQ's, cursos, capas de jogos...
    - Tentar implementar outras versões da estrutura de repetição que fizemos com for, como por exemplo com foreach ou while
    - Criar uma condição para não adicionar filmes repetidos, caso eles já tenham sido adicionados anteriormente
    - Criar um campo e botão para adicionar a imagem pela tela, e não direto no código

*/