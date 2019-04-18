import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Kelas JStore bertujuan untuk membuat toko
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class JStore
{
  
    /**
     * Membuat Jstore
     * 
     */

    public JStore()
    {
        
    
       
    }

   /**
     * Method main ini adalah fungsi yang dijalankan utama 
     * @return agrs (dummy)
     */
   public static void main(String[] agrs)
   {
       Location test = new Location("JawaBarat", "Tempat Tinggal", "Kuningan");
       try {
           DatabaseSupplier.addSupplier(new Supplier(1, "muhamad", "muhamad@gmail.com", "085755783673", test));
       }
       catch (SupplierAlreadyExistsException a)
       {
           System.out.println(a.getExMessage());
       }
       try
       {
           DatabaseSupplier.addSupplier(new Supplier(2, "muhamad", "muhamad@gmail.com", "085755783673", test));
       }
       catch (SupplierAlreadyExistsException a)
       {
           System.out.println(a.getExMessage());
       }
       try
       {
           DatabaseSupplier.addSupplier(new Supplier(3, "muhamad", "muhamad@gmail.com", "085755783673", test));
       }
       catch (SupplierAlreadyExistsException a)
       {
           System.out.println(a.getExMessage());
       }


   }
  
}
