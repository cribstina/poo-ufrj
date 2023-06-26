package lista_4.exec_4;

public class FuncionarioTeste {
        public static void main(String[] args) throws CloneNotSupportedException {
                Funcionario funcionario1 = new Funcionario("Cristina Ribeiro", 25);

                Funcionario funcionario2 = new Funcionario("Patricia Medeiros");

                Funcionario funcionario3 = funcionario1.clonar();

                System.out.println(funcionario3.getNome() + funcionario3.getSalarioHora());

                System.out.println(funcionario1.igual(funcionario3));
        }
}
