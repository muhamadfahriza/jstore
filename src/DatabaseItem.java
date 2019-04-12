import java.util.*;
/**
 * Kelas DatabaseItem ini bertujuan untuk mengumpulkan data Item dimana bisa menambah dan mengahapus item
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class DatabaseItem
{
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<>();
    private static int LAST_ITEM_ID = 0;


    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }

    public static int getLastItemId()
    {
        return LAST_ITEM_ID;
    }

    /**
     * Method addItem ini bertujuan untuk menambah Item
     *  
     */
   public static boolean addItem(Item item)
   {
       for(Item i : ITEM_DATABASE)
       {
           if(i.getName().equals(item.getName()) &&
                   i.getStatus().equals(item.getStatus()) &&
                   i.getSupplier().equals(item.getSupplier())
           )
           {
               return false;
           }
       }

       ITEM_DATABASE.add(item);
       LAST_ITEM_ID = item.getId();

       return true;
   }
    public static Item getItemFromId(int id)
    {
        for(Item i : ITEM_DATABASE)
        {
            if(i.getId() == id)
                return i;
        }

        return null;
    }

    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> sub = new ArrayList<>();

        for(Item i : ITEM_DATABASE)
        {
            if(i.getSupplier() == supplier)
                sub.add(i);
        }

        if(sub.size() == 0)
            return null;
        else
            return sub;
    }

    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> sub = new ArrayList<>();

        for(Item i : ITEM_DATABASE)
        {
            if(i.getCategory() == category)
                sub.add(i);
        }

        if(sub.size() == 0)
            return null;
        else
            return sub;
    }

    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> sub = new ArrayList<>();

        for(Item i : ITEM_DATABASE)
        {
            if(i.getStatus() == status)
                sub.add(i);
        }

        if(sub.size() == 0)
            return null;
        else
            return sub;
    }


    /**
     * Method removeItem ini bertujuan untuk menghapus Item
     *  
     */
   public static boolean removeItem(int id)
   {
       for(Item i : ITEM_DATABASE)
       {
           if(i.getId() == id)
           {
               ITEM_DATABASE.remove(i);

               return true;
           }
       }

       return false;
   }
   
  

}
