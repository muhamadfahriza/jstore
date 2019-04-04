import java.util.Calendar;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.PAID;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;


    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id,Item item,Calendar date,int totalItem,int totalPrice, int installmentPeriod , Customer customer)
    {
        // initialise instance variables
        super(id,item,date,totalItem,totalPrice); 
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public int getIntallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getIntallmentPrice()
    {
        return installmentPrice;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setIntallmentPrice(int totalPrice, int installmentPeriod)
    {
        this.totalPrice=((totalPrice)/installmentPeriod)*(102/10) ;
    }
    
    public void setTotalPrice(int totalPrice, int installmentPeriod, int installmentPrice )
    {
        this.totalPrice =installmentPrice * installmentPeriod;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer ;
    }
    
    public  void printData()
    {
        super.printData();
    }
    
    public String toString()
    {
        
    }
}
