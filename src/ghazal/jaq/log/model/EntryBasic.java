/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;

// line 11 "../../../../logHelperClasses.ump"
public class EntryBasic
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //EntryBasic Attributes
  private int entryNum;
  private String name;
  private String value;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public EntryBasic(int aEntryNum, String aName, String aValue)
  {
    entryNum = aEntryNum;
    name = aName;
    value = aValue;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setEntryNum(int aEntryNum)
  {
    boolean wasSet = false;
    entryNum = aEntryNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setValue(String aValue)
  {
    boolean wasSet = false;
    value = aValue;
    wasSet = true;
    return wasSet;
  }

  public int getEntryNum()
  {
    return entryNum;
  }

  public String getName()
  {
    return name;
  }

  public String getValue()
  {
    return value;
  }

  public void delete()
  {}

  // line 17 "../../../../logHelperClasses.ump"
   public  EntryBasic(){
    
  }

  // line 20 "../../../../logHelperClasses.ump"
   public String toString(){
    return name + "     " + value;
  }

}