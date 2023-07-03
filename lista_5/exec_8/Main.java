package lista_5.exec_8;

public class Main {
    public static void main(String args[]) {
        String nomeLider = "Cristina Souza";
        Double salarioLider = 150.00;

        Lider lider = new Lider(nomeLider, salarioLider);

        System.out.println(lider.toString());

        Funcionario func1 = new Funcionario("Joana Maria");
        Funcionario func2 = new Funcionario("João Lucas");
        Funcionario func3 = new Funcionario("Carlos Alberto");

        lider.adicionaFuncionario(func1);

        System.out.println(lider.toString());

        lider.adicionaFuncionario(func2);
        lider.adicionaFuncionario(func3);

        System.out.println(lider.toString());

    }
}
