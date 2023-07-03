package lista_5.exec_8;

import java.util.LinkedList;

public class Lider extends Funcionario {
    private LinkedList<Funcionario> lista_funcionarios = new LinkedList<>();

    public Lider(String nomeLider) {
        super(nomeLider, SALARIO_HORA_MINIMO);

    }

    public Lider(String nomeLider, double salarioHoraLider) {
        super(nomeLider, salarioHoraLider);
    }

    public boolean adicionaFuncionario(Funcionario funcionario) {
        if (this.lista_funcionarios.contains(funcionario)) {
            throw new IllegalArgumentException("Erro! Funcionário já adicionado à lista.");
        } else {
            this.lista_funcionarios.add(funcionario);
            return true;
        }
    }

    public boolean removeFuncinario(Funcionario funcionario) {
        if (this.lista_funcionarios.contains(funcionario)) {
            this.lista_funcionarios.remove(funcionario);
            return true;
        } else {
            throw new IllegalArgumentException("Erro! Funcionário não está na lista.");
        }
    }

    public double calculaSalarioFuncionarios() {
        double soma = 0;
        double salario;
        for (int i = 0; i < this.lista_funcionarios.size(); i++) {
            salario = this.lista_funcionarios.get(i).getSalarioHora();
            soma += salario;
        }
        return soma;
    }

    public String toString() {
        LinkedList<String> dadosFuncionarios = new LinkedList<>();

        for (int i = 0; i < this.lista_funcionarios.size(); i++) {
            dadosFuncionarios.add(String.format("%nID: %d%nNome: %s%nSalario hora: %.2f",
                    this.lista_funcionarios.get(i).getIDFuncionario(), this.lista_funcionarios.get(i).getNome(),
                    this.lista_funcionarios.get(i).getSalarioHora()));
        }

        String fs = String.format("ID: %d%nNome: %s%nSalario hora: %.2f%nFuncionários: %s",
                this.getIDFuncionario(), this.getNome(), this.getSalarioHora(), dadosFuncionarios);

        return fs;
    }

    public LinkedList<Funcionario> getListaFuncionarios() {
        return lista_funcionarios;
    }

}
