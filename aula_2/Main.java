package aula2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Qtde clientes " + Cliente.getQtdeClientes());

        Cliente cliente1 = new Cliente("Rafaela", "111.111.111-11");

        System.out.println("Qtde clientes " + Cliente.getQtdeClientes());

        System.out.println("Cliente " + cliente1.getNome() + " tem cartão? " + cliente1.temCartao());

        cliente1.adicionaCartao();
        String nome_cliente1 = cliente1.getNome();

        System.out.println("Cliente " + nome_cliente1 + " tem cartão? " + cliente1.temCartao());
        System.out.println("Numero cartão cliente " + nome_cliente1 + ": " + cliente1.getNumCartao());
        System.out.println("Credito disponivel para cliente " + nome_cliente1 + ": " + cliente1.getCredito());

        Cliente cliente2 = new Cliente();

        System.out.println("Qtde clientes " + Cliente.getQtdeClientes());

        cliente2.setNome("Rafaela Brum");
        System.out.println("Novo cliente nome: " + cliente2.getNome());
        String nome_cliente2 = cliente2.getNome();

        cliente2.atualizaCPF("222.222.222-22");
        System.out.println("CPF cliente " + nome_cliente2 + ": " + cliente2.acessaCPF());
    }
}
