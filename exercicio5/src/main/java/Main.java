public class Main {

    public static void main(String[] args) {

        Disciplina novo = new Disciplina("Edvaldo", 2.5f, 2.5f, 2f);

        System.out.println(novo.toString());

        novo.media();
        novo.mediaFinal();

        System.out.println(novo.toString());

    }
}
