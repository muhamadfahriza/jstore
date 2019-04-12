import java.util.*;
/**
 * Kelas Invoice ini bertujuan untuk membuat Invoice pembelian Item.
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class Invoice
{
    
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;


    /**
     * Membuat Invoice.
     * @param id            id invoice (pembeda) yang akan dibuat
     * @param item          item yang dibeli  ditulis di invoice yang akan dibuat
     * @param date          tanggal pembelian ditulis di invoice yang akan dibuat
     * @param totalPrice    total harga item invoice yang akan dibuat
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.item = item;
        date = new GregorianCalendar();

        id = DatabaseInvoice.getLastInvoiceId() + 1;

        totalPrice = 0;
        for(int i : this.item)
        {
            totalPrice += DatabaseItem.getItemFromId(i).getPrice();
        }
    }

    /**
     * Method getId ini bertujuan untuk mendapatkan id invoice
     * 
     * @return id invoice sebagai pembeda dengan invoce lainya 
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method getItem ini bertujuan untuk mendapatkan item
     * 
     * @return item yang dibeli yang akan ada di invoice 
     */
    public Item getItem()
    {
        return item;
    }
    
    /**
     * Method getDate ini bertujuan untuk mendapatkan tanggal pembelian item
     * 
     * @return tanggal pembelian item yang akan ada di invoice 
     */
    public Calendar getDate()
    {
        return date;
    }
    

    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }

    public InvoiceType getInvoiceType()
    {
        return type;
    }

    public boolean getIsActive()
    {
        return isActive;
    }

    public Customer getCustomer()
    {
        return customer;
    }


    /**
     * Method setId ini bertujuan untuk memasukan/mengatur id invoice   
     * item
     * @param   id     paramerter id invoice
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Method setItem ini bertujuan untuk memasukan/mengatur Item di invoice   
     * item
     * @param   item     paramerter item yang dibeli yang akan ada di Invoice 
     */
    public void setItem(Item item)
    {
        this.item=item;
    }
    
    /**
     * Method setDate ini bertujuan untuk memasukan/mengatur tanggal di invoice   
     * item
     * @param   date     paramerter tanggal pembelian yang akan ada di Invoice 
     */
    public void setDate(Calendar date)
    {
        this.date=date;
    }
    
    /**
     * Method setTotalPrice ini bertujuan untuk memasukan/mengatur total harga di invoice   
     * item
     * @param   totalPrice     paramerter total harga dari item yang akan ada di Invoice 
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;

    }
    
    public void setTotalItem(int totalItem)
    {
        this.totalItem=totalItem;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status=status;
    }

    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }

    public abstract String toString();
    
    /**
     * Method printData ini bertujuan untuk mengeprint data
     */

}
    
