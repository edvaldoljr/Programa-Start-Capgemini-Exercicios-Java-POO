
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Edvaldojr
 */
public class Pessoa {
    
    Scanner scan = new Scanner(System.in);
    
    private String nome;
    private float altura;
    private int anoNascimento;
    private int anoatual;

    public Pessoa(String nome, float altura, int anoNascimento, int anoatual) {
        this.nome = nome;
        this.altura = altura;
        this.anoNascimento = anoNascimento;
        this.anoatual = anoatual;
    }
    
    
    
    public int calculaIdade() {
        return ( anoatual - anoNascimento  );
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }


    public int getAnoatual() {
        return anoatual;
    }

    public void setAnoatual(int anoatual) {
        this.anoatual = anoatual;
    }

    @Override
    public String toString() {
        return "Pessoa{" + " \n Nome = " + nome 
                + " \n Altura = " + altura 
                + " \n Ano Nascimento = " + anoNascimento 
                + " \n Ano Atual = " + anoatual 
                + " \n tem a idade de: " + calculaIdade() + " Anos" ;
    }
    
}
