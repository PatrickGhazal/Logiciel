/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 105 "../../../../logPersistence.ump"
// line 75 "../../../../logHelperClasses.ump"
public class EntryFinSale implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EntryFinSale Attributes
  private int meetupNum;
  private double saleRevenue;
  private double saleTax;
  private String description;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EntryFinSale(int aMeetupNum, double aSaleRevenue, double aSaleTax, String aDescription)
  {
    meetupNum = aMeetupNum;
    saleRevenue = aSaleRevenue;
    saleTax = aSaleTax;
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

  public boolean setSaleRevenue(double aSaleRevenue)
  {
    boolean wasSet = false;
    saleRevenue = aSaleRevenue;
    wasSet = true;
    return wasSet;
  }

  public boolean setSaleTax(double aSaleTax)
  {
    boolean wasSet = false;
    saleTax = aSaleTax;
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

  public double getSaleRevenue()
  {
    return saleRevenue;
  }

  public double getSaleTax()
  {
    return saleTax;
  }

  public String getDescription()
  {
    return description;
  }

  public void delete()
  {}

  // line 83 "../../../../logHelperClasses.ump"
   public  EntryFinSale(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "meetupNum" + ":" + getMeetupNum()+ "," +
            "saleRevenue" + ":" + getSaleRevenue()+ "," +
            "saleTax" + ":" + getSaleTax()+ "," +
            "description" + ":" + getDescription()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 108 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 7336179762384889373L ;

  
}