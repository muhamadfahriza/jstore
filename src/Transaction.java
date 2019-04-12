import java.util.*;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class Transaction
{
    // instance variables - replace the example below with your own
    private int x;
    private Supplier supplier;
    private ItemCategory itemCategory;
    private ItemStatus itemStatus;
    private InvoiceStatus invoiceStatus;
    private DatabaseItem databaseItem;

    /**
     * Method getId ini bertujuan untuk mendapatkan id item
     * 
     * @return id dari Item 
     */
    
    public void orderNewItem(Item item )
    {
        ArrayList<Integer> order = new ArrayList<>();
        order.add(item.getId());
        Invoice buyPaid = new Buy_Paid(order);
        DatabaseInvoice.addInvoice(buyPaid);
    }
    
    public void orderSecondItem(Item item)
    {
        ArrayList<Integer> order = new ArrayList<>();

        order.add(item.getId());

        Invoice buyPaid = new Buy_Paid(order);

        DatabaseInvoice.addInvoice(buyPaid);
    }
    
    public  void orderRefurbished(Item item)
    {
        ArrayList<Integer> order = new ArrayList<>();

        order.add(item.getId());

        Invoice buyPaid = new Buy_Paid(order);

        DatabaseInvoice.addInvoice(buyPaid);

    }
    
    public static void sellItemPaid(Item item, Customer customer)
    {
        Date date = new Date();
        
        Invoice Sell_Paid = new Invoice(1, item, date.toString(),2,item.getPrice());
              
    }
    
    public static void sellItemUnpaid(Item item,  Customer customer)
    {
        ArrayList<Integer> sell = new ArrayList<>();

        sell.add(item.getId());

        Invoice sellPaid = new Sell_Paid(sell, customer);

        DatabaseInvoice.addInvoice(sellPaid);

    }
    
    public static void sellItemInstallment(Item item, Customer customer, int installmentPeriod)
    {
        ArrayList<Integer> sell = new ArrayList<>();

        sell.add(item.getId());

        Invoice sellInstallment = new Sell_Installment(sell,
                installmentPeriod, customer);

        DatabaseInvoice.addInvoice(sellInstallment);
    }

    public boolean finishTransaction(Invoice invoice)
    {
        Invoice finish = DatabaseInvoice.getInvoice(invoice.getId());

        if(finish == null)
            return false;

        finish.setIsActive(false);

        System.out.println("Status aktif invoice: " + finish.getIsActive());

        return true;
    }

    public boolean cancelTransaction(Invoice invoice)
    {
        Invoice cancel = DatabaseInvoice.getInvoice(invoice.getId());

        if(DatabaseInvoice.removeInvoice(invoice.getId()))
            return true;
        else
            return false;
    }
}
