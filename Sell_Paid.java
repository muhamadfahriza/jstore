

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

 

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id,Item item,String date,int totalItem,int totalPrice)
    {
        // initialise instance variables
        super(id,item,date,totalItem,totalPrice); 
        
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void printData()
    {
        super.printData();
    }
}
