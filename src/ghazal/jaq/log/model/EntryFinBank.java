/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 117 "../../../../logPersistence.ump"
// line 98 "../../../../logHelperClasses.ump"
public class EntryFinBank implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EntryFinBank Attributes
  private int meetupNum;
  private double amount;
  private boolean deposit;
  private int chequeNum;
  private String description;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EntryFinBank(int aMeetupNum, double aAmount, boolean aDeposit, int aChequeNum, String aDescription)
  {
    meetupNum = aMeetupNum;
    amount = aAmount;
    deposit = aDeposit;
    chequeNum = aChequeNum;
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

  public boolean setDeposit(boolean aDeposit)
  {
    boolean wasSet = false;
    deposit = aDeposit;
    wasSet = true;
    return wasSet;
  }

  public boolean setChequeNum(int aChequeNum)
  {
    boolean wasSet = false;
    chequeNum = aChequeNum;
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

  public boolean getDeposit()
  {
    return deposit;
  }

  public int getChequeNum()
  {
    return chequeNum;
  }

  public String getDescription()
  {
    return description;
  }

  public void delete()
  {}

  // line 107 "../../../../logHelperClasses.ump"
   public  EntryFinBank(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "meetupNum" + ":" + getMeetupNum()+ "," +
            "amount" + ":" + getAmount()+ "," +
            "deposit" + ":" + getDeposit()+ "," +
            "chequeNum" + ":" + getChequeNum()+ "," +
            "description" + ":" + getDescription()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 120 "../../../../logPersistence.ump"
  private static final long serialVersionUID = -5160891461626403586L ;

  
}