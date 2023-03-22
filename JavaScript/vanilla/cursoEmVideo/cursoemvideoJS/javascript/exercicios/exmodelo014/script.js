function carregar() {
    var msg = window.document.getElementById(`msg`)
    var img = window.document.getElementById(`imagem`)
    var data = new Date()
    var hora = data.getHours()
    //var hora = 5
    msg.innerHTML = `Agora são ${hora} horas.`
    if (hora >= 0 && hora < 12) {
        // Bom dia
        img.scr = 'fotomanha.png'
        document.body.style.background = '#7d6115'
    } else if (hora >= 12 && hora <= 18) {
        // Boa tarde
        img.src = 'fototarde.png'
        document.body.style.background = '#fcb34d'
    } else {
        // Boa noite
        img.src = 'fotonoite.png'
        document.body.style.background = '#0452c1'
    }
}

