import java.util.*;
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
    private boolean isActive;


    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        isActive = true;
        
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
    
    public void setIntallmentPrice()
    {
        installmentPrice = getTotalPrice() / installmentPeriod * 102 / 100;
    }
    
    public void setTotalPrice()
    {
        //this.totalPrice =installmentPrice * installmentPeriod;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer ;
    }

    public String toString()
    {
        String output = "===========--Sell Installment--==========\n";

        for(int i : super.getItem())
        {
            Item j = DatabaseItem.getItemFromId(i);

            String itemIteration =  "Id			: " + j.getId() + "\n" +
                    "Name		: " + j.getName() + "\n" +
                    "Stock 		: " + j.getStock() + "\n" +
                    "Price		: " + j.getPrice() +  "\n" +
                    "Category 	: " + j.getCategory() + "\n" +
                    "Status		: " + j.getStatus() + "\n\n";

            output += itemIteration;
        }

        output += "\n";
        return output;
    }

}
