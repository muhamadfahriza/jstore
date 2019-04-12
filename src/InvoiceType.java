    
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceType
{
   Buy("Buy"),  Sell("Sell");
   
   private String invoiceType;
    
    InvoiceType(String invoiceType){
        this.invoiceType = invoiceType;
    } 
    
    @Override
    public String toString(){
        return this.invoiceType;
    }
    
}
