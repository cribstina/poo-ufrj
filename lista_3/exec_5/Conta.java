package lista_3.exec_5;

public class Conta {
    double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double pegaSaldo() {
        return this.saldo;
    }

    public boolean saca(double valor) {
        if (valor < this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Erro! Saldo insuficiente");
            return false;
        }
    }
}