### 1. O que são padrões de projeto? Qual sua importância em POO?

Um padrão de projeto é uma abstração de uma solução (um template; design genérico), que pode ser utilizada em vários contextos dentro da arquitetura de sistemas. Respeitar esses padrões técnicos ajuda a aumentar a legibilidade do sistema.

### 2. Explique o padrão Singleton com suas palavras e destaque o que é preciso fazer na classe para ela se tornar um Singleton.

Um Singleton é uma classe que só tem uma instância, que é compartilhada com todo o programa, incluindo seus atributos e métodos.
Para que uma classe se torne um Singleton, é necessário que seu construtor seja privado e instanciado apenas por um método getConstrutor.

### 3. Explique o padrão de projeto Factory destacando a principal vantagem de se usar esse padrão e os cuidados que o programador precisa ter.

Esse padrão de projeto se propõe a ser uma fábrica de objetos. Ele cria uma interface que outras partes do programa podem utilizar para instanciar classes sem utilizar diretamente seus construtores. Isso torna a criação de objetos melhor encapsulada e mais diretamente implementada.

Assim, é intuitivo que, dada a implementação de uma Factory, os construtores individuais das classes não devem ser utilizados.

### 4. O que faz o padrão de projeto Observer, também conhecido como orientado a eventos? Quais suas principais etapas e quem são os envolvidos?

Um Observer funciona em duas etapas: sua escuta e sua resposta, ambas orientadas a _eventos_. Ele tem como principal objetivo ser uma ponte entre dois objetos diferentes, centralizando a comunicação entre os dois. Ele é bastante utilizado para implementação de notificações e avisos.
