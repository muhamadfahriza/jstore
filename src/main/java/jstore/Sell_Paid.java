package jstore;

import java.util.*;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.PAID;
    private Customer customer;
    private boolean isActive;
 

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        this.customer = customer;
        super.setIsActive(false);
        
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

    public String toString()
    {
        String output = "==========--Sell Paid--==========\n";

        for(int i : super.getItem())
        {
            Item j = DatabaseItem.getItemFromId(i);

            String itemIteration =  "Id			: " + j.getId() + "\n" +
                    "Name		: " + j.getName() + "\n" +
                    "Price		: " + j.getPrice() +  "\n" +
                    "Category 	: " + j.getCategory() + "\n" +
                    "Status		: " + j.getStatus() + "\n\n";

            output += itemIteration;
        }

        output += "\n";

        return output;
        
    }
}
