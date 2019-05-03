/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 45 "../../../../logPersistence.ump"
// line 79 "../../../../log.ump"
public class PageProduction extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageProduction Attributes
  private List<Integer> prodData;

  //PageProduction Associations
  private List<EntryProdPurchase> prodPurEntries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageProduction()
  {
    super();
    prodData = new ArrayList<Integer>();
    prodPurEntries = new ArrayList<EntryProdPurchase>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean addProdData(Integer aProdData)
  {
    boolean wasAdded = false;
    wasAdded = prodData.add(aProdData);
    return wasAdded;
  }

  public boolean removeProdData(Integer aProdData)
  {
    boolean wasRemoved = false;
    wasRemoved = prodData.remove(aProdData);
    return wasRemoved;
  }

  public Integer getProdData(int index)
  {
    Integer aProdData = prodData.get(index);
    return aProdData;
  }

  public Integer[] getProdData()
  {
    Integer[] newProdData = prodData.toArray(new Integer[prodData.size()]);
    return newProdData;
  }

  public int numberOfProdData()
  {
    int number = prodData.size();
    return number;
  }

  public boolean hasProdData()
  {
    boolean has = prodData.size() > 0;
    return has;
  }

  public int indexOfProdData(Integer aProdData)
  {
    int index = prodData.indexOf(aProdData);
    return index;
  }

  public EntryProdPurchase getProdPurEntry(int index)
  {
    EntryProdPurchase aProdPurEntry = prodPurEntries.get(index);
    return aProdPurEntry;
  }

  public List<EntryProdPurchase> getProdPurEntries()
  {
    List<EntryProdPurchase> newProdPurEntries = Collections.unmodifiableList(prodPurEntries);
    return newProdPurEntries;
  }

  public int numberOfProdPurEntries()
  {
    int number = prodPurEntries.size();
    return number;
  }

  public boolean hasProdPurEntries()
  {
    boolean has = prodPurEntries.size() > 0;
    return has;
  }

  public int indexOfProdPurEntry(EntryProdPurchase aProdPurEntry)
  {
    int index = prodPurEntries.indexOf(aProdPurEntry);
    return index;
  }

  public static int minimumNumberOfProdPurEntries()
  {
    return 0;
  }

  public boolean addProdPurEntry(EntryProdPurchase aProdPurEntry)
  {
    boolean wasAdded = false;
    if (prodPurEntries.contains(aProdPurEntry)) { return false; }
    prodPurEntries.add(aProdPurEntry);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeProdPurEntry(EntryProdPurchase aProdPurEntry)
  {
    boolean wasRemoved = false;
    if (prodPurEntries.contains(aProdPurEntry))
    {
      prodPurEntries.remove(aProdPurEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addProdPurEntryAt(EntryProdPurchase aProdPurEntry, int index)
  {  
    boolean wasAdded = false;
    if(addProdPurEntry(aProdPurEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfProdPurEntries()) { index = numberOfProdPurEntries() - 1; }
      prodPurEntries.remove(aProdPurEntry);
      prodPurEntries.add(index, aProdPurEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveProdPurEntryAt(EntryProdPurchase aProdPurEntry, int index)
  {
    boolean wasAdded = false;
    if(prodPurEntries.contains(aProdPurEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfProdPurEntries()) { index = numberOfProdPurEntries() - 1; }
      prodPurEntries.remove(aProdPurEntry);
      prodPurEntries.add(index, aProdPurEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addProdPurEntryAt(aProdPurEntry, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    prodPurEntries.clear();
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 48 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 4876707435067970648L ;

  
}