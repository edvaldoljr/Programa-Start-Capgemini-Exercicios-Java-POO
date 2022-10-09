//Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
//seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
//atributos a classes deve conter os seguintes métodos.
//a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
//litros que foi colocada no veículo
//b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
//valor a ser pago pelo cliente.
//c. alterarValor; //altera o valor do litro do combustível.
//d. alterarCombustivel; //altera o tipo do combustível.
//e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba

public class BombaCombustivel {

    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivelBomba;

    private float valorAbastecimento;
    private float converteDinheiroLitros;

    public BombaCombustivel(String tipoCombustivel, float quantidadeCombustivelBomba) {
        this.tipoCombustivel = tipoCombustivel;
        if (this.tipoCombustivel.equalsIgnoreCase ("gasolina")) {
            this.valorLitro = 5.00f;
        } else if (this.tipoCombustivel.equalsIgnoreCase("alcool")) {
            this.valorLitro = 4.50f;
        } else if (this.tipoCombustivel.equalsIgnoreCase("diesel")){
            this.valorLitro = 6.50f;
        }
        this.quantidadeCombustivelBomba = quantidadeCombustivelBomba;
    }

    public float abastecerPorValor(float valorDinheiro) {
        this.converteDinheiroLitros = valorDinheiro / valorLitro;
        System.out.print("Quantidade em litros: ");
        this.quantidadeCombustivelBomba = quantidadeCombustivelBomba - converteDinheiroLitros;
        return converteDinheiroLitros;

    }

    public float abastecerPorLitro(float litro) {
        this.valorAbastecimento = valorLitro * litro;
        this.quantidadeCombustivelBomba = quantidadeCombustivelBomba - litro;
        System.out.print("Valor a pagar: ");
        return valorAbastecimento;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setQuantidadeCombustivelBomba(float quantidadeCombustivelBomba) {
        this.quantidadeCombustivelBomba = quantidadeCombustivelBomba;
    }

    @Override
    public String toString() {
        return "BombaCombustivel{" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                ", valorLitro=" + valorLitro +
                ", quantidadeCombustivelBomba=" + quantidadeCombustivelBomba +
                '}';
    }

}
