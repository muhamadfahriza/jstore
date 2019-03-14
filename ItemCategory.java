
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author Muhamad Fahriza Novriansyah
 * @version 14-03-2019
 */
public enum ItemCategory
{
    ELECTRONICS ("Electronics"),
    FURNITURE("Furniture"),
    STATIONERY("Stationery");
    
    private String categoryItem;
    
    ItemCategory(String categoryItem) {
        this.categoryItem = categoryItem;
    }
    
    public String categoryItem() {
        return categoryItem;
    }
    
    public static void main(String[] args) {

        for (ItemCategory categoryItem : ItemCategory.values()) {
            System.out.println(categoryItem.toString());
        }

    }
  
    
    
}
