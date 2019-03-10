/**
 * Kelas Location ini bertujuan untuk menyimpan lokasi dari Item yang ada
 * provinsi, deskripsi, dan kota
 * 
 * @author Muhamad Fahriza Novriansyah
 * @version 1.0
 */
public class Location
{
  
    private String province;
    private String description;
    private String city;
    
    /**
     * Membuat Lokasi.
     * @param province      provinsi dari lokasi yang akan dibuat
     * @param description   deksripsi lokasi yang akan dibuat
     * @param city          kota dari lokasi dari item yang akan dibuat
     */
    public Location(String province, String description, String city)
    {
        this.province=province;
        this.description=description;
        this.city=city;
    }

    /**
     * Method getProvince ini bertujuan untuk mendapatkan nama provinsi
     * 
     * @return nama provinsi 
     */
    public String getProvince()
    {
        return province;
    }
    
    /**
     * Method getCity ini bertujuan untuk mendapatkan nama kota
     * 
     * @return nama kota 
     */
    public String getCity()
    {
        return city;
    }
   
    /**
     * Method getDescription ini bertujuan untuk mendapatkan Deskripsi lokasi
     * 
     * @return deskripsi dari lokasi yang ada 
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Method setProvince ini bertujuan untuk memasukan/mengatur provinsi  
     * 
     * @param   province    paramerter provinsi dari lokasi yang akan di set 
     */
    public void setProvince(String province)
    {
        this.province=province;
    }
    
    /**
     * Method setCity ini bertujuan untuk memasukan/mengatur kota  
     * 
     * @param   city    paramerter kota dari lokasi yang akan di set 
     */
    public void setCity(String city)
    {
        this.city=city;
    }
    
    /**
     * Method setDescription ini bertujuan untuk memasukan/mengatur deskripsi   
     * lokasi
     * @param   description     paramerter deskripsi dari lokasi yang akan di set 
     */
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    /**
     * Method printData ini bertujuan untuk mengeprint data
     */
    public void printData()
    {
        
    }

}
