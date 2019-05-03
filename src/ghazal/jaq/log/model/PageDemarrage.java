/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 15 "../../../../logPersistence.ump"
// line 25 "../../../../log.ump"
public class PageDemarrage extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageDemarrage Attributes
  private String companyName;
  private String prod1;
  private String prod2;
  private String prod3;
  private double commRate;
  private double hrSalary;
  private MyDate firstMeet;
  private int meetups;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageDemarrage()
  {
    super();
    companyName = "";
    prod1 = "";
    prod2 = "";
    prod3 = "";
    commRate = 0;
    hrSalary = 0;
    meetups = 0;
    // line 39 "../../../../log.ump"
    firstMeet = new MyDate(0, 0, 0);
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCompanyName(String aCompanyName)
  {
    boolean wasSet = false;
    companyName = aCompanyName;
    wasSet = true;
    return wasSet;
  }

  public boolean setProd1(String aProd1)
  {
    boolean wasSet = false;
    prod1 = aProd1;
    wasSet = true;
    return wasSet;
  }

  public boolean setProd2(String aProd2)
  {
    boolean wasSet = false;
    prod2 = aProd2;
    wasSet = true;
    return wasSet;
  }

  public boolean setProd3(String aProd3)
  {
    boolean wasSet = false;
    prod3 = aProd3;
    wasSet = true;
    return wasSet;
  }

  public boolean setCommRate(double aCommRate)
  {
    boolean wasSet = false;
    commRate = aCommRate;
    wasSet = true;
    return wasSet;
  }

  public boolean setHrSalary(double aHrSalary)
  {
    boolean wasSet = false;
    hrSalary = aHrSalary;
    wasSet = true;
    return wasSet;
  }

  public boolean setFirstMeet(MyDate aFirstMeet)
  {
    boolean wasSet = false;
    firstMeet = aFirstMeet;
    wasSet = true;
    return wasSet;
  }

  public boolean setMeetups(int aMeetups)
  {
    boolean wasSet = false;
    meetups = aMeetups;
    wasSet = true;
    return wasSet;
  }

  public String getCompanyName()
  {
    return companyName;
  }

  public String getProd1()
  {
    return prod1;
  }

  public String getProd2()
  {
    return prod2;
  }

  public String getProd3()
  {
    return prod3;
  }

  public double getCommRate()
  {
    return commRate;
  }

  public double getHrSalary()
  {
    return hrSalary;
  }

  public MyDate getFirstMeet()
  {
    return firstMeet;
  }

  public int getMeetups()
  {
    return meetups;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "companyName" + ":" + getCompanyName()+ "," +
            "prod1" + ":" + getProd1()+ "," +
            "prod2" + ":" + getProd2()+ "," +
            "prod3" + ":" + getProd3()+ "," +
            "commRate" + ":" + getCommRate()+ "," +
            "hrSalary" + ":" + getHrSalary()+ "," +
            "meetups" + ":" + getMeetups()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "firstMeet" + "=" + (getFirstMeet() != null ? !getFirstMeet().equals(this)  ? getFirstMeet().toString().replaceAll("  ","    ") : "this" : "null");
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 18 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 3861723257256208552L ;

  
}