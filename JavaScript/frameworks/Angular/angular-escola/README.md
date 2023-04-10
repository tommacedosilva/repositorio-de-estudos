# AngularEscola

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 15.2.4.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.


################################################################################################################################################################################

Software de Gerenciamento Escolar

Contexto da escola

  No contexto desse livro o gerenciamento escolar é aplicado em uma escola fictícia com as seguintes características:

    - a estrutura de pessoal (recursos humanos) tem as seguintes características:
         funcionários são pessoas contratadas para ocupar cargos e realizar funções
         um funcionário tem um cargo
         um funcionário tem uma ou mais funções
         um funcionário pode ser: administrativo ou docente
    - a estrutura acadêmica da escola tem as seguintes características:
         há três níveis de ensino: ensino infantil, ensino fundamental, ensino médio
         cada nível de ensino pode ser organizado em anos de ensino e cada um possui disciplinas
         a relação entre nível de ensino e ano de ensino é chamada de estrutura curricular, cada qual com disciplinas e suas cargas horárias anuais
         uma turma é quando um item do componente curricular é ministrado durante um ano letivo e tem as seguintes características:
             pode ter um ou mais professores por disciplina
             pode ter um ou mais alunos
                 matrícula é quando um aluno é matriculado em uma turma e cursa todas as disciplinas do ano letivo
             fisicamente, está presente em uma sala de aula (sala padrão)
             uma aula é quando conteúdos didáticos de uma disciplina da turma são trabalhados com professores e alunos em horários específicos na semana
             uma aula pode ter participação de um ou mais professores [da turma]
             uma aula pode ser realizada na sala de aula padrão da turma ou em instalação física
             uma aula é realizada em um dia da semana, em um horário específico (informação utilizada para compor a grade horária)
             em cada aula o professor registra a frequência do aluno (presença ou falta)
             cada aula tem a duração de 50 minutos e conta como uma hora (na Carga Horária)
         os conteúdos das aulas são organizados em bimestres e, por isso, são realizadas avaliações bimestrais, totalizando quatro (para cada disciplina) no ano letivo
         ao final do ano letivo:
             as quatro notas são utilizadas para compor a nota final, que é uma média aritmética das notas dos bimestres
             o aluno é considerado "APROVADO" na disciplina se tiver média aritmética igual ou superior a 6,0 e frequência superior a 75%
             o aluno que não conseguir nota final suficiente pode realizar uma prova de recuperação, cuja nota substitui a nota final. Por fim, se o aluno não obtiver nota igual ou superior a 6,0 na recuperação ele é considerado "REPROVADO"
             em situações excepcionais o aluno pode ser considerado "APROVADO" em conselho de classe (uma reunião realizada ao final do ano letivo com os professores)
         com exceção do ensino infantil, o aluno só pode ser matriculado no ano seguinte se tiver sido aprovado em todas as disciplinas do ano corrente
    - a estrutura física da escola tem as seguintes características:
         uma instalação física pode ser: prédio, sala admnistrativa, laboratório ou sala de aula

Gerenciamento escolar

  Com base nas características da escola usada nesse contexto, o software de gerenciamento escolar compreende os seguintes requisitos conforme os atores:

      gerente do sistema
          gerenciar o cadastro de usuários e permissões de acesso
      gerente administrativo
          gerenciar o cadastro de cargos
          gerenciar o cadastro de funções
          gerenciar o cadastro de funcionários
          gerenciar o cadastro de instalações físicas
      gerente de ensino
          gerenciar o cadastro de disciplinas
          gerenciar o cadastro de níveis de ensino
          gerenciar o cadastro de estruturas curriculares
          gerenciar o cadastro de turmas (bem como professores nas turmas e horários)
          gerenciar o cadastro de alunos (geral)
          gerenciar o cadastro de matrículas (alunos nas turmas)
          registrar aprovação ou reprovação excepcional em conselho de classe
      professor
          ver as turmas em que ministra disciplinas
          ver os alunos das turmas em que ministra disciplinas
          ver a agenda de aula das turmas em que ministra disciplinas (turmas, disciplinas, salas de aula, dias da semana e horários de aula)
          ver a agenda de aula da escola (todas as turmas do ano letivo)
          gerenciar o cadastro de frequência dos alunos (nas suas turmas e disciplinas)
          gerenciar as notas das avaliações bimestrais dos alunos (nas suas turmas e disciplinas)
      aluno (e/ou pais ou responsáveis)
          ver a estrutura curricular do nível e ano de ensino em que está matriculado
          ver a estrutura curricular de todos os níveis e anos de ensino
          ver a agenda de aula da turma em que está matriculado (disciplinas, professores, salas de aula, dias da semana e horários de aula)
          ver o histórico acadêmico (notas e situação final para as turmas cursadas)

