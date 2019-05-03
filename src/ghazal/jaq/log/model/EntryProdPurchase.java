/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 93 "../../../../logPersistence.ump"
// line 46 "../../../../logHelperClasses.ump"
public class EntryProdPurchase implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EntryProdPurchase Attributes
  private int receiptNum;
  private int meetupNum;
  private MyDate date;
  private String description;
  private String provider;
  private int unitPrice;
  private int quantity;
  private double tps;
  private double tvq;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EntryProdPurchase(int aReceiptNum, int aMeetupNum, MyDate aDate, String aDescription, String aProvider, int aUnitPrice, int aQuantity, double aTps, double aTvq)
  {
    receiptNum = aReceiptNum;
    meetupNum = aMeetupNum;
    date = aDate;
    description = aDescription;
    provider = aProvider;
    unitPrice = aUnitPrice;
    quantity = aQuantity;
    tps = aTps;
    tvq = aTvq;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setReceiptNum(int aReceiptNum)
  {
    boolean wasSet = false;
    receiptNum = aReceiptNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setMeetupNum(int aMeetupNum)
  {
    boolean wasSet = false;
    meetupNum = aMeetupNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setDate(MyDate aDate)
  {
    boolean wasSet = false;
    date = aDate;
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

  public boolean setProvider(String aProvider)
  {
    boolean wasSet = false;
    provider = aProvider;
    wasSet = true;
    return wasSet;
  }

  public boolean setUnitPrice(int aUnitPrice)
  {
    boolean wasSet = false;
    unitPrice = aUnitPrice;
    wasSet = true;
    return wasSet;
  }

  public boolean setQuantity(int aQuantity)
  {
    boolean wasSet = false;
    quantity = aQuantity;
    wasSet = true;
    return wasSet;
  }

  public boolean setTps(double aTps)
  {
    boolean wasSet = false;
    tps = aTps;
    wasSet = true;
    return wasSet;
  }

  public boolean setTvq(double aTvq)
  {
    boolean wasSet = false;
    tvq = aTvq;
    wasSet = true;
    return wasSet;
  }

  public int getReceiptNum()
  {
    return receiptNum;
  }

  public int getMeetupNum()
  {
    return meetupNum;
  }

  public MyDate getDate()
  {
    return date;
  }

  public String getDescription()
  {
    return description;
  }

  public String getProvider()
  {
    return provider;
  }

  public int getUnitPrice()
  {
    return unitPrice;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public double getTps()
  {
    return tps;
  }

  public double getTvq()
  {
    return tvq;
  }

  public void delete()
  {}

  // line 59 "../../../../logHelperClasses.ump"
   public  EntryProdPurchase(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "receiptNum" + ":" + getReceiptNum()+ "," +
            "meetupNum" + ":" + getMeetupNum()+ "," +
            "description" + ":" + getDescription()+ "," +
            "provider" + ":" + getProvider()+ "," +
            "unitPrice" + ":" + getUnitPrice()+ "," +
            "quantity" + ":" + getQuantity()+ "," +
            "tps" + ":" + getTps()+ "," +
            "tvq" + ":" + getTvq()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 96 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 1020724654357632792L ;

  
}