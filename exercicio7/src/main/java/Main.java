public class Main {

    public static void main(String[] args) {

        Funcionario novo = new Funcionario("Edvaldo", "Junior", -2000.0f);

        System.out.println(novo.toString());

        System.out.println(novo.aumento());
        System.out.println(novo.toString());

    }
}
