Documentação do Projeto ShivaCorp

1. Descrição Geral do Projeto
O projeto ShivaCorp é um painel de seleção simplificado para um site de uma escola, desenvolvido em Java. Ele oferece funcionalidades para diferentes tipos de usuários: alunos, professores e coordenadores.

Alunos podem consultar suas médias.

Professores podem consultar seus salários líquidos.

Coordenadores podem verificar se sua equipe está dentro do prazo.

2. Estrutura do Projeto
O projeto está organizado no pacote ShivaCorp e é composto pelos seguintes arquivos Java:

Aluno.java

Coordenador.java

Painel.java

Pessoas.java

Professor.java

Parametros.txt (contém parâmetros de configuração e não faz parte do código Java)

3. Classes e Arquivos
3.1. Pessoas.java
Classe abstrata que serve como base para as classes Aluno, Professor e Coordenador.

Atributos:

nome: nome do usuário.

matricula: matrícula do usuário.

Métodos:

setNome(), getNome()

setMatricula(), getMatricula()

Observação: A validação do formato da matrícula é delegada às classes filhas.

3.2. Aluno.java
Extende a classe Pessoas e representa um aluno.

Atributos:

media, teste, prova: notas do aluno.

Métodos:

setTeste(), getTeste(), setProva(), getProva(), setMedia(), getMedia()

calcularMedia(): calcula a média do aluno com base nas notas do teste e da prova.

3.3. Professor.java
Extende a classe Pessoas e representa um professor.

Atributos:

salario, salarioLiquido: salário bruto e líquido do professor.

Métodos:

setSalario(), getSalario(), setSalarioLiquido(), getSalarioLiquido()

obterSalarioLiquido(): calcula o salário líquido descontando 11% do salário bruto.

3.4. Coordenador.java
Extende a classe Pessoas e representa um coordenador.

Atributos:

nomes[]: array de String para armazenar os nomes dos professores.

situacoes[]: array de String para armazenar as situações ("no prazo" ou "fora do prazo").

Métodos:

registrarProfessores(): coleta os nomes e a situação de cada professor.

analisarSituacoes(): analisa as situações dos professores e exibe um resumo.

getNomes(), getSituacoes(): obtém os arrays de nomes e situações.

3.5. Painel.java
Classe principal que contém o método main().

Funções:

Apresenta um menu interativo para selecionar entre aluno, professor e coordenador.

Realiza a validação de entrada (ex. matrícula de tamanho específico).

Instancia objetos das classes Aluno, Professor e Coordenador e chama seus métodos com base na escolha do usuário.

Calcula e exibe a média do aluno e o salário líquido do professor.

Controla o fluxo com um do-while e uma estrutura switch-case.

4. Parâmetros do Programa
O programa não recebe parâmetros diretamente pela linha de comando. A interação ocorre por meio do menu, onde o usuário fornece dados como nome, matrícula, notas, salário, etc.

5. Objetivo do Projeto
Demonstrar a aplicação de conceitos fundamentais da linguagem Java, como:

Classes

Herança

Polimorfismo

Entrada e saída de dados

O projeto utiliza um cenário de sistema escolar simplificado.

6. Instruções de Uso
Execute o programa.

O usuário será apresentado a um menu com opções para aluno, professor e coordenador.

Escolha a opção desejada e siga as instruções para fornecer os dados solicitados (nome, matrícula, notas, salário, etc.).

7. Considerações Adicionais
A classe Pessoas é abstrata e serve como base para as classes filhas. Não pode ser instanciada diretamente.

A validação de matrícula é feita nas classes filhas para aplicar regras específicas.

O código possui "BREAKPOINTS" como comentários, indicando pontos para testes durante o desenvolvimento.

A validação de exceções (ex: InputMismatchException) foi tratada para garantir a robustez do programa.
