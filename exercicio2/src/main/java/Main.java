public class Main {

    public static void main(String[] args) {

        Conta novaConta = new Conta(123, "Edvaldo", 1000);

        System.out.println(novaConta.toString());
        novaConta.setNome("Junior");
        novaConta.depositi(50);
        System.out.println(novaConta.toString());
        novaConta.saque(50);
        System.out.println(novaConta.toString());
    }
}
