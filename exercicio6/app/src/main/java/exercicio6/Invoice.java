
package exercicio6;

/**
 *
 * @author Edvaldojr
 */
public class Invoice {
    
    private int idItem;
    private String descricaoItem;
    private int quantidadeItem;
    private float precoUnitario;

    public Invoice(int idItem, String descricaoItem, int quantidadeItem, Float precoUnitario) {
        this.setIdItem(idItem);
        this.setDescricaoItem(descricaoItem);
        this.setQuantidadeItem(quantidadeItem);
        this.setPrecoUnitario(precoUnitario);
        
    }
    
    public double getInvoiceAmount() {
        return (quantidadeItem * precoUnitario);   
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        if (quantidadeItem < 0){
            this.quantidadeItem = 0;
        } else {
            this.quantidadeItem = quantidadeItem;
        }
    }

    public Float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Float precoUnitario) {
        if (precoUnitario < 0) {
            this.precoUnitario = 0.0f;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }
    
    
}
