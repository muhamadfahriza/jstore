

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


    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id,Item item,String date,int totalItem,int totalPrice, int installmentPeriod)
    {
        // initialise instance variables
        super(id,item,date,totalItem,totalPrice); 
        this.installmentPeriod=installmentPeriod;
        
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
    
    
    public void setIntallmentPrice(int totalPrice, int installmentPeriod)
    {
        this.totalPrice=((totalPrice)/installmentPeriod)*(102/10) ;
    }
    
    public void setTotalPrice(int totalPrice, int installmentPeriod, int installmentPrice )
    {
        this.totalPrice =installmentPrice * installmentPeriod;
    }
    
    public  void printData()
    {
        super.printData();
    }
}
