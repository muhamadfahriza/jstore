
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 14-03-2019
 */
public enum ItemStatus
{
    NEW ("New"),
    SECOND("Second"),
    REFURBISHED("Refurbished"),
    SOLD("Sold");
    
    private String statusItem;
    
    ItemStatus(String statusItem) {
        this.statusItem = statusItem;
    }
    
    public String statusItem() {
        return statusItem;
    }
    
    @Override
    public String toString(){
        return this.statusItem;
    }
  
    
    
}
