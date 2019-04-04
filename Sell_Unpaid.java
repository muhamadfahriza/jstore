import java.util.Calendar;
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
    private Calendar dueDate;
    private Customer customer;
 
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id,Item item,Calendar date,int totalItem,int totalPrice, Calendar dueDate, Customer customer)
    {
        // initialise instance variables
        super(id,item,date,totalItem,totalPrice); 
        this.dueDate=dueDate;
        this.customer=customer;
  
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public Calendar getDueDate()
    {
        return dueDate;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer ;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate ;
    }
    
    public String toString()
    {
        
    }
    
    public void printData()
    {
        super.printData();
        System.out.println("dueDate:"+ dueDate);
      
    }
}
