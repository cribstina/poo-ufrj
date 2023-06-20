### 1. Diferencie shallow copy (cópia rasa) de deep copy (cópia profunda).

A cópia rasa armazena a referência para o endereço de memória original, enquanto a cópia profunda armazena uma cópia dos valores em um novo endereço de memória. Por isso, na cópia rasa, as mudanças realizadas à copia modificam o objeto original, enquanto na cópia profunda, não.

<br>

### 2. Dado o código abaixo:

    class Exercicio {
        public String valor;
        public static void main(String[] args){
            Exercicio obj1 = new Exercicio();
            Exercicio obj2 = new Exercicio();
            obj1.valor = “Objeto”;
            ob2.valor = “Objeto”;
            System.out.println(“Os objetos são iguais?” + (obj1 == obj2));
        }
    }

### O que será escrito na tela ao final da execução da função main? Caso imprima false, o que pode ser feito para retornar true?

False. Podemos substituir a expressão `(obj1 == obj2)` por `obj1.valor.equals(obj2.valor)`.

<br>

### 3. Como que o garbage collector do Java reconhece que um objeto pode ser excluído da memória?

Ele marca e exclui todo objeto que não possui referência válida. Também é possível dar dicas no código para que o gc seja executado, chamando os métodos `System.gc()`, `Runtime.gc()` ou `finalize()`, caso seja necessário excluir objetos criados dentro do objeto pai.
