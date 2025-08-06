# html-css
 Curso de HTML5 e CSS3 do Curso em Video

### Conceito de Grid Layout

 É um sistema para criação de layout baseado em uma grade bidimensional e otimizado para design de interface de usuário. Nesse modelo de grade, os elementos-filhos do contêiner que defina a grade podem ser posicionados livremente em espaços criados na estrutura, quer ela tenha sido definida com suas dimensões flexíveis ou fixas.

### Anatomia de um Grid

- grid container
- grid item
- grid track > row track ou column track
- grid lines
- Numeração das grid lines são positivas e negativas

### Propriedades do container do Grid Layout

- display
    * coloquei display: grid; num componente vira grid container e tudo dentro dele vira grid-items
    * ao colocar só display grid não muda nada pois será um grid de um linha e coluna

- grid-template-columns
    * colocando auto auto que quer dizer para o grid transformar num grid de 2 colunas
    * exemplo: grid-template-columns: auto auto;

- grid-template-rows
    * ajusta tamanho dos elementos, de acordo com tamanho do grid
    * exemplo: grid-template-rows: 100px 100px;

- grip-gap
    * cria um espaço padrão entre os itens
    * exemplo: grid-gap: 20px;

- align-items
    * ajusta itens na vertical, valor padrão é stretch. Pode ser também start que cola na parte de cima, center coloca no meio do item da grade e end que cola no fim da grade
    * exemplo: align-items: stretch;

- justify-items
    * igual ao align-items tem valor padrão de stretch mas ajusta itens na horizontal. Tem também start, center e end como valores
    * exemplo: justify-items: center;

- align-content
    * content é o conjunto de todos os itens. Tem como padrão Start. Tem também como valores, center que centraliza no container, end pra ficar no final, space-between é o espaço entre eles igualmente, space-evenly terá um espaço acima, no meio e abaixo iguais entre todas as tracks, tem a space-around que redistribui deixando que o primeiro e o último item fiquem mais perto da borda, deixando mesmo ao redor mas os items no meio ficam mais espaçados pra preencher o container. Tudo isso sendo verticalmente
    * exemplo: align-content: space-between;

- justify-content
    * tudo que o align-content faz mas de forma horizontal. Mesmos valores também.
    * exemplo: justify-content: space-evenly; 

** quando tem ALIGN trabalha com alinhamento vertical | com JUSTIFY tem alinhamento horizontal. Podem ser normal ou stretch

- grid-auto-row
    * adiciona o tamanho padrão das linhas quando precisa ter uma nova linha acrescentada.
    * exemplo: grid-auto-row: 100px;

- grid-auto-column
    * mesma coisa que auto-row mas das column. Não pode colocar auto pois já foi determinado o tamanho auto antes.
    * exemplo: grid-auto-column: 100px;

- place-items
    * propriedade que configura de forma simplificada o align-items e o justify-items. Coloca o valor do align primeiro.
    * exemplo: 
        * align-items: stretch;
        * justify-items: center;
        as duas linhas acima viram:
        * place-items: stretch center;

- place-content
    * propriedade que configura de forma simplificada o align-content e o justify-content. Coloca o valor do align primeiro.
    * exemplo: 
        * align-content: start;
        * justify-content: end;
        as duas linhas acima viram:
        * place-content: start end;

- grid-template
    * simplifica as propriedades de grid-template-columns e rows. Primeiro vem os valores do row.
    * exemplo: 
        * grid-template-rows: 100px 100px 100px;
        * grid-template-columns: auto auto auto;
        as duas linhas acima viram:
        * grid-template: 100px 100px 100px / auto auto auto;

- outra forma de simplificação seria usando a função repeat()
    * grid-template-columns: repeat(3, auto);
    * grid-template-rows: repeat(3, 100px);
    * grid-template: repeat(3, 100px) / repeat(3, auto);

- fraction: dá um controle maior das áreas, invés do auto que limita todas com mesmo tamanho.
    * grid-template-columns: 1fr, 2fr, 1fr; (um layout de 1500px divide em 3 mas em 4 frações, sendo a do meio tendo dois pedaços de 375px e a primeira e última com um pedaço).
