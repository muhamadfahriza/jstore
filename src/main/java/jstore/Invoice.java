package jstore;

import java.util.*;
/**
 * Kelas Invoice ini bertujuan untuk membuat Invoice pembelian Item.
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public abstract class Invoice {

    private int id = 0;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    private static InvoiceType INVOICE_TYPE;
    private static InvoiceStatus INVOICE_STATUS;


    public Invoice(ArrayList<Integer> item) {
        this.item = item;
        this.date = new GregorianCalendar();
        this.id = DatabaseInvoice.getLastInvoiceId() + 1;

        totalPrice = 0;
        for (int i : this.item) {
            totalPrice += DatabaseItem.getItemFromId(i).getPrice();
        }
    }

    /**
     * Method getId ini bertujuan untuk mendapatkan id invoice
     *
     * @return id invoice sebagai pembeda dengan invoce lainya
     */
    public int getId() {
        return id;
    }

    /**
     * Method getDate ini bertujuan untuk mendapatkan tanggal pembelian item
     *
     * @return tanggal pembelian item yang akan ada di invoice
     */
    public Calendar getDate() {
        return date;
    }


    public InvoiceStatus getInvoiceStatus() {
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType() {
        return INVOICE_TYPE;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getTotalPrice()
    {
        return totalPrice;
    }
    public ArrayList<Integer> getItem()
    {
        return item;
    }

    /**
     * Method setId ini bertujuan untuk memasukan/mengatur id invoice
     * item
     *
     * @param id paramerter id invoice
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method setItem ini bertujuan untuk memasukan/mengatur Item di invoice
     * item
     *
     * @param item paramerter item yang dibeli yang akan ada di Invoice
     */
    public void setItem(ArrayList<Integer> item) {
        this.item = item;
    }

    /**
     * Method setDate ini bertujuan untuk memasukan/mengatur tanggal di invoice
     * item
     *
     * @param date paramerter tanggal pembelian yang akan ada di Invoice
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * Method setTotalPrice ini bertujuan untuk memasukan/mengatur total harga di invoice
     * item
     *
     * @param totalPrice paramerter total harga dari item yang akan ada di Invoice
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;

    }


    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public abstract String  toString();



}
    
