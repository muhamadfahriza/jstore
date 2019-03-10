
/**
 * Kelas Item ini bertujuan untuk menyimpan barang Item dengan ada informasi 
 * stock, harga dan kategori
 * 
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class Item
{
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;

    /**
     * Membuat Item.
     * @param id            id item yang akan dibuat
     * @param name          nama item yang akan dibuat
     * @param stock         stok dari item yang akan dibuat
     * @param price         harga dari item yang akan dibuat
     * @param category      kategori dari item yang akan dibuat
     * @param supplier      supplier dari item yang akan dibuat
     */
    public Item(int id, String name, int stock, int price, String category, Supplier supplier)
    {
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
    }

    /**
     * Method getId ini bertujuan untuk mendapatkan id item
     * 
     * @return id dari Item 
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method getName ini bertujuan untuk mendapatkan nama item
     * 
     * @return nama dari Item 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method getStock ini bertujuan untuk mendapatkan stok dari item
     * 
     * @return stok Item yang ada 
     */
    public int getStock()
    {
        return stock;
    }
    
    /**
     * Method getPrice ini bertujuan untuk mendapatkan harga dari 
     * item
     * 
     * @return harga dari Item 
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Method getCategory ini bertujuan untuk mendapatkan nama kategori dari 
     * item
     * 
     * @return nama kategori dari Item 
     */
    public String getCategory()
    {
        return category;
    }
    
    /**
     * Method getSupplier ini bertujuan untuk mendapatkan nama supplier dari 
     * item
     * 
     * @return nama supplier dari Item
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    /**
     * Method setId ini bertujuan untuk memasukan/mengatur id dari item
     * 
     * @param  id paramerter id dari item yang akan di set 
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Method setName ini bertujuan untuk memasukan/mengatur nama dari item
     * 
     * @param  name paramerter nama dari item yang akan di set 
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * Method setStock ini bertujuan untuk memasukan/mengatur stok dari item
     * 
     * @param  stock paramerter stok dari item yang akan di set 
     */
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    
    /**
     * Method setPrice ini bertujuan untuk memasukan/mengatur harga item
     * 
     * @param  price paramerter harga dari item yang akan di set 
     */
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    /**
     * Method setCategory ini bertujuan untuk memasukan/mengatur kategori   
     * item
     * @param  category paramerter kaategori dari item yang akan di set 
     */
    public void setCategory(String category)
    {
        this.category=category;
    }
    
    
    /**
     * Method setSupplier ini bertujuan untuk memasukan/mengatur supplier   
     * item
     * @param  supplier paramerter supplier dari item yang akan di set 
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    } 
    
    /**
     * Method printData ini bertujuan untuk mengeprint data
     */
    public void printData()
    {
        
    }
    
}
    
