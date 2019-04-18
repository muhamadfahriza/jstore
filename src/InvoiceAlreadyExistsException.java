public class InvoiceAlreadyExistsException extends Exception{
    private static Invoice invoice_error;
    public InvoiceAlreadyExistsException(Invoice invoice_input){
        super();
        this.invoice_error= invoice_input;
    }
    public  String getExMessage()
    {
        return super.getMessage() + invoice_error.getItem() + " already ordered by " +
                invoice_error.getCustomer().getUsername();

    }
}
