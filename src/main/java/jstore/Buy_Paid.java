package jstore;

import java.util.*;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.PAID;
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        // initialise instance variables
        super(item);
        isActive = false;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }

    public String toString()
    {
        String output = "==========--Buy Paid--==========\n";

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

//        output += "\n";

        return output;
    }
}
