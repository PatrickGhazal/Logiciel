/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 69 "../../../../logPersistence.ump"
// line 1 "../../../../logHelperClasses.ump"
public class MyDate implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MyDate Attributes
  private int day;
  private int month;
  private int year;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MyDate(int aDay, int aMonth, int aYear)
  {
    day = aDay;
    month = aMonth;
    year = aYear;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDay(int aDay)
  {
    boolean wasSet = false;
    day = aDay;
    wasSet = true;
    return wasSet;
  }

  public boolean setMonth(int aMonth)
  {
    boolean wasSet = false;
    month = aMonth;
    wasSet = true;
    return wasSet;
  }

  public boolean setYear(int aYear)
  {
    boolean wasSet = false;
    year = aYear;
    wasSet = true;
    return wasSet;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public void delete()
  {}

  // line 7 "../../../../logHelperClasses.ump"
   public String toString(){
    return "" + day + "/" + month + "/" + year;
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 72 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 561739762426758117L ;

  
}