// A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
// três informações a seguir como atributos:
//  a. um primeiro nome,
//  b. um sobrenome
//  c. um salário mensal
// Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
// cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste
// que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada
// instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
// empregado.


public class Funcionario {

    private String primeiroNome;
    private String sobrenome;
    private float salarioMensal;

    private float salarioAnual;
    private float reajuste;

    public Funcionario(String primeiroNome, String sobrenome, float salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.setSalarioMensal(salarioMensal);
        this.getSalarioAnual(salarioAnual);
    }


    public float salarioAnual() {
        salarioAnual = salarioMensal * 12;
        return salarioAnual;
    }

    public float aumento() {
        reajuste = (float) (salarioMensal * 0.10);
        salarioMensal = reajuste + salarioMensal;
        System.out.print("Reajuste de 10% no valor de R$: " + reajuste + " Salário anual de R$: ");
        return salarioAnual();

    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public float getSalarioAnual(float salarioAnual) {
        salarioAnual();
        return salarioAnual;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal < 0) {
            this.salarioMensal = 0.0f;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "primeiroNome = '" + primeiroNome + '\'' +
                ", sobrenome = '" + sobrenome + '\'' +
                ", salarioMensal = " + salarioMensal +
                ", salarioAnual = " + salarioAnual +
                '}';
    }
}
