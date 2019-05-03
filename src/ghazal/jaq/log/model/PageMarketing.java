/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 51 "../../../../logPersistence.ump"
// line 87 "../../../../log.ump"
public class PageMarketing extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageMarketing Associations
  private List<EntryMark> markEntries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageMarketing()
  {
    super();
    markEntries = new ArrayList<EntryMark>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public EntryMark getMarkEntry(int index)
  {
    EntryMark aMarkEntry = markEntries.get(index);
    return aMarkEntry;
  }

  public List<EntryMark> getMarkEntries()
  {
    List<EntryMark> newMarkEntries = Collections.unmodifiableList(markEntries);
    return newMarkEntries;
  }

  public int numberOfMarkEntries()
  {
    int number = markEntries.size();
    return number;
  }

  public boolean hasMarkEntries()
  {
    boolean has = markEntries.size() > 0;
    return has;
  }

  public int indexOfMarkEntry(EntryMark aMarkEntry)
  {
    int index = markEntries.indexOf(aMarkEntry);
    return index;
  }

  public static int minimumNumberOfMarkEntries()
  {
    return 0;
  }

  public boolean addMarkEntry(EntryMark aMarkEntry)
  {
    boolean wasAdded = false;
    if (markEntries.contains(aMarkEntry)) { return false; }
    markEntries.add(aMarkEntry);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMarkEntry(EntryMark aMarkEntry)
  {
    boolean wasRemoved = false;
    if (markEntries.contains(aMarkEntry))
    {
      markEntries.remove(aMarkEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addMarkEntryAt(EntryMark aMarkEntry, int index)
  {  
    boolean wasAdded = false;
    if(addMarkEntry(aMarkEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMarkEntries()) { index = numberOfMarkEntries() - 1; }
      markEntries.remove(aMarkEntry);
      markEntries.add(index, aMarkEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMarkEntryAt(EntryMark aMarkEntry, int index)
  {
    boolean wasAdded = false;
    if(markEntries.contains(aMarkEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMarkEntries()) { index = numberOfMarkEntries() - 1; }
      markEntries.remove(aMarkEntry);
      markEntries.add(index, aMarkEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMarkEntryAt(aMarkEntry, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    markEntries.clear();
    super.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 54 "../../../../logPersistence.ump"
  private static final long serialVersionUID = -2268860326126973302L ;

  
}