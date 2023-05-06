package lista_3.exec_5;

public class ContaTeste {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        System.out.println("O saldo atual da Conta 1 é " + conta1.pegaSaldo());

        conta1.deposita(230.50); // efetuando o depósito de 230.50 na conta 1

        System.out.println("O saldo atual da Conta 1 é " + conta1.pegaSaldo()); // saldo aumentou 230.50

        conta1.saca(250.00); // tentativa de sacar mais dinheiro que o disponível -> dá erro

        conta1.saca(200.00); // tentativa bem sucedida de saque

        System.out.println("O saldo atual da Conta 1 é " + conta1.pegaSaldo()); // saldo é 30.50

    }
}
