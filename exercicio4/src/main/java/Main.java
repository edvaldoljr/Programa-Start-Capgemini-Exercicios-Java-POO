public class Main {

    public static void main(String[] args) {

        Elevador novo = new Elevador(2, 5, 10, 5);

//        novo.inicializa(20, 10);

        novo.entra(21);

        novo.sai(1, 2);

        novo.subir(3);

        novo.descer(0);

        System.out.println(novo.toString());
    }
}
