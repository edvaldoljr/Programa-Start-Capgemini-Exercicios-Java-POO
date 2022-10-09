public class Elevador {

    private int andatAtual;
    private int totalAndares;
    private int capacidadeTotal;
    private int totalPessoas;

    private int removerPessoa;


    public Elevador(int andatAtual, int totalAndares, int capacidadeTotal, int totalPessoas) {
        this.andatAtual = andatAtual;
        this.totalAndares = totalAndares;
        this.capacidadeTotal = capacidadeTotal;
        this.totalPessoas = totalPessoas;
    }

    public void inicializa(int capacidadeTotal, int totalAndares) {
        this.andatAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeTotal = capacidadeTotal;
        this.totalPessoas = 0;
        System.out.println("Andar atual: " + andatAtual + "\n total Andares: " + totalAndares + "\n capacidade Total:" + capacidadeTotal + "\n Total Pessoas: " + totalPessoas);
    }

    public void entra(int totalPessoas) {
        if (capacidadeTotal > totalPessoas) {
            System.out.println("Entra... Total de pessoas: " + totalPessoas );
        } else {
            System.out.println("Elevador com capacidade maxima, apenas: " + capacidadeTotal + " pessoas por vez.");
        }
    }

    public void sai(int removerPessoa, int totalPessoas) {
        if (totalPessoas > 0) {
            totalPessoas = totalPessoas - removerPessoa;
            System.out.println("SAINDO ... Pessoas restantes: " + totalPessoas + " capacidade total: " + capacidadeTotal + " Pessoas");
        } else {
            System.out.println("Elevador Vazio!");
        }
    }

    public void subir(int andatAtual) {
        if (andatAtual < totalAndares) {
            System.out.println("Subindo");
        } else {
            System.out.println("Elevador se encontra no último andar");
        }
    }

    public void descer(int andatAtual) {
        if (andatAtual == 0) {
            System.out.println("Elevador se encontra no Térreo");
        } else {
            System.out.println("Descendo");
        }
    }

    public void setAndatAtual(int andatAtual) {
        this.andatAtual = andatAtual;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andatAtual=" + andatAtual +
                ", totalAndares=" + totalAndares +
                ", capacidadeTotal=" + capacidadeTotal +
                ", totalPessoas=" + totalPessoas +
                '}';
    }
}
