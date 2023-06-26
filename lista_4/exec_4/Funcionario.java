package lista_4.exec_4;

public class Funcionario implements Cloneable {

    private String nome;
    private double salarioHora;
    private double horasTrabalhadasMes = 0;
    private int ID_FUNC;
    private static int proxID = 1;
    public static final double SALARIO_HORA_MINIMO = 12.50;

    public Funcionario(String nomeFun) {
        this.nome = nomeFun;
        this.salarioHora = SALARIO_HORA_MINIMO;
        this.ID_FUNC = proxID++;
    }

    public Funcionario(String nomeFun, double salarioHora) {
        this.nome = nomeFun;
        this.salarioHora = salarioHora;
        this.ID_FUNC = proxID++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeFun) {
        if (nomeFun.contains(" ")) {
            this.nome = nomeFun;
        } else {
            throw new IllegalArgumentException("Nome inválido! Insira um nome e ao menos um sobrenome.");
        }
    }

    public int getIDFuncionario() {
        return this.ID_FUNC;
    }

    public double getSalarioHora() {
        return this.salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        if (salarioHora > this.salarioHora) {
            this.salarioHora = salarioHora;
        } else {
            throw new IllegalArgumentException(
                    "Valor inválido! O novo valor de hora trabalhada deve ser maior que o atual.");
        }
    }

    public double calculaSalarioMes() {
        return this.salarioHora * this.horasTrabalhadasMes;
    }

    public void reiniciaMesTrabalho() {
        this.horasTrabalhadasMes = 0;
    }

    public static int getProximoID() {
        return proxID;
    }

    public void adicionaDiaDeTrabalho(double horasTrabalhadasDia) {
        if (horasTrabalhadasDia < 4) {
            throw new IllegalArgumentException(
                    "Valor inválido! O dia de trabalho tem que ter pelo menos 4 horas completas para ser válido.");
        } else {
            this.horasTrabalhadasMes += horasTrabalhadasDia;
        }
    }

    public Funcionario clonar() throws CloneNotSupportedException {
        return (Funcionario) super.clone();
    }

    public boolean igual(Funcionario outroFuncionario) {
        return this.equals(outroFuncionario);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Funcionario)) {
            return false;
        }
        Funcionario outroFuncionario = (Funcionario) obj;

        return this.nome.equals(outroFuncionario.nome)
                && Double.compare(this.salarioHora, outroFuncionario.salarioHora) == 0
                && this.ID_FUNC == outroFuncionario.ID_FUNC;
    }
}
