/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 39 "../../../../logPersistence.ump"
// line 71 "../../../../log.ump"
public class PageRessHumaines extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageRessHumaines Attributes
  private List<Attendance> attendanceData;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageRessHumaines()
  {
    super();
    attendanceData = new ArrayList<Attendance>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean addAttendanceData(Attendance aAttendanceData)
  {
    boolean wasAdded = false;
    wasAdded = attendanceData.add(aAttendanceData);
    return wasAdded;
  }

  public boolean removeAttendanceData(Attendance aAttendanceData)
  {
    boolean wasRemoved = false;
    wasRemoved = attendanceData.remove(aAttendanceData);
    return wasRemoved;
  }

  public Attendance getAttendanceData(int index)
  {
    Attendance aAttendanceData = attendanceData.get(index);
    return aAttendanceData;
  }

  public Attendance[] getAttendanceData()
  {
    Attendance[] newAttendanceData = attendanceData.toArray(new Attendance[attendanceData.size()]);
    return newAttendanceData;
  }

  public int numberOfAttendanceData()
  {
    int number = attendanceData.size();
    return number;
  }

  public boolean hasAttendanceData()
  {
    boolean has = attendanceData.size() > 0;
    return has;
  }

  public int indexOfAttendanceData(Attendance aAttendanceData)
  {
    int index = attendanceData.indexOf(aAttendanceData);
    return index;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 42 "../../../../logPersistence.ump"
  private static final long serialVersionUID = -2399829317633027947L ;

  
}