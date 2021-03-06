/********************************************************************
 * Programmer:  sveinson
 * Class:  CS30S
 *
 * Assignment: Inheritance example
 *
 * Description: practitionaer super class
 ***********************************************************************/

// import libraries as needed here
import java.text.NumberFormat;

public class Practitioner {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    protected String firstName;
    protected String lastName;
    protected double salary = 89000.3567;
    
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    //*** Constructors ***
    
    public Practitioner(){
        firstName = "unknown";
        lastName = "unknown";
    }// end no-arg counstructor
    
    public Practitioner(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }// end full arg constructor
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    public String getFirstName(){
        return firstName;
    }// end get first name
    
    public String getLastName(){
        return lastName;
    }// end get last name
   
    //*** Setters ***
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    } // end set name
    
    public void setLastName(String ln){
        lastName = ln;
    }// end set last name
    
    // other methods 
    @Override
    public String toString(){
        return "Name: " + getName() + " Salary: " + currency.format(salary);
    }// end toSTring
    
    public String getName(){
        String st;
        
        st = firstName + ", " + lastName;
        return st;
    }// end getName
} // end of public class
