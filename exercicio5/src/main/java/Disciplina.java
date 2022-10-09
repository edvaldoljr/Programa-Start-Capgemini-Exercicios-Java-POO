//Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
//classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
//Escreva os seguintes métodos para esta classe:
//a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
//b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)


public class Disciplina {

    private String nomeAluno;
    private float nota1;
    private float nota2;
    private float notaTrabalho;

    private float media;
    private float provaFinal = 10;

    public Disciplina(String nomeAluno, float nota1, float nota2, float notaTrabalho) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
        this.getMedia(media);
    }

    public void media() {
         media = nota1 + nota2 + notaTrabalho / 3;
        System.out.println(" Nome: " + nomeAluno + "\n Media: " + media);

    }

    public void mediaFinal() {
        provaFinal = provaFinal - media;
        System.out.println("Necessario tirar nota " + provaFinal + " na prova final");
    }

    public float getMedia(float media) {
        media();
        return media;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getProvaFinal() {
        return provaFinal;
    }

    public void setProvaFinal(float provaFinal) {
        this.provaFinal = provaFinal;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeAluno = " + nomeAluno  +
                ", nota 1 = " + nota1 +
                ", nota 2 = " + nota2 +
                ", notaTrabalho = " + notaTrabalho +
                ", media até o momento = " + media +
                '}';
    }
}
