---
title: Code Review check
created: '2022-10-19T14:07:03.446Z'
modified: '2022-10-20T16:12:02.981Z'
---

# Code Review check

Code Review é algo bom. Vamos ver alguns itens pra se preocupar quando estiver executando uma atividade como essa.

## Pontos gerais: 

- **Formatação:** Como são os espaçamentos e quebras de linha?
- **Estilo:** variáveis são declaradas como "final"? as variáveis são declaradas no início do método ou perto de onde são usadas?
- **Nomenclatura:** Os nomes seguem o padrão do projeto? Os nomes são muito curtos?
- **Cobertura de testes:** Existem testes unitários para o código? Ou ainda, quais casos de uso estão previstos nessa codificação?
- **Classes ou métodos muito extensos:** Em geral métodos e classes muitos extensos podem revelar falta de responsabilidade única.

## Projeto

- Como está o encaixe do código com a arquitetura já existente?
- O código segue os princípios SOLID ou outros princípios que o time prega?
    > Princípio de única responsabilidade
    >"uma classe deve ter apenas uma única responsabilidade (mudanças em apenas uma parte da especificação do software, devem ser capaz de afetar a especificação da classe)."
    >Princípio de aberto/fechado
    >"entidades de software devem ser abertas para extensão, mas fechadas para modificação."
    >Princípio da substituição de Liskov
    >"objetos em um programa devem ser substituíveis por instâncias de seus subtipos, sem alterar a funcionalidade do programa." deve ser capaz de afetar apenas a especificação da classe
    >Princípio da segregação de Interface
    >"muitas interfaces de clientes específicas, são melhores do que uma para todos propósitos."
    >Princípio da inversão de dependência
    >"deve-se depender de abstrações, não de objetos concretos."
- Se a base de código tem uma mistura de padrões e estilos, o novo código se relaciona bem os princípios atuais ou com os antigos?
- O código está no local correto, em termos de diretório e afinidade de uso?
- O novo código poderia ter reutilizado algo ? O novo código permite que o um trecho de código possa ser reutilizado?
- Existe introdução de duplicação? Caso sim, pode ser refatorado numa maneira mais reutilizável? 
- O código está excessivamente trabalhado? Está considerando possíveis situações futuras que não irão acontecer?

## Manutenabilidade e facilidade de leitura

- Os nomes em geral (campos, variáveis, parâmetros, classes, métodos e etc) realmente refletem as coisas que representam?
- Consigo entender o que o código faz apenas lendo ele?
- Consigo entender os testes unitários?
- Os testes cobrem um bom subconjunto de casos? Tanto caminho feliz quanto casos especiais? Há casos não cobertos?
- As mensagens de exceção são legíveis?
- Seções de código mais complexas estão documentadas, comentadas ou cobertas por testes entendíveis?

## Funcionalidade

- O código realmente faz o que era pra ser feito?
- Caso haja testes automatizados, eles testam o que o código realmente deveria fazer?
- O código parece ter bugs escondidos, como checagem em variáveis erradas ou usar "E" ao invés do "OU" ?

## Detalhes importam!

- Existe problema de segurança em potencial no código?
- Existem legislações que precisam ser cumpridas?
- O código novo introduz questões de performance evitáveis, como chamadas desnecessárias ao banco de dados ou serviços remotos?
- A documentação foi escrita de acordo com o padrão do projeto?
- O texto ou as mensagens que chegam até os usuários foram checados quanto à norma padrão do idioma utilizado?
- Existe algum erro "óbvio" que pode quebrar o sistema em produção, como por exemplo usar o banco de dados de teste ou algum simulador com hardcode que deve ser trocado por um serviço real?

# Revisando os testes

- Os testes pelo menos cobrem a parte confusa ou complicada do código?
- Os testes são entendíveis e concisos?
- Os testes atendem os requerimentos previstos na documentação da funcionalidade ou correção de bug ?
- Consigo pensar em casos que não são cobertos pelos testes existentes?
- Existem testes pra documentar limitações intencionais do código? (10000 transações por vez, ou similar)
- Os testes aplicados são do tipo correto? (de integração, unitários ou manuais)
- Existem testes relacionados a parte de segurança e performance?

  > Resumo:
  Como revisor de código, você deve checar se o desenvolvedor pensou em como o codigo deve ser usado, em que condições poderia quebrar e quais os casos limite que deve prever, documentando o comportamento esperado por meio de casos de testes automatizados.

  # Revisando performance

  Primeiramente, nesse tópico é necessário ter uma noção do que "lento demais", dependendo da aplicação que você está lidando.

  - Se há requisitos rígidos de performance, com SLA definidos, esses parâmetros devem estar nos testes.
  - Chamadas ao banco de dados são custosas, então obter uma lista dentro de um laço de repetição para pegar apenas um elemento não é interessante.
  - Chamadas de rede são custosas, então fazer uma batelada ao invés de chamadas repetidas é mais interessante.
  - Locks costumam prejudicar a performance, num ambiente multi-thread, prefira usar uma única thread que escreve/modifica e demais que podem realizar leitura livremente.
  - Existe código que pode gerar vazamento de memória? (Em geral campos estáticos mutáveis, ThreadLocal ou Classloader).
  - Existe código que pode gerar uma "pegada de memória" ? Objetos grandes demais.
  - O código fecha as conexões, recursos e streams?
  - Os pools de recursos estão corretamente configuradas?
  - Alertas no código podem indicar algum potencial de "code smells"
  - Uso de Reflection em geral é mais lento e pode acender um sinal de alerta.
  - Timeouts adequados são importantes para uma boa performance. Se você não tem parâmetro para tal, chame alguem que conheça o assunto para discutir.
  - Paralelismo: se você está lidando com paralelismo sem um bom motivo, certamente isso irá prejudicar a performance.
  - Confirme se num ambiente multithread, há uso de objetos preparados para esse tipo de ambiente.

>> For most organisations that aren’t building a low-latency application, these optimisations are probably fall under the category of premature optimisations24.
>>• Does the code use synchronization/locks when they’re not required? If the code is always run on a single thread, locks are unnecessary overhead.
>>• Is the code using a thread-safe data structure where it’s not required? For example, can Vector be replaced with ArrayList?
>>• Is the code using a data structure with poor performance for the common operations? For example, using a linked list but needing to regularly search for a single item in it.
>>• Is the code using locks or synchronization when it could use atomic variables instead?
>>• Could the code benefit from lazy loading?
>>• Can if statements or other logic be short-circuited by placing the fastest evaluation first?
>>• Is there a lot of string formatting? Could this be more efficient?
>>• Are the logging statements using string formatting? Are they either protected by an if to check logging level, or using a supplier which is evaluated lazily?


# Revisando estruturas de dados


## Lists

- Laços aninhados de busca em uma lista, não são tão performáticos quanto um mapeamento de objetos que se deseja procurar e sua referência. Em Java, o uso de streams com a mesma estrutura lógica de filtrar recursivamente também não é interessante.
- Reordenamento excessivo pode ser um problema se houver listas muito grandes também, de maneira que embora as listas conservem a ordem dos elementos, outras estruturas como o TreeSet pode fazer o trabalho de maneira mais eficiente.

## Maps

- Pode ser interessante utilizar um mapa para armazenar valores, mas não como constante global, pois isso vai gerar acoplamento entre locais que acessam essa constante globalmente.
- Não é interessante realizar muitos reordenamentos e iterações sobre um mapa, conforme cada caso, seria bacana verificar se não há estruturas de dados mais eficientes pra isso.

## Sets

- Utilizar sets para armazenar dados que podem se repetir (mesmo com LinkedHashSet) não é interessante, pois não é uma estrutura que preserva a ordem dos elementos.
- Verifique como foi implementado o "equals()" no Set pois o método "contains()" é um dos mais utilizados nessa estrutura.

## Stacks

- As pilhas suportam "último a entrar é o primeiro a sair" e deve ser usado com empilhamento, desempilhamento e não pra iterações.
- A classe no Java que implementa a pilha é o "deque".

## Filas

- As filas suportam "primeiro a entrar é o primeiro a sair", funcionando bem pra adicionar na cauda da fila e retirar na cabeça da fila. Se há código acessando a perte do meio da fila, talvez haja algo errado.
- As filas podem ser também limitadas ou não. Como revisor, é importante analisar o que acontece se uma fila chegar no limite ou se cresce sem fim.

## Aspectos gerais das estruturas de dados

- A meta de qualquer desenvolvedor e especialmente do revisor é garantir que o código faz o que é proposto a fazer com o mínimo possível de complexidade. Em geral, a escolha correta da estrutura de dados traz ganhos de performance e simplicidade ao código.

# SOLID

O SOLID é um acrônimo para 5 princípios chave nos projetos Orientados a Objeto.

>>Single Responsibility Principle
>>Open-Closed Principle
>>Liskov Substitution Principle
>>Interface Segregation Principle
>>Dependency Inversion Principle

## Single Responsibility Principle

- Cada método deve sempre ter apenas uma responsabilidade, facilitando o entendimento e evitando repetição desnecessária.


## Open-Closed Principle
- Cada classe deve estar aberta para extensão, mas não para modificação

## Liskov Substitution Principle
- Funções que usam referências para classes de base, devem poder usar objetos de classes derivadas sem conhecê-los.

## Interface Segregation Principle
- Muitas interfaces cliente são melhores que uma interface geral. (Complementa o princípio da responsabilidade única)

## Dependency Inversion Principle
- Dependa de abstrações e não de implementações. Uma classe Service não precisa conhecer detalhes de conexão de banco de dados ou da estrutura do banco de dados, por exemplo.

# Segurança da aplicação
- Em geral boa parte das verificações de segurança podem ser automatizadas, mas na maioria dos casos, depende do nível de segurança exigidos, assim como performance.

- Compreender o uso de dependências é fundamental para garantir o controle de vulnerabilidades. Relatar e acompanhar quais bibliotecas de terceiros são utilizadas, seria uma boa opção para melhorar o aspecto de segurança.

- Caso esteja utilizando uma aplicação WEB, é fundamental que ao criar um novo URI, se garanta que seja acessível somente após autenticação.

- AS informações sensíveis, como senhas e outras estão sendo gerenciadas corretamente? Há encriptação?

- O código deve obedecer algum tipo de comportamento para auditoria? Segue alguns pontos sensíveis:

>> Is the code making any data changes (e.g. add/update/remove)? Should it make a note of the change that was made, by whom, and when?
>> Is this code on some performance-critical path? Should it be making a note of start-time and end-time in some sort of performance monitoring system?
>> Is the logging level of any logged messages appropriate? A good rule of thumb is that “ERROR” is likely to cause an alert to go off somewhere, possibly on some poor on-call person’s pager – if you do not need this message to wake someone up at 3am, consider downgrading to “INFO” or “DEBUG”. Messages inside loops, or other places that are likely to be output more than once in a row, probably don’t need to be spamming your production log files, therefore are likely to be “DEBUG” level.












































