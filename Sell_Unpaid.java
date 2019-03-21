/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.PAID; 
    private String dueDate;

 
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id,Item item,String date,int totalItem,int totalPrice, String dueDate)
    {
        // initialise instance variables
        super(id,item,date,totalItem,totalPrice); 
        this.dueDate=dueDate;
   
        
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public String getDueDate()
    {
        return dueDate;
    }
    
    public void printData()
    {
        super.printData();
        System.out.println("dueDate:"+ dueDate);
      
    }
}
