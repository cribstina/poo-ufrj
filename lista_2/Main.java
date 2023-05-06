package lista_2;

public class Main {
        public static void main(String[] args) {
                Funcionario funcionario1 = new Funcionario("Cristina Ribeiro", 25);

                Funcionario funcionario2 = new Funcionario("Patricia Medeiros");

                Funcionario funcionario3 = new Funcionario("Marília Ramos");

                System.out.println("O funcionário ID = " + funcionario1.getIDFuncionario() + " chamado "
                                + funcionario1.getNome() + " ganha " + funcionario1.getSalarioHora()
                                + " reais por hora.");

                System.out.println("O funcionário ID = " + funcionario2.getIDFuncionario() + " chamado "
                                + funcionario2.getNome() + " ganha " + funcionario2.getSalarioHora()
                                + " reais por hora.");

                System.out.println("O funcionário ID = " + funcionario3.getIDFuncionario() + " chamado "
                                + funcionario3.getNome() + " ganha " + funcionario3.getSalarioHora()
                                + " reais por hora.");

                funcionario1.adicionaDiaDeTrabalho(8); // adicionando 8h no mês do funcionario1

                System.out.println("O funcionário " + funcionario1.getNome() + " receberá "
                                + funcionario1.calculaSalarioMes()
                                + " este mês"); // retorna 200 reais pois há 8h trabalhadas a 25 reais por hora

                funcionario1.reiniciaMesTrabalho(); // teste de reinicio

                System.out.println("O funcionário " + funcionario1.getNome() + " receberá "
                                + funcionario1.calculaSalarioMes()
                                + " este mês"); // retorna 0 reais pois não há horas trabalhadas

                funcionario2.atualizaSalarioHora(10); // erro
                funcionario2.atualizaSalarioHora(18);

                System.out.println(funcionario2.getSalarioHora()); // salario do funcionario 2 atualizado

                funcionario3.atualizaNome("Maria"); // erro

                funcionario3.atualizaNome("Maria Rodrigues"); // atualiza nome do funcionário 3
                funcionario3.atualizaSalarioHora(16.5); // atualiza salário do funcionário 3
                funcionario3.adicionaDiaDeTrabalho(8); // adicionando 8h no mês do funcionario3

                System.out
                                .println(funcionario3.getNome() + " receberá " + funcionario3.calculaSalarioMes()
                                                + " reais este mês."); // dados
                                                                       // atualizados

                System.out.println("O próximo funcionário terá ID = " + Funcionario.getProximoID());

        }
}
