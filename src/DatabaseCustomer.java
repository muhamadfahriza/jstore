import java.util.*;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;
    private static Customer customer;
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static Customer getCustomer(int id)
    {
        for(Customer i : CUSTOMER_DATABASE)
        {
            if(i.getId() == id)
                return i;
        }

        return null;
    }

    public static int getLastCustomerId()
    {
        return LAST_CUSTOMER_ID;
    }


    public boolean addCustomer(Customer customer)
    {
        for(Customer i : CUSTOMER_DATABASE)
        {
            if(i.getName().equals(customer.getName()) &&
                    i.getEmail().equals(customer.getEmail())
            )
            {
                return false;
            }
        }

        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();

        return true;
    }
    
    public static void removeCustomer( int id)
    {
        for(Customer i : CUSTOMER_DATABASE)
        {
            if(i.getId() == id)
            {
                CUSTOMER_DATABASE.remove(i);
                return true;
            }
        }

        return false;
    }
    
    public static Customer getCustomer(int id)
    {
        for(Customer i : CUSTOMER_DATABASE)
        {
            if(i.getId() == id)
                return i;
        }

        return null;
    }
    
}
