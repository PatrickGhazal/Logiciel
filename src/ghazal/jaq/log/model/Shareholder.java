/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 81 "../../../../logPersistence.ump"
// line 24 "../../../../logHelperClasses.ump"
public class Shareholder implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Shareholder Attributes
  private int shareNum;
  private String lastName;
  private String firstName;
  private String address;
  private String city;
  private String postalCode;
  private String homePhone;
  private String cellPhone;
  private String email;
  private MyDate dob;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Shareholder(int aShareNum, String aLastName, String aFirstName, String aAddress, String aCity, String aPostalCode, String aHomePhone, String aCellPhone, String aEmail, MyDate aDob)
  {
    shareNum = aShareNum;
    lastName = aLastName;
    firstName = aFirstName;
    address = aAddress;
    city = aCity;
    postalCode = aPostalCode;
    homePhone = aHomePhone;
    cellPhone = aCellPhone;
    email = aEmail;
    dob = aDob;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setShareNum(int aShareNum)
  {
    boolean wasSet = false;
    shareNum = aShareNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setLastName(String aLastName)
  {
    boolean wasSet = false;
    lastName = aLastName;
    wasSet = true;
    return wasSet;
  }

  public boolean setFirstName(String aFirstName)
  {
    boolean wasSet = false;
    firstName = aFirstName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setCity(String aCity)
  {
    boolean wasSet = false;
    city = aCity;
    wasSet = true;
    return wasSet;
  }

  public boolean setPostalCode(String aPostalCode)
  {
    boolean wasSet = false;
    postalCode = aPostalCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setHomePhone(String aHomePhone)
  {
    boolean wasSet = false;
    homePhone = aHomePhone;
    wasSet = true;
    return wasSet;
  }

  public boolean setCellPhone(String aCellPhone)
  {
    boolean wasSet = false;
    cellPhone = aCellPhone;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmail(String aEmail)
  {
    boolean wasSet = false;
    email = aEmail;
    wasSet = true;
    return wasSet;
  }

  public boolean setDob(MyDate aDob)
  {
    boolean wasSet = false;
    dob = aDob;
    wasSet = true;
    return wasSet;
  }

  public int getShareNum()
  {
    return shareNum;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getAddress()
  {
    return address;
  }

  public String getCity()
  {
    return city;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public String getHomePhone()
  {
    return homePhone;
  }

  public String getCellPhone()
  {
    return cellPhone;
  }

  public String getEmail()
  {
    return email;
  }

  public MyDate getDob()
  {
    return dob;
  }

  public void delete()
  {}

  // line 38 "../../../../logHelperClasses.ump"
   public  Shareholder(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "shareNum" + ":" + getShareNum()+ "," +
            "lastName" + ":" + getLastName()+ "," +
            "firstName" + ":" + getFirstName()+ "," +
            "address" + ":" + getAddress()+ "," +
            "city" + ":" + getCity()+ "," +
            "postalCode" + ":" + getPostalCode()+ "," +
            "homePhone" + ":" + getHomePhone()+ "," +
            "cellPhone" + ":" + getCellPhone()+ "," +
            "email" + ":" + getEmail()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "dob" + "=" + (getDob() != null ? !getDob().equals(this)  ? getDob().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 84 "../../../../logPersistence.ump"
  private static final long serialVersionUID = -7190204507045093950L ;

  
}