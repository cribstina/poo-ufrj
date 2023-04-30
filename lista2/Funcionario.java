package lista2;

/*
 * 1. A programação modular utiliza módulos independentes pra executar o programa. Esses módulos podem ser estruturados por funções, em linguagens procedurais, ou por classes e seus relacionamentos, em linguagens orientadas a objeto. No entanto, ser orientada a objeto não implica em ser modular, já que podemos ter diferentes objetos dentro de uma classe e não necessariamente as classes serão logicamente independentes.
 * 
 * 2. Uma classe define propriedades (atributos e comportamentos) de objetos e é uma representação lógica de algo real (um objeto). Um objeto é, portanto, apenas uma instância de uma classe.
 * 
 * 3. Atributos de classe são declarados diretamente sob a classe, e definem o que todos os objetos dentro daquela classe devem ter. Ex.: a classe Pessoa tem como atributo um nome.
 * 
 *    Atributos de objetos são declarados dentro de objetos dentro de classes, portanto são referentes somente àquela instância da classe, ou seja àquele objeto. Ex.: o objeto umaPessoa tem como atributo o nome = Cristina.
 *    
 *    Métodos de classe são necessários para definir o que pode ser feito com métodos ou variáveis que não tem relação com alguma instância da classe. Um exemplo comum é um método que conte quantos objetos existem daquela classe - não tem relação específica com nenhum objeto.
 * 
 *    Métodos de objetos são necessários para definir o que pode ser feito com instâncias de dada classe (objetos). Portanto, eles se referem somente ao objeto específico que for referenciado.
 */
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
