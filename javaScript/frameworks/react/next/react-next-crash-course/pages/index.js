import React, { useState } from "react";
import List from '../src/components/List'

function Home() {

  const [done, setDone] = useState(false)
  console.log('Estado done antes', done);  
  
  function handleDoneTask() {
    setDone(prevState => !prevState)
    console.log('Estado done depois', done);
  }

  return (
    <>
      <h1>Passos para aprender React</h1>
      <List>
        <li>
          <p>Aprender sobre componentes</p>
          <p>Feito</p>
          <button>Marcar como feito</button>
        </li>
        <li>
          <p>Aprender sobre props</p>
          <p>Feito</p>
          <button>Marcar como feito</button>
        </li>
        <li>
          <p>Aprender sobre estado</p>
          <p>{done ? 'Feito' : 'A fazer'}</p>
          <button onClick={handleDoneTask}>{ done ? 'Desmarcar como feito' :  'Marcar como feito'}</button>
        </li>
        
      </List>
    </>
  );
}

export default Home;