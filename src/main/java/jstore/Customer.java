package jstore;

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
    private int id = DatabaseCustomer.getLastCustomerId() + 1;
    private Calendar birthDate;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyy");

    public Customer(String name, String email, String username, String password, Calendar birthDate) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
    }

    public Customer(String name, String email, String username, String password, int year, int month, int dayOfMonth) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = this.id;
        this.birthDate = new GregorianCalendar(year,month - 1, dayOfMonth);
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

    public Calendar getBirthDate() {
        SimpleDateFormat var10001 = this.dateFormat;
        System.out.println("Birth date: " + var10001.format(this.birthDate.getTime()));
        return this.birthDate;
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
            this.email = "test";
        }
    }
    
    public void setUsername(String username)
    {
        this.username=username;
    }
    
    public void setPassword(String password)
    {
        String passRegex = "/^.{6,}$/"+ "[a-zA-z0-9_+&*-]+@";
        Pattern pat = Pattern.compile(passRegex);
        Matcher matcher = pat.matcher(password);
        if (matcher.matches())
        {
            this.password = password;
        }
        else 
        {
            this.password = "test";
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

    public void setBirthdate(int year, int month, int dayOfMonth) {
        this.birthDate = new GregorianCalendar(year, month - 1, dayOfMonth);
    }
    
    public  String toString()
    {
        return  "===========CUSTOMER===========" + "\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Username: " + username + "\n" +
                "Password: " + password + "\n" +
                "ID: " + id + "\n" +
                "Birth date: "
                + birthDate+ "\n";
    }
}

