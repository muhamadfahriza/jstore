package jstore;

import java.util.*;
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int LAST_INVOICE_ID ;
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    public static int getLastInvoiceId()
    {
        return LAST_INVOICE_ID;
    }



    public static boolean addInvoice(Invoice invoice)throws InvoiceAlreadyExistsException
    {
        for(Invoice i : INVOICE_DATABASE)
        {
            if(i.getItem().equals(invoice.getItem()) && i.getCustomer().equals(invoice.getCustomer()))
            {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }

        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();


        INVOICE_DATABASE.add(invoice);

        return true;
    }
    
    public static boolean removeInvoice(int id)throws InvoiceNotFoundException
    {
        for(Invoice i : INVOICE_DATABASE)
        {
            if(i.getId() == id)
            {
                if(i.getIsActive() == true)
                {
                    i.setIsActive(false);
                }

                INVOICE_DATABASE.remove(i);

                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
    
    public static Invoice getInvoice(int id)
    {
        for(Invoice i : INVOICE_DATABASE)
        {
            if(i.getId() == id)
                return i;
        }

        return null;
    }

    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> list = new  ArrayList<Invoice>();
        boolean found = false;

        for(Invoice i : INVOICE_DATABASE)
        {
            if((i.getInvoiceStatus() == InvoiceStatus.UNPAID ||
                    i.getInvoiceStatus() == InvoiceStatus.INSTALLMENT) &&
                    i.getCustomer() == customer && i.getIsActive() == true)
            {
                    list.add(i);
                    found = true;
            }
            else{
                throw new CustomerDoesntHaveActiveException(customer);
            }
        }
        if(found)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
}

