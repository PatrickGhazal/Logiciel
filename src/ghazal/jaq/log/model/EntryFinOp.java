/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;

// line 123 "../../../../logPersistence.ump"
// line 110 "../../../../logHelperClasses.ump"
public class EntryFinOp implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EntryFinOp Attributes
  private int meetupNum;
  private String opType;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EntryFinOp(int aMeetupNum, String aOpType)
  {
    meetupNum = aMeetupNum;
    opType = aOpType;
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

  public boolean setOpType(String aOpType)
  {
    boolean wasSet = false;
    opType = aOpType;
    wasSet = true;
    return wasSet;
  }

  public int getMeetupNum()
  {
    return meetupNum;
  }

  public String getOpType()
  {
    return opType;
  }

  public void delete()
  {}

  // line 116 "../../../../logHelperClasses.ump"
   public  EntryFinOp(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "meetupNum" + ":" + getMeetupNum()+ "," +
            "opType" + ":" + getOpType()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 126 "../../../../logPersistence.ump"
  private static final long serialVersionUID = -4791530482902023054L ;

  
}