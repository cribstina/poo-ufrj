package lista_5.exec_8;

public class Funcionario {
    // atributos
    private String nome;
    private double salarioHora;
    private double horasTrabalhadasMes = 0;
    private int ID_FUNC = 0;
    private static int proxID = 1;
    public static double SALARIO_HORA_MINIMO = 12.50;

    public Funcionario(String nomeFun) {
        /*
         * recebe o nome do funcionário e atribui a ele o valor mínimo de hora
         * trabalhada.
         */
        this.nome = nomeFun;
        this.salarioHora = SALARIO_HORA_MINIMO;
        this.ID_FUNC = proxID;
        proxID += 1;
    }

    public Funcionario(String nomeFun, double salarioHora) {
        /*
         * recebe tanto o nome do funcionário quanto o valor a ser pago pela hora
         * trabalhada deste funcionário.
         */
        this.nome = nomeFun;
        this.salarioHora = salarioHora;
        this.ID_FUNC = proxID;
        proxID += 1;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIDFuncionario() {
        return this.ID_FUNC;
    }

    public double getSalarioHora() {
        return this.salarioHora;
    }

    public double calculaSalarioMes() {
        double salarioMes = this.salarioHora * this.horasTrabalhadasMes;
        return salarioMes;
    }

    public void reiniciaMesTrabalho() {
        this.horasTrabalhadasMes = 0;
    }

    public void atualizaNome(String nomeFun) {
        if (nomeFun.contains(" ")) {
            this.nome = nomeFun;
        } else {
            System.out.println("Nome inválido! Insira um nome e ao menos um sobrenome.");
        }
    }

    public void atualizaSalarioHora(double salarioHora) {
        if (salarioHora > this.salarioHora) {
            this.salarioHora = salarioHora;
        } else {
            System.out.println("Valor inválido! O novo valor de hora trabalhada deve ser maior que o atual.");
        }
    }

    public static int getProximoID() {
        return proxID;
    }

    public void adicionaDiaDeTrabalho(double horasTrabalhadasDia) {
        if (horasTrabalhadasDia < 4) {
            System.out.println(
                    "Valor inválido! O dia de trabalho tem que ter pelo menos 4 horas completas para ser válido.");
        } else {
            this.horasTrabalhadasMes += horasTrabalhadasDia;
        }
    }

}
