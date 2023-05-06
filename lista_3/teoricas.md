### 1. Quando usamos o conceito de inner class do Java?

Quando queremos organizar o código, mas não usaremos a classe criada fora do seu próprio contexto.

### 2. O que é encapsulamento e qual a sua importância para POO?

Encapsulamento é separar o programa em partes, ocultando atributos e métodos de classes às quais eles não dizem respeito. Fazer isso é fundamental para garantir a escalabilidade, a legibilidade e a segurança do sistema, já que, caso desejemos alterar alguma parte do sistema, precisamos fazê-lo apenas uma vez, onde esta parte estiver encapsulada.

### 3. Qual a diferença entre o modificador de visibilidade <code>private</code> e <code>protected</code>?

O modificador <code>protected</code> faz com que a classe ou atributo possa ser acessada por todas as classes do mesmo pacote e por todas as suas classes filhas.

Já o modificador <code>private</code>, faz com que apenas a própria classe que contém aquele atributo, construtor ou método possa utilizá-lo, tornando-o inacessível a classes filhas e a outras classes do mesmo pacote, diferentemente do <code>protected</code>

### 4. Qual é o ciclo de um desenvolvimento orientado a testes (TDD)?

1. Criação de um teste que falha;
2. Implementação da funcionalidade que corrige o teste;

   a. Se o teste falhar, deve-se refatorar o código;

   b. Se a funcionalidade passar no teste, deve-se desenvolver outro teste, retornando ao item 1.
