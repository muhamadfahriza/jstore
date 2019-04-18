import java.util.*;
/**
 * Kelas DatabaseSupplier ini bertujuan untuk mengumpulkan data Item dimana bisa menambah dan mengahapus item
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class DatabaseSupplier
{
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<>();
    private static int LAST_SUPPLIER_ID = 0;


    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }

    public static int getLastSupplierId()
    {
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier)throws SupplierAlreadyExistsException
    {
        for(Supplier i : SUPPLIER_DATABASE)
        {
            if(i.getEmail().equals(supplier.getEmail()) || i.getPhoneNumber().equals(supplier.getPhoneNumber()))
            {
                throw new SupplierAlreadyExistsException(supplier);
            }
        }

        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();

        return true;
    }

    public static Supplier getSupplier(int id)
    {
        for(Supplier i : SUPPLIER_DATABASE)
        {
            if(i.getId() == id)
                return i;
        }

        return null;
    }

    public static boolean removeSupplier(int id) throws SupplierNotFoundException, ItemNotFoundException {
        for(Supplier i : SUPPLIER_DATABASE)
        {

            if(i.getId() == id)
            {
                ArrayList<Item> list = DatabaseItem.getItemFromSupplier(i);
                for(Item j : list)
                {
                    DatabaseItem.removeItem(j.getId());
                }
                SUPPLIER_DATABASE.remove(i);
                return true;
            }
        }

        throw new SupplierNotFoundException(id);
    }
}
