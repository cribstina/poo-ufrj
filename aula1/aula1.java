import java.util.InputMismatchException;
import java.util.Scanner;

class AreaDoCirculo {
    public static void main(String[] args) {
        int circulo1 = 5;
        double circulo2 = 3.5;
        double pi = 3.14159;
        
        System.out.println("A área do círculo 1 é " + circulo1*circulo1*pi);
        System.out.println("A área do círculo 2 é " + circulo2*circulo2*pi);
        
      }
}

class NomeIdadeAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira seu nome e aperte enter");
        String nome = sc.nextLine();
        
        System.out.println("insira sua idade e aperte enter");
        String idade = sc.nextLine();

        System.out.println("por último, insira sua altura");
        String altura = sc.nextLine();

        System.out.println("Seu nome é " + nome + ", sua idade é " + idade + " anos e sua altura é " + altura);
        }
}

class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira as duas notas do aluno");

        try {
            //input numerico
            float nota1 = sc.nextFloat();
            float nota2 = sc.nextFloat();

            //calculo da media
            float media = (nota1 + nota2)/2;

            if (media >= 7.0){
                System.out.println("Aluno aprovado");
            }
            else if (media < 3) {
                System.out.println("Aluno reprovado");
            }
            else {
                System.out.println("Aluno em prova final");
            }  
        } catch (InputMismatchException err) {
            System.out.println("Erro! O valor digitado não é válido. Tente novamente com um número, utilizando vírgula ao invés de ponto.");
        }
        
    }
}

class Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Este programa calcula o fatorial de um número inteiro.");
        System.out.println("Entre com um número inteiro.");

        try {
            int numero = scan.nextInt();
            int showNumero = numero;
            int fatorial = numero;

            //calculo do fatorial
            while (numero > 1){
                fatorial = fatorial * (numero - 1);
                numero = numero - 1;
            }

            System.out.println("O fatorial de " + showNumero + " é " + fatorial);
        } catch (InputMismatchException err) {
            System.out.println("Erro! Entrada inválida. Tente novamente com um número inteiro.");
        }

    }
}