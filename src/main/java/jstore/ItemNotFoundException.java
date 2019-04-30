package jstore;

public class ItemNotFoundException extends Exception{
    private static int item_error;
    public ItemNotFoundException(int item_input){
        super();
        this.item_error= item_input;
    }
    public  String getExMessage()
    {
        return super.getMessage() + item_error + " not found.";
    }
}
