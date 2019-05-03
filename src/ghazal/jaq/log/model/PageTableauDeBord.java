/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 63 "../../../../logPersistence.ump"
// line 104 "../../../../log.ump"
public class PageTableauDeBord extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageTableauDeBord Attributes
  private int meetupNum;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageTableauDeBord()
  {
    super();
    meetupNum = 1;
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

  public int getMeetupNum()
  {
    return meetupNum;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "meetupNum" + ":" + getMeetupNum()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 66 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 8889407707014818719L ;

  
}