function verificar() {
    var data = new Date()
    var ano = data.getFullYear()
    var formAno = document.getElementById(`txtano`)
    var res = document.querySelector(`div#res`)
    if (formAno.value.length == 0 || formAno.value > ano) {
        window.alert(`[ERRO] Verifique os dados e tente novamente!`)
    } else {
        var formSex = document.getElementsByName(`radsex`)
        var formIdade = ano - Number(formAno.value)
        var gênero = ``
        var img = document.createElement(`img`)
        img.setAttribute(`id`, `foto`)
        if (formSex[0].checked) {
            gênero = `Homem`
            if(formIdade >=0 && formIdade < 10) {
                // criança
                img.setAttribute(`src`, `foto-menino.png`)
            } else if (formIdade < 21) {
                // jovem
                img.setAttribute(`src`, `foto-jovem-h.png`)
            } else if (formIdade < 50) {
                // adulto
                img.setAttribute(`src`, `foto-adulto-h.png`)
            } else {
                // idoso
                img.setAttribute(`src`, `foto-idoso.png`)
            }
        } else if (formSex[1].checked) {
            gênero = `Mulher`
            if(formIdade >=0 && formIdade < 10) {
                // criança
                img.setAttribute(`src`, `foto-menina.png`)
            } else if (formIdade < 21) {
                // jovem
                img.setAttribute(`src`, `foto-jovem-m.png`)
            } else if (formIdade < 50) {
                // adulto
                img.setAttribute(`src`, `foto-adulto-m.png`)
            } else {
                // idoso
                img.setAttribute(`src`, `foto-idosa.png`)
            }
        }
        res.style.textAlign = `center`
        res.innerHTML = `Detectamos ${gênero} com ${formIdade} ano(s).`
        res.appendChild(img)
    }
}