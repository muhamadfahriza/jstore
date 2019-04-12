
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 14-03-2019
 */
public enum InvoiceStatus
{
    PAID ("Paid"),
    UNPAID("Unpaid"),
    INSTALLMENT("Installment");
    
    private String statusInvoice;
    
    InvoiceStatus(String statusInvoice) {
        this.statusInvoice = statusInvoice;
    }
    
    public String statusItem() {
        return statusInvoice;
    }
    
    @Override
    public String toString(){
        return this.statusInvoice;
    }
  
    
    
}
