package jstore;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Kelas JStore bertujuan untuk membuat toko
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
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
   public static void main(String[] args) throws SupplierAlreadyExistsException, ItemAlreadyExistsException, InvoiceAlreadyExistsException {
       Location tempatTinggal = new Location("Jawa Barat", "Tempat Tinggal", "Kuningan");
       Supplier s1 = new Supplier("Muhamad", "muhamad@gmail.com", "085755783673", tempatTinggal);
       DatabaseSupplier.addSupplier(s1);
       Supplier s2 = new Supplier("fahriza", "fahriza@gmail.com", "085755783674", tempatTinggal);
       DatabaseSupplier.addSupplier(s2);
       Supplier s3 = new Supplier("novriansyah", "novriansyah@gmail.com", "085755783675", tempatTinggal);
       DatabaseSupplier.addSupplier(s3);
//       System.out.println(s3);

       DatabaseItem.addItem(new Item("SSD WD Green  240gb ", ItemStatus.NEW,499000, ItemCategory.ELECTRONICS , DatabaseSupplier.getSupplier(1)));
       DatabaseItem.addItem(new Item("SSD Team Lite 3D 240gb", ItemStatus.NEW, 480000, ItemCategory.ELECTRONICS, DatabaseSupplier.getSupplier(2)));
       DatabaseItem.addItem(new Item("SSD Samsung 860 EVO 240gb", ItemStatus.NEW, 720000, ItemCategory.ELECTRONICS, DatabaseSupplier.getSupplier(3)));
       DatabaseItem.addItem(new Item("SSD Vgen 240gb", ItemStatus.NEW, 500000, ItemCategory.ELECTRONICS, DatabaseSupplier.getSupplier(1)));


       SpringApplication.run(JStore.class, args);

   }
  
}
