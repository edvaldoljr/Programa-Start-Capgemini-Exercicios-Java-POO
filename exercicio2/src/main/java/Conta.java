//Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
//número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
//saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.

public class Conta {

    private int numeroConta;
    private String nome;
    private float saldo;

    public Conta(int numeroConta, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(int numero, String nome) {
        this.nome = nome;
        this.numeroConta = numero;
        this.saldo = 0.0f;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositi(float valor) {
        this.saldo += valor;
    }

    public void saque(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
