
/**
 * Kelas Invoice ini bertujuan untuk membuat Invoice pembelian Item.
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class Invoice
{
    
    private int id; 
    private Item item; 
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;

    /**
     * Membuat Invoice.
     * @param id            id invoice (pembeda) yang akan dibuat
     * @param item          item yang dibeli  ditulis di invoice yang akan dibuat
     * @param date          tanggal pembelian ditulis di invoice yang akan dibuat
     * @param totalPrice    total harga item invoice yang akan dibuat
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
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
    public String getDate()
    {
        return date;
    }
    
    /**
     * Method getTotalPrice ini bertujuan untuk mendapatkan total harga
     * 
     * @return total harga item yang ada di invoice 
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    
    public int getTotalItem()
    {
        return totalItem;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
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
    public void setDate(String date)
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
        this.totalPrice=totalPrice;
    }
    
    public void setTotalItem(int totalItem)
    {
        this.totalItem=totalItem;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status=status;
    }
    
    
    /**
     * Method printData ini bertujuan untuk mengeprint data
     */
    public void printData()
    {
        System.out.println("======INOVICE=====");
        System.out.println("ID:"+id);
        System.out.println("TANGGAL:"+ date);
        System.out.println("ITEM:"+ item);
        System.out.println("TOTALITEM:"+ totalItem);
        System.out.println("TOTALHARGA:"+totalPrice);
        System.out.println("STATUS:"+ status);
      
    }
    
}
    
