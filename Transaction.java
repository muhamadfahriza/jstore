 
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
     * Constructor for objects of class Transaction
     */
    public Transaction()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    /**
     * Method getId ini bertujuan untuk mendapatkan id item
     * 
     * @return id dari Item 
     */
    
    public void orderNewItem(Supplier supplier )
    {
   
        Item itemBaru = new Item(1, "PC RYZEN", 10,itemStatus.NEW, 15000000, itemCategory.ELECTRONICS,  supplier);
        databaseItem.addItem(itemBaru);
        Date date = new Date();
        Invoice InvoiceBaruNew = new Invoice(789, itemBaru, date.toString(), itemBaru.getPrice());
        itemBaru.setStatus(itemStatus.NEW);
        InvoiceBaruNew.setInvoiceStatus(InvoiceStatus.PAID);
        itemBaru.printData();
        InvoiceBaruNew.printData();
        
        
    }
    
    public void orderSecondItem(Supplier supplier)
    {
        
        Item itemSecond = new Item(2, "Handphone Samsung j5", 10,itemStatus.SECOND, 5000000, itemCategory.ELECTRONICS,  supplier);
        databaseItem.addItem(itemSecond);
        Invoice invoiceSecond = new Invoice(789, itemSecond, "6 Maret 2019", itemSecond.getPrice());
        itemSecond.setStatus(ItemStatus.NEW);
        invoiceSecond.setInvoiceStatus(InvoiceStatus.PAID);
        itemSecond.printData();
        invoiceSecond.printData();
    }
    
    public void orderRefurbished(Supplier supplier)
    {
        Item itemRefurbished = new Item(3, "Handphone BlackBerry ", 10,itemStatus.REFURBISHED, 100000, itemCategory.ELECTRONICS,  supplier);
        databaseItem.addItem(itemRefurbished);
        Invoice invoiceRefurbished = new Invoice(789, itemRefurbished, "6 Maret 2019", itemRefurbished.getPrice());
        itemRefurbished.setStatus(ItemStatus.NEW);
        invoiceRefurbished.setInvoiceStatus(InvoiceStatus.PAID);
        itemRefurbished.printData();
        invoiceRefurbished.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        Date date = new Date();
        
        Invoice invoiceBaru = new Invoice(1, item, date.toString(),
                                        item.getPrice());
        invoiceBaru.setInvoiceStatus(InvoiceStatus.PAID); 
        item.setStatus(ItemStatus.SOLD);
               
        invoiceBaru.printData();
        item.printData();     
        System.out.println();        
    }
    
    public static void sellItemUnpaid(Item item)
    {
        Date date = new Date();
        
        Invoice invoiceBaru = new Invoice(1, item, date.toString(),
                                        item.getPrice());
        invoiceBaru.setInvoiceStatus(InvoiceStatus.UNPAID); 
        item.setStatus(ItemStatus.SOLD);
              
        invoiceBaru.printData();
        item.printData();   
        System.out.println();        
    }
    
    public static void sellItemInstallment(Item item)
    {
        Date date = new Date();
        
        Invoice invoiceBaru = new Invoice(1, item, date.toString(),item.getPrice());
        invoiceBaru.setInvoiceStatus(InvoiceStatus.INSTALLMENT); 
        item.setStatus(ItemStatus.SOLD);
              
        invoiceBaru.printData();
        item.printData();    
        System.out.println();        
    }
    
}
