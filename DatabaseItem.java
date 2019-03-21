/**
 * Kelas DatabaseItem ini bertujuan untuk mengumpulkan data Item dimana bisa menambah dan mengahapus item
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class DatabaseItem
{
  
    private String[] listItem;
    public static Item itemDB;
    
    
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
   public static boolean addItem(Item item)
   {
       itemDB = item;
       return true;
   }
   
   /**
     * Method removeItem ini bertujuan untuk menghapus Item
     *  
     */
   public static boolean removeItem(Item item)
   {
       return false;
   }
   
  
   public  static Item getItem()
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
