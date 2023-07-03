### 1. O que é herança? Qual a vantagem de se usar esse mecanismo?

Herança é quando uma classe herda (copia) atributos e métodos de outra classe. A vantagem de utilizar esse mecanismo é não precisar reescrever os atributos e métodos para classes (filhas) que podem ser montadas copiando atributos e métodos de outras (mães).

### 2. Qual a diferença entre herança simples e herança múltipla?

Na herança simples, cada classe filha pode herdar no máximo de uma classe mãe, enquanto na herança múltipla, cada classe pode herdade de quantas quiser. Em java, não é possível implementar herança múltipla.

### 3. O que é o conceito de polimorfismo? Explique um cenário onde precisamos de polimorfismo.

Polimorfismo é quando utilizamos uma variável da classe mãe para armazenar a classe filha. Isso faz com que _somente_ os atributos e métodos da classe mãe estejam visíveis.
Uma classe filha, no entanto, não pode acomodar uma classe mãe ou qualquer outra classe que herde dela. Isso não altera a classe do objeto, apenas a visibilidade dos métodos e atributos.

### 4. Diferencie herança, agregação e composição.

Na composição, uma classe contém outra dentro de si, utilizando _atributos_ que referenciem a outra classe.
No nosso exemplo, uma casa contém vários cômodos, que só existem dentro do contexto da casa. É impossível existir um cômodo que não esteja atrelado a uma casa. E um cômodo só pode estar conectado a uma casa.

Na agregação, uma classe que agrega a outra pode referenciar e ser referenciada em vários outros objetos diferentes. Assim, quando deletamos um objeto _container_, os objetos contidos não são deletados, pois existem de forma independente. No nosso exemplo, uma disciplina contém alunos, porém, o mesmo aluno pode estar em várias disciplinas, e encerrar uma disciplina não some com os alunos.

Na herança, uma classe herda métodos e atributos de outra. É necessário apenas dizer que a classe "extends" a sua mãe, na sua declaração e, automaticamente, ela conterá os atributos desta classe mãe.

### 5. O que são classes abstratas e qual o seu uso mais comum?

Uma classe abstrata é uma classe que não pode ser instanciada. Comumente, é definida para ser utilizada num esquema de herança onde não representa algo concreto o suficiente para ser um objeto na modelagem, servindo apenas de "categorização" para algo.

### 6. Diferencie classe abstrata e interface.

Apesar de ambas não poderem ser instanciadas, a interface não pode conter nenhum método concreto (apenas abstrato), enquanto a classe abstrata pode conter métodos concretos que serão sobrescritos em suas filhas.
Além disso, é possível que uma classe implemente várias interfaces, enquanto, como já dito, não pode ser implementado herança múltipla em java.
Além disso, interfaces não podem conter métodos estáticos e somente podem conter atributos public static final. Interfaces são vistas como um contrato a ser obedecido pelos objetos, enquanto a classe abstrata é somente uma classificação de um objeto.

### 7. Para que servem os tipos genéricos no Java?

Tipos genéricos são utilizados em classes, interfaces, atributos e métodos para deixar uma funcionalidade adaptável a diferentes situações sem precisar reescrever a funcionalidade. Exemplos de tipos genéricos são ArrayLists e LinkedLists.
