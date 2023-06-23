var nome = "Tom";
var notaPrimeiroBimestre = 9.42;
var notaSegundoBimestre = 7.56;
var notaTerceiroBimestre = 4.79;
var notaQuartoBimestre = 2.35;

var notaFinal = (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4;

var notaFixada = notaFinal.toFixed(1);

console.log("Bem vindo " + nome + "!");
console.log("Sua média final é: " + notaFixada);

if (notaFixada >= 6) {
    console.log("Parabéns, você passou de ano :)");
} else {
    console.log("Que pena, sua nota não foi suficiente para passar de ano :(")
}



/* Revisão 
    - Variáveis
    - Strings
    - console.log
    - toFixed
    - Operações matemáticas
    - Concatenação
*/

/* Desafios desta aula!

    - Dependendo da nota, mostrar se a aluna ou aluno foi aprovada(o) ou não ###
    - Alterar o fundo da tela da maneira que achar mais legal ###
    - Imprimir na própria página o resultado, ao invés do console
    - Criar um conversor de temperaturas entre farenheit e celsius
    - Colocar a conta inteira da média em apenas uma linha 
  
*/