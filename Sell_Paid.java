import java.util.Calendar;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.PAID; 
    private Customer customer;
 

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id,Item item,Calendar date,int totalItem,int totalPrice, Customer customer)
    {
        // initialise instance variables
        super(id,item,date,totalItem,totalPrice); 
        this.customer=customer;
        
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer ;
    }
    
    public void printData()
    {
        super.printData();
    }
    
    public String toString()
    {
        
    }
}
