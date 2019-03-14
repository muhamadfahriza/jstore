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
        Location tempatTinggal = new Location("Kuningan", "Jawa Barat", "Kota Keren");
        Supplier Fahriza = new Supplier(1, "Fahriza", "mfnovriansyah", "085755783673", tempatTinggal);
        
        tempatTinggal.printData();
        Fahriza.printData();
        
        Transaction transaksi = new Transaction();        
        transaksi.orderNewItem(Fahriza);
        transaksi.orderSecondItem(Fahriza);
        transaksi.orderRefurbished(Fahriza);
        
      
   }
  
}
