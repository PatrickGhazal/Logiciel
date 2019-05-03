/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 99 "../../../../logPersistence.ump"
// line 62 "../../../../logHelperClasses.ump"
public class EntryMark implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EntryMark Attributes
  private String sellerName;
  private int weekNum;
  private int returned;
  private int sold;
  private double cashReceived;
  private int distributed;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EntryMark(String aSellerName, int aWeekNum, int aReturned, int aSold, double aCashReceived, int aDistributed)
  {
    sellerName = aSellerName;
    weekNum = aWeekNum;
    returned = aReturned;
    sold = aSold;
    cashReceived = aCashReceived;
    distributed = aDistributed;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSellerName(String aSellerName)
  {
    boolean wasSet = false;
    sellerName = aSellerName;
    wasSet = true;
    return wasSet;
  }

  public boolean setWeekNum(int aWeekNum)
  {
    boolean wasSet = false;
    weekNum = aWeekNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setReturned(int aReturned)
  {
    boolean wasSet = false;
    returned = aReturned;
    wasSet = true;
    return wasSet;
  }

  public boolean setSold(int aSold)
  {
    boolean wasSet = false;
    sold = aSold;
    wasSet = true;
    return wasSet;
  }

  public boolean setCashReceived(double aCashReceived)
  {
    boolean wasSet = false;
    cashReceived = aCashReceived;
    wasSet = true;
    return wasSet;
  }

  public boolean setDistributed(int aDistributed)
  {
    boolean wasSet = false;
    distributed = aDistributed;
    wasSet = true;
    return wasSet;
  }

  public String getSellerName()
  {
    return sellerName;
  }

  public int getWeekNum()
  {
    return weekNum;
  }

  public int getReturned()
  {
    return returned;
  }

  public int getSold()
  {
    return sold;
  }

  public double getCashReceived()
  {
    return cashReceived;
  }

  public int getDistributed()
  {
    return distributed;
  }

  public void delete()
  {}

  // line 72 "../../../../logHelperClasses.ump"
   public  EntryMark(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "sellerName" + ":" + getSellerName()+ "," +
            "weekNum" + ":" + getWeekNum()+ "," +
            "returned" + ":" + getReturned()+ "," +
            "sold" + ":" + getSold()+ "," +
            "cashReceived" + ":" + getCashReceived()+ "," +
            "distributed" + ":" + getDistributed()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 102 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 3832755202808620552L ;

  
}