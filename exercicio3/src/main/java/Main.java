public class Main {

    public static void main(String[] args) {

        BombaCombustivel novo = new BombaCombustivel("gasolina" , 2000f);

        System.out.println(novo.toString());

        novo.setTipoCombustivel("Alcool");

        System.out.println(novo.toString());

        novo.setValorLitro(5.00f);

        System.out.println(novo.toString());

        novo.setQuantidadeCombustivelBomba(1000f);

        System.out.println(novo.toString());

        System.out.println(novo.abastecerPorLitro(20f));

        System.out.println(novo.toString());

        System.out.println(novo.abastecerPorValor(102));

        System.out.println(novo.toString());

    }
}
