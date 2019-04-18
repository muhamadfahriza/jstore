import java.lang.*;
import java.util.regex.*;

/**
 * Kelas Supplier ini bertujuan untuk menyimpan data supplier yang isi
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class Supplier
{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Membuat Supplier.
     * @param id            id Supplier yang akan dibuat
     * @param name          nama Supplier yang akan dibuat
     * @param email         email dari Supplier yang akan dibuat
     * @param phoneNummber  nomor hp dari Supplier yang akan dibuat
     * @param location      lokasi dari Supplier yang akan dibuat
     */
    public Supplier(int id, String name, String email, String phoneNummber, Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;

        id = DatabaseSupplier.getLastSupplierId() + 1;
 
    }

    
    /**
     * Method getId ini bertujuan untuk mendapatkan id suplier
     * 
     * @return id dari supplier
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method getName ini bertujuan untuk mendapatkan nama suplier 
     * 
     * @return nama dari suplier
     */
    public String getName()
    {
        return name;
    }
   
    
    /**
     * Method getEmail ini bertujuan untuk mendapatkan email supplier 
     * 
     * @return Email dari Supplier
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Method getEmail ini bertujuan untuk mendapatkan email supplier 
     * 
     * @return nomor hp dari Supplier
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Method getLocation ini bertujuan untuk mendapatkan lokasi supplier 
     * 
     * @return lokasi dari Supplier
     */
    public Location getLocation()
    {
        return location;
    }
    
    
    /**
     * Method setId ini bertujuan untuk memasukan/mengatur id  supplier 
     * 
     * @param  id paramerter id supplier
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Method setName ini bertujuan untuk memasukan/mengatur nama supplier 
     * 
     * @param  name paramerter nama supplier
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * Method setEmail ini bertujuan untuk memasukan/mengatur Email supplier 
     * 
     * @param  email paramerter email supplier
     */
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    /**
     * Method setPhoneNumber ini bertujuan untuk mengatur nomor hp 
     * supplier 
     * 
     * @param  phoneNumber paramerter nomor hp supplier 
     */
    public void setPhoneNumber(String phoneNumber)
    {
        String pattern = "(\\+62)(\\d){9,12}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(phoneNumber);

        if(m.matches())
        {
            System.out.println("Format benar");
            this.phoneNumber = phoneNumber;
        }
        else
        {
            System.out.println("Format salah");
            this.phoneNumber = null;
        }
    }
    
    /**
     * Method setLocation ini bertujuan untuk memasukan/mengatur lokasi 
     * supplier 
     * 
     * @param  location paramerter lokasi supplier 
     */
    public void setLocation(Location location)
    {
        this.location=location;
    }
    
    /**
     * Method printData ini bertujuan untuk mengeprint data
     */

    public  String toString()
    {
        return  "===========SUPPLIER===========" + "\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone Number: " +phoneNumber + "\n" +
                location.toString();
    }
    
}
    
