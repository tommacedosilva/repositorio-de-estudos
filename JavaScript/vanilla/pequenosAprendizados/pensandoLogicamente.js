// Dado uma array de números que pode ou não conter arrays de números internas, escreva uma função que retorne uma array de números não repetidos.

// Olhar o problema ao contrário -> tenho os dados de entrada e como espero dados na saída

const array = [1, 2, 3, [1, 2, 3, 5, 6, 7], 8, 9, [7, 0], 8, 9, 2, 10]
// result = [1, 2, 3, 5, 6, 7, 8, 9, 0, 10]

function flatterWithRecursive(arr, result = []) {
    for (let i = 0; i < arr.length; i++) {
        if (Array.isArray(arr[i])) {
            flatterWithRecursive(arr[i], result)           
        } else {
            if (!result.includes(arr[i])) {
                result.push(arr[i])
            }
        }        
    }
    return result
}

function flatterWithForEach(arr) {
    const flatArray = arr.flat(Infinity)
    const result = []
    flatArray.forEach(val => {
        if (!result.includes(val)) {
            result.push(val)
        }
    })
}

function flatterWithFilter(arr) {
    const flatArray = arr.flat(Infinity)
    return flatArray.filter((val, index) => flatArray.indexOf(val) === index)
}

function flatterWithSet(arr) {
    return [...new Set(arr.flat(Infinity))]
}

console.log(flatterWithRecursive(array))
console.log("--------------");
console.log(array);

