class PrimeiraClasse {
    public static void main (String [] args) {
        System.out.println("Hello World!");
    }
}

class DeclaracaoVariaveis {
    public static void main(String[] args) {
        String nome = "Cristina";

        int idade = 26;

        double altura = 1.65;

        System.out.println("Eu me chamo " + nome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("minha altura é " + altura);
        
    }
}

class NumeroPar {
    public static void main(String[] args) {
        int numero = 5;
        
        if(numero % 2 == 0) {
            System.out.printf("o número é par");
        }
        else {
            System.out.printf("o número é ímpar");
        }
    }
}


