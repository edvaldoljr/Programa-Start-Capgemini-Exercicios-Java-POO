/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exercicio6;

public class App {

    public static void main(String[] args) {
        
        Invoice inv = new Invoice(10, "Mause pad", 10, 50.0f);
        
        System.out.println("Valor da fatura R$: " + inv.getInvoiceAmount());
    }
}
