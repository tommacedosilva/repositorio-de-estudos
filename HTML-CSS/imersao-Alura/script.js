const searchInput = document.getElementById('search-input')
const resultArtist = document.getElementById('result-artist')
const resultPlaylist = document.getElementById('result-playlists')

function requestAPI(searchTerm) {
    const url = `http:localhost:3000/artists?name_like=${searchTerm}`
    fetch(url)
        .then((response) => response.json())
        .then((result) => displayResult(result))
}

document.addEventListener('input', () => {
    const searchTerm = searchInput.value.toLowerCase()
    
    if(searchTerm === '') {
        resultPlaylist.classList.add('hidden')
        resultArtist.classList.remove('hidden')
        return
    }
})