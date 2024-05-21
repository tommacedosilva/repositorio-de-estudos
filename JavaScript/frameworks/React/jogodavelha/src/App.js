import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function MeuComponente({numCliques, handleClick}) {
  return (
    <button onClick={handleClick}>
      Clique aqui! Já clicou {numCliques} vezes
    </button>
  )
}
function MeuPainel() {
  const [numCliques, setNumCliques] = useState(0);
  function handleClick() {
    setNumCliques(numCliques + 1)
    console.log('Oi, isto é uma mensagem no console.')
  }
  
  return (
    <>
      <MeuComponente numCliques={numCliques} handleClick={handleClick} />
      <MeuComponente numCliques={numCliques} handleClick={handleClick} />
      <MeuComponente numCliques={numCliques} handleClick={handleClick} />
      <MeuComponente numCliques={numCliques} handleClick={handleClick} />
    </>
  )
}

export default MeuPainel;