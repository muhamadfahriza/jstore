import java.util.Calendar; 
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
       
    }

    
    
    /**
     * Method getId ini bertujuan untuk mendapatkan id item
     * 
     * @return id dari Item 
     */
    
    public void orderNewItem(Item item )
    {
        Date date = new Date();
        
        Invoice Buy_Paid = new Invoice(1, item, date.toString(),2,item.getPrice());
       
        if( Buy_Paid instanceof Sell_Paid )      
            System.out.println( "Benar Invoice Type adalah Sell_Paid" );    
        else 
            System.out.println("Salah,Invoice Type bukan Sell _Paid" );  
        
        
    }
    
    public void orderSecondItem(Item item)
    {
        Date date = new Date();
        
        Invoice Buy_Paid = new Invoice(1, item, date.toString(),2,item.getPrice());
        
    }
    
    public  void orderRefurbished(Item item)
    {
        Date date = new Date();
        
        Invoice Buy_Paid = new Invoice(1, item, date.toString(),2,item.getPrice());
    }
    
    public static void sellItemPaid(Item item, Customer customer)
    {
        Date date = new Date();
        
        Invoice Sell_Paid = new Invoice(1, item, date.toString(),2,item.getPrice());
              
    }
    
    public static void sellItemUnpaid(Item item)
    {
        Date date = new Date(); 
        Invoice Sell_Unpaid = new Invoice(1, item, date.toString(),2,item.getPrice());      
    }
    
    public static void sellItemInstallment(Item item)
    {
        Date date = new Date();   
        Invoice Buy_Paid = new Invoice(1, item, date.toString(),2,item.getPrice());
                
    }
    
}
