package jstore;

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

    @Override
    public String toString(){
        return this.categoryItem;
    }
}
