/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 21 "../../../../logPersistence.ump"
// line 43 "../../../../log.ump"
public class PageSeuil extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageSeuil Attributes
  private List<EntryBasic> fixedCosts;
  private List<EntryBasic> varCosts;
  private int salePrice;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageSeuil()
  {
    super();
    fixedCosts = new ArrayList<EntryBasic>();
    varCosts = new ArrayList<EntryBasic>();
    salePrice = 0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean addFixedCost(EntryBasic aFixedCost)
  {
    boolean wasAdded = false;
    wasAdded = fixedCosts.add(aFixedCost);
    return wasAdded;
  }

  public boolean removeFixedCost(EntryBasic aFixedCost)
  {
    boolean wasRemoved = false;
    wasRemoved = fixedCosts.remove(aFixedCost);
    return wasRemoved;
  }

  public boolean addVarCost(EntryBasic aVarCost)
  {
    boolean wasAdded = false;
    wasAdded = varCosts.add(aVarCost);
    return wasAdded;
  }

  public boolean removeVarCost(EntryBasic aVarCost)
  {
    boolean wasRemoved = false;
    wasRemoved = varCosts.remove(aVarCost);
    return wasRemoved;
  }

  public boolean setSalePrice(int aSalePrice)
  {
    boolean wasSet = false;
    salePrice = aSalePrice;
    wasSet = true;
    return wasSet;
  }

  public EntryBasic getFixedCost(int index)
  {
    EntryBasic aFixedCost = fixedCosts.get(index);
    return aFixedCost;
  }

  public EntryBasic[] getFixedCosts()
  {
    EntryBasic[] newFixedCosts = fixedCosts.toArray(new EntryBasic[fixedCosts.size()]);
    return newFixedCosts;
  }

  public int numberOfFixedCosts()
  {
    int number = fixedCosts.size();
    return number;
  }

  public boolean hasFixedCosts()
  {
    boolean has = fixedCosts.size() > 0;
    return has;
  }

  public int indexOfFixedCost(EntryBasic aFixedCost)
  {
    int index = fixedCosts.indexOf(aFixedCost);
    return index;
  }

  public EntryBasic getVarCost(int index)
  {
    EntryBasic aVarCost = varCosts.get(index);
    return aVarCost;
  }

  public EntryBasic[] getVarCosts()
  {
    EntryBasic[] newVarCosts = varCosts.toArray(new EntryBasic[varCosts.size()]);
    return newVarCosts;
  }

  public int numberOfVarCosts()
  {
    int number = varCosts.size();
    return number;
  }

  public boolean hasVarCosts()
  {
    boolean has = varCosts.size() > 0;
    return has;
  }

  public int indexOfVarCost(EntryBasic aVarCost)
  {
    int index = varCosts.indexOf(aVarCost);
    return index;
  }

  public int getSalePrice()
  {
    return salePrice;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "salePrice" + ":" + getSalePrice()+ "]";
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 24 "../../../../logPersistence.ump"
  private static final long serialVersionUID = -6788787388902422853L ;

  
}