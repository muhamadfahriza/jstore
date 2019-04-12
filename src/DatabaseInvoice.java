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
    private static int LAST_INVOICE_ID = 0;
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    public static int getLastInvoiceId()
    {
        return LAST_INVOICE_ID;
    }



    public boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);

        return true;
    }
    
    public void removeCustomer(Customer customer)
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

        return false;
    }
    
    public Invoice getInvoice()
    {
        for(Invoice i : INVOICE_DATABASE)
        {
            if(i.getId() == id)
                return i;
        }

        return null;
    }

    public static Invoice getActiveOrder(Customer customer)
    {
        for(Invoice i : INVOICE_DATABASE)
        {
            if((i.getInvoiceStatus() == InvoiceStatus.Unpaid ||
                    i.getInvoiceStatus() == InvoiceStatus.Installment) &&
                    i.getCustomer() == customer)
            {
                if(i.getIsActive() == true)
                    return i;
            }
        }

        return null;
    }
}
