let num = [5,8,4,6,7] // array com 5 elementos
num.push(2) // adiciona o número 2 no array
num.sort() // organiza os elementos
console.log(num) // mostra o vetor
console.log(`O vetor tem ${num.length} posições`) // mostra quantas posições o vetor tem
console.log(`O primeiro valor do vetor é ${num[0]}`) // mostra o primeiro valor do vetor
let pos = num.indexOf(8)
if (pos == -1) {
    console.log(`O valor não foi encontrado`)
} else {
    console.log(`O valor 8 está na posição ${pos}`)
}
