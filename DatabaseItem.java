/**
 * Kelas DatabaseItem ini bertujuan untuk mengumpulkan data Item dimana bisa menambah dan mengahapus item
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class DatabaseItem
{
  
    private String[] listItem;
    public Item itemDB;
    
    
    /**
     * Membuat DatabaseItem.
     */
    public DatabaseItem()
    {
        
    }

   /**
     * Method addItem ini bertujuan untuk menambah Item
     *  
     */
   public boolean addItem(Item item)
   {
       itemDB = item;
       return false;
   }
   
   /**
     * Method removeItem ini bertujuan untuk menghapus Item
     *  
     */
   public boolean removeItem(Item item)
   {
       return false;
   }
   
  
   public Item getItem()
    {
        return itemDB;
    }
    
   /**
     * Method getItemDatabase ini bertujuan untuk mendapat Item Database
     *  
     */
   public void getItemDatabase()
   {
       
   }
}
