
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private String username;
    private String password;
    private int id;
    private Calendar birthDate;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String email, String username, String password, int id, Calendar birthday)
    {
       //Customer cust1 = new Customer("Fahriza","mfnovriansyah@gmail.com","fahriza","Password",1, new GregorianCalendar(2018,11,11));
       
       this.name=name;        
       this.email=email;
       this.username=username;        
       this.password=password;
       this.id=id;        
       this.birthDate=birthDate;
      
    }
  
    public Customer(String name, String email, String username, String password, int id, int year, int month, int dayOfMonth)
    {
       this.name=name;        
       this.email=email;
       this.username=username;        
       this.password=password;
       this.id=id; 
       Calendar birthDate = new GregorianCalendar(year,month, dayOfMonth); 
      
    }

    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getId()
    {
        return id;
    }
    
    public Calendar getBirthDate()
    {
        SimpleDateFormat format = new SimpleDateFormat ("dd-MM-yyyy");
        String formatted = ("Birth Date: " + format.format(this.birthDate));
        System.out.println(formatted);
        //System.out.printf("%1$s %2$td %2$tB %2$tY", "Birth Date: ", birthDate);
        return birthDate;
    }
    
  
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setEmail(String email)
    {
        String emailRegex = "^[a-zA-z0-9_+&*-]+(?:\\."+
                            "[a-zA-z0-9_+&*-]+)*@" +
                            "(?:[a-zA-z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        Matcher matcher = pat.matcher(email);
        if (matcher.matches())
        {
            this.email = email;
        }
        else 
        {
            this.email = null;
        }
    }
    
    public void setUsername(String username)
    {
        this.username=username;
    }
    
    public void setPassword(String password)
    {
        String passRegex = "/^.{6,}$/"+
                            "[a-zA-z0-9_+&*-]+)*@";
        Pattern pat = Pattern.compile(passRegex);
        Matcher matcher = pat.matcher(password);
        if (matcher.matches())
        {
            this.password = password;
        }
        else 
        {
            this.password = null;
        }
    }
    
    public void setid(int id)
    {
        this.id=id;
    }
    
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate=birthDate;
    }
    
    public void setBirthDate(int year, int month, int dayOfMonth )
    {
        Calendar birthDate = new GregorianCalendar (year, month, dayOfMonth);
    }
    
    public  String toString()
    {
        return name;
    }
}

