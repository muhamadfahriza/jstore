
/**
 * Write a description of class Invoice here.
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

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
    }

    public int getId()
    {
        return id;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    public String getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setItem(Item item)
    {
        this.item=item;
    }
    
    public void setDate(String date)
    {
        this.date=date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
    public void printData()
    {
        
    }
    
}
    
