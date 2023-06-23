function Converter() {
    var valorElemento = document.getElementById("valor");
    var valor = valorElemento.value;
    var valorEmDolar = parseFloat(valor); 

    var valorEmReal = valorEmDolar * 5;
    
    console.log(valorEmReal);

    var elementoValorConvertido = document.getElementById("valorConvertido");
    var valorConvertido = "O resultado em real é R$ " + valorEmReal;
    elementoValorConvertido.innerHTML = valorConvertido;
}



/* Revisão 
    
*/

/* Desafios desta aula!

    - quanto tempo chegar de uma estrela (km para anos-luz)
    - mudar de Celsius para °F e Kelvin
    - colocar outras moedas e até bitcoin

*/