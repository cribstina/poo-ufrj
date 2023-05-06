import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * Java(TM) SE Runtime Environment (build 1.8.0_361-b09)
 * Java HotSpot(TM) 64-Bit Server VM (build 25.361-b09, mixed mode)
 * O sistema aceita números com casas decimais separadas por vírgulas.
 */

//1
class MediaTurma {
    public static void main(String[] args) {
        // declaração de variáveis
        float nota = 0;
        float somaDeNotas = 0;
        float iteracoes = 0; // contador de iterações do loop
        try {
            System.out.println(
                    "Este programa calcula a média de notas de uma turma. Para interrompê-lo, insira -1 a qualquer momento.");
            // criando o scanner
            Scanner sc = new Scanner(System.in);

            // iterações e cálculo da média
            while (true) {
                // começamos uma nova iteração
                iteracoes += 1;
                somaDeNotas += nota;

                // usuário insere uma nota
                System.out.println("Insira a nota de um aluno.");
                nota = sc.nextFloat();
                // condição de parada
                if (nota == -1) {
                    iteracoes -= 1;
                    break;
                }
            }

            // calculo da media
            float media = somaDeNotas / iteracoes;

            System.out.println("A média da turma é " + media);
            sc.close();
        } catch (InputMismatchException err) {
            System.out.println("Erro! Tente novamente com um número no formato x,x.");
        }

    }
}

// 2
class Refeicoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estoqueFrango, estoqueCarne, estoqueMassa;
        int pedidosFrango, pedidosCarne, pedidosMassa;
        int faltaFrango, faltaCarne, faltaMassa;
        int naoAtendidos = 0;

        System.out.println("Insira as quantidades de frango, carne e massa disponíveis");
        estoqueFrango = sc.nextInt();
        estoqueCarne = sc.nextInt();
        estoqueMassa = sc.nextInt();

        System.out.println("Insira as quantidades de frango, carne e massa pedidos pelos passageiros");
        pedidosFrango = sc.nextInt();
        pedidosCarne = sc.nextInt();
        pedidosMassa = sc.nextInt();

        faltaFrango = estoqueFrango - pedidosFrango;
        faltaCarne = estoqueCarne - pedidosCarne;
        faltaMassa = estoqueMassa - pedidosMassa;

        if (faltaFrango > 0)
            naoAtendidos += faltaFrango;
        if (faltaCarne > 0)
            naoAtendidos += faltaCarne;
        if (faltaMassa > 0)
            naoAtendidos += faltaMassa;

        System.out.println("O número de passageiros sem atendimento é " + naoAtendidos);
        sc.close();
    }

}

// 3
class VolumeEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula o volume de uma esfera.");
        System.out.println("Insira o valor do raio da esfera");

        try {
            double raio = sc.nextDouble();
            double volume = (4 / 3) * 3.14159 * (raio * raio * raio);
            System.out.println("O volume da esfera é " + volume);

        } catch (InputMismatchException err) {
            System.out.println("Erro! Entrada inválida. Tente novamente com números no formato x,x.");
        }
        sc.close();
    }
}

// 4
class CalculadoraIterativa {
    /* --- INICIO DAS OPERACOES --- */
    /*
     * valor inicial => valor calculado antes da operação ser aplicada;
     * valorInput => valor inserido pelo usuário para novo cálculo;
     */
    public static double soma(double valorInicial, double valorInput) {
        double resultado = valorInicial + valorInput;
        System.out.println("= " + resultado);
        return resultado;
    }

    public static double subtracao(double valorInicial, double valorInput) {
        double resultado = valorInicial - valorInput;
        System.out.println("= " + resultado);
        return resultado;
    }

    public static double multiplicacao(double valorInicial, double valorInput) {
        double resultado = valorInicial * valorInput;
        System.out.println("= " + resultado);
        return resultado;
    }

    public static double divisao(double valorInicial, double valorInput) throws ArithmeticException {
        double resultado = valorInicial / valorInput;
        System.out.println("= " + resultado);
        return resultado;
    }
    /* --- FIM DAS OPERACOES --- */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* inicialização de variáveis locais */
        double valorInicial = 0;
        double valorInput;
        double valorFinal;
        String parada1 = "s"; // criterios de
        String parada2 = "S"; // parada

        /* Instruções pro usuário */
        System.out.println(
                "Este programa é uma calculadora iterativa. Para interrompê-lo, digite S ou s no menu de operações.");

        try {
            while (true) {
                System.out.println("Insira a operação desejada");
                String operacao = sc.nextLine();
                if (operacao.equalsIgnoreCase(parada1)) {
                    System.out.println("Saindo da aplicação...");
                    break;
                }
                if (operacao.equalsIgnoreCase(parada2)) {
                    System.out.println("Saindo da aplicação...");
                    break;
                }

                System.out.println("Insira o valor a ser aplicado na operação");
                valorInput = sc.nextDouble();
                sc.nextLine(); // limpeza

                /* aplicação de operações */
                switch (operacao) {
                    case "soma":
                        valorFinal = soma(valorInicial, valorInput);
                        valorInicial = valorFinal;
                        break;
                    case "subtracao":
                        valorFinal = subtracao(valorInicial, valorInput);
                        valorInicial = valorFinal;
                        break;

                    case "multiplicacao":
                        valorFinal = multiplicacao(valorInicial, valorInput);
                        valorInicial = valorFinal;
                        break;

                    case "divisao":
                        try {
                            valorFinal = divisao(valorInicial, valorInput);
                            valorInicial = valorFinal;
                            break;
                        } catch (ArithmeticException err) {
                            System.out.println("Erro! Entre um valor diferente de 0 para efetuar divisão.");
                        }

                    default:
                        System.out.println("Entrada inválida. Tente novamente.");
                        break;
                }
            }
        } catch (InputMismatchException err) {
            System.out.println("Erro! A operação deve ser uma string e o valor deve ser um número no formato x,x.");
        }
        sc.close();
        return;
    }
}

// 5
class Rodagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // inicialização das variáveis
        int automovelFaz = 12; // quantidade de km/L que o automóvel faz
        float litrosNecessarios;
        float horasViagem;
        int velocidadeMedia;

        System.out.println("Insira o tempo que você gastará na viagem, em horas");
        horasViagem = sc.nextFloat();

        System.out.println("Insira a sua velocidade média durante a viagem");
        velocidadeMedia = sc.nextInt();

        litrosNecessarios = (horasViagem * velocidadeMedia) / automovelFaz;
        System.out.printf("O seu automóvel precisa de %.3f L de combustível para finalizar a viagem.",
                litrosNecessarios);

        sc.close();
    }
}

// 6
class AdivinhaNumero {
    public static void main(String[] args) {
        /*
         * Esta classe adivinha o número inserido pelo usuário a partir de
         */
        // variáveis
        int numeroInput;
        int limiteSup = 100;
        int limiteInf = 0;
        int chute;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 0 a 100 e este programa adivinhará seu número.");
        numeroInput = sc.nextInt();

        do {
            chute = (limiteSup + limiteInf + 1) / 2;
            contador += 1;

            if (chute < numeroInput) {
                limiteInf = chute + 1;
            } else if (chute > numeroInput) {
                limiteSup = chute - 1;
            }
        } while (chute != numeroInput);
        sc.close();
        System.out.println("Seu número é " + chute + " e o sistema levou " + contador + " iterações para descobrí-lo.");
    }
}