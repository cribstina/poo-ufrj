package aula2;

import java.util.Random;

public class Cliente {
    // atributos
    private String nome, cpf;
    private boolean tem_cartao = false;
    private double credito_disponivel = 0.0;
    private int num_cartao;
    public static int qtde_clientes = 0;

    public Cliente(String nome_cli, String cpf) {
        this.nome = nome_cli;
        this.cpf = cpf;
        Cliente.qtde_clientes += 1;
    }

    public Cliente() {
        Cliente.qtde_clientes += 1;
    }

    public void atualizaCPF(String cpf) {
        this.cpf = cpf;
    }

    public String acessaCPF() {
        return this.cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean temCartao() {
        return tem_cartao;
    }

    public void adicionaCartao() {
        Random random = new Random();
        this.num_cartao = Math.abs(random.nextInt());
        this.tem_cartao = true;
        this.atualizarLimiteCredito(100);
    }

    public double getCredito() {
        return this.credito_disponivel;
    }

    public void atualizarLimiteCredito(double novo_limite) {
        if (novo_limite > this.credito_disponivel) {
            this.credito_disponivel = novo_limite;
        }
    }

    public int getNumCartao() {
        return this.num_cartao;
    }

    public static int getQtdeClientes() {
        return Cliente.qtde_clientes;
    }

}