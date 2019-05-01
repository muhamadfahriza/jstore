package jstore;

import java.util.*;
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

    public void orderNewItem(ArrayList<Integer> item ) throws InvoiceAlreadyExistsException {
        ArrayList<Integer> order = new ArrayList<>();
        //order.add(item.getId());
        Invoice buyPaid = new Buy_Paid(order);
        DatabaseInvoice.addInvoice(buyPaid);
    }

    public void orderSecondItem(ArrayList<Integer> item) throws InvoiceAlreadyExistsException {
        ArrayList<Integer> order = new ArrayList<>();

        //order.add(item.getId());

        Invoice buyPaid = new Buy_Paid(order);

        DatabaseInvoice.addInvoice(buyPaid);
    }

    public  void orderRefurbished(ArrayList<Integer> item) throws InvoiceAlreadyExistsException {
        ArrayList<Integer> order = new ArrayList<>();

        //order.add(item.getId());

        Invoice buyPaid = new Buy_Paid(order);

        DatabaseInvoice.addInvoice(buyPaid);

    }

    public static void sellItemPaid(ArrayList<Integer> item, Customer customer) throws InvoiceAlreadyExistsException {
        ArrayList<Integer> sell = new ArrayList<>();

       // sell.add(item.getId());

        Invoice sellPaid = new Sell_Paid(sell, customer);

        DatabaseInvoice.addInvoice(sellPaid);

    }

    public static void sellItemUnpaid(ArrayList<Integer> item,  Customer customer) throws InvoiceAlreadyExistsException {
        ArrayList<Integer> sell = new ArrayList<>();

       // sell.add(item.getId());

        Invoice sellPaid = new Sell_Paid(sell, customer);

        DatabaseInvoice.addInvoice(sellPaid);

    }

    public static void sellItemInstallment(ArrayList<Integer> item, Customer customer, int installmentPeriod) throws InvoiceAlreadyExistsException {
        ArrayList<Integer> sell = new ArrayList<>();

       // sell.add(item.getId());

        Invoice sellInstallment = new Sell_Installment(sell,
                installmentPeriod, customer);

        DatabaseInvoice.addInvoice(sellInstallment);
    }

    public static boolean finishTransaction(Invoice invoice)
    {
        Invoice finish = DatabaseInvoice.getInvoice(invoice.getId());
        if(finish == null){
            return false;
        }
        else {
            finish.setIsActive(false);
            System.out.println("Status aktif invoice: " + finish.getIsActive());
            return true;
        }
    }

    public static boolean cancelTransaction(Invoice invoice) throws InvoiceNotFoundException {
        Invoice cancel = DatabaseInvoice.getInvoice(invoice.getId());
        if (cancel == null) {
            return false;
        } else {
            DatabaseInvoice.removeInvoice(invoice.getId());
            return true;
        }
    }
}
