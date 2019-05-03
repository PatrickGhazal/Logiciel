/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 87 "../../../../logPersistence.ump"
// line 41 "../../../../logHelperClasses.ump"
public class Attendance implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Attendance Attributes
  private String name;
  private List<Integer> attData;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Attendance(String aName)
  {
    name = aName;
    attData = new ArrayList<Integer>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean addAttData(Integer aAttData)
  {
    boolean wasAdded = false;
    wasAdded = attData.add(aAttData);
    return wasAdded;
  }

  public boolean removeAttData(Integer aAttData)
  {
    boolean wasRemoved = false;
    wasRemoved = attData.remove(aAttData);
    return wasRemoved;
  }

  public String getName()
  {
    return name;
  }

  public Integer getAttData(int index)
  {
    Integer aAttData = attData.get(index);
    return aAttData;
  }

  public Integer[] getAttData()
  {
    Integer[] newAttData = attData.toArray(new Integer[attData.size()]);
    return newAttData;
  }

  public int numberOfAttData()
  {
    int number = attData.size();
    return number;
  }

  public boolean hasAttData()
  {
    boolean has = attData.size() > 0;
    return has;
  }

  public int indexOfAttData(Integer aAttData)
  {
    int index = attData.indexOf(aAttData);
    return index;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 90 "../../../../logPersistence.ump"
  private static final long serialVersionUID = -5263623779580794373L ;

  
}