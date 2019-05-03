/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 111 "../../../../logPersistence.ump"
// line 86 "../../../../logHelperClasses.ump"
public class EntryFinCharges implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EntryFinCharges Attributes
  private int meetupNum;
  private double amount;
  private double tax;
  private String account;
  private String description;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EntryFinCharges(int aMeetupNum, double aAmount, double aTax, String aAccount, String aDescription)
  {
    meetupNum = aMeetupNum;
    amount = aAmount;
    tax = aTax;
    account = aAccount;
    description = aDescription;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMeetupNum(int aMeetupNum)
  {
    boolean wasSet = false;
    meetupNum = aMeetupNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setAmount(double aAmount)
  {
    boolean wasSet = false;
    amount = aAmount;
    wasSet = true;
    return wasSet;
  }

  public boolean setTax(double aTax)
  {
    boolean wasSet = false;
    tax = aTax;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccount(String aAccount)
  {
    boolean wasSet = false;
    account = aAccount;
    wasSet = true;
    return wasSet;
  }

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public int getMeetupNum()
  {
    return meetupNum;
  }

  public double getAmount()
  {
    return amount;
  }

  public double getTax()
  {
    return tax;
  }

  public String getAccount()
  {
    return account;
  }

  public String getDescription()
  {
    return description;
  }

  public void delete()
  {}

  // line 95 "../../../../logHelperClasses.ump"
   public  EntryFinCharges(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "meetupNum" + ":" + getMeetupNum()+ "," +
            "amount" + ":" + getAmount()+ "," +
            "tax" + ":" + getTax()+ "," +
            "account" + ":" + getAccount()+ "," +
            "description" + ":" + getDescription()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 114 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 8495257076598014877L ;

  
}