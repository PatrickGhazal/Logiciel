/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 33 "../../../../logPersistence.ump"
// line 62 "../../../../log.ump"
public class PageActionnariat extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageActionnariat Attributes
  private List<Shareholder> entrepreneurs;
  private List<Shareholder> others;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageActionnariat()
  {
    super();
    entrepreneurs = new ArrayList<Shareholder>();
    others = new ArrayList<Shareholder>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean addEntrepreneur(Shareholder aEntrepreneur)
  {
    boolean wasAdded = false;
    wasAdded = entrepreneurs.add(aEntrepreneur);
    return wasAdded;
  }

  public boolean removeEntrepreneur(Shareholder aEntrepreneur)
  {
    boolean wasRemoved = false;
    wasRemoved = entrepreneurs.remove(aEntrepreneur);
    return wasRemoved;
  }

  public boolean addOther(Shareholder aOther)
  {
    boolean wasAdded = false;
    wasAdded = others.add(aOther);
    return wasAdded;
  }

  public boolean removeOther(Shareholder aOther)
  {
    boolean wasRemoved = false;
    wasRemoved = others.remove(aOther);
    return wasRemoved;
  }

  public Shareholder getEntrepreneur(int index)
  {
    Shareholder aEntrepreneur = entrepreneurs.get(index);
    return aEntrepreneur;
  }

  public Shareholder[] getEntrepreneurs()
  {
    Shareholder[] newEntrepreneurs = entrepreneurs.toArray(new Shareholder[entrepreneurs.size()]);
    return newEntrepreneurs;
  }

  public int numberOfEntrepreneurs()
  {
    int number = entrepreneurs.size();
    return number;
  }

  public boolean hasEntrepreneurs()
  {
    boolean has = entrepreneurs.size() > 0;
    return has;
  }

  public int indexOfEntrepreneur(Shareholder aEntrepreneur)
  {
    int index = entrepreneurs.indexOf(aEntrepreneur);
    return index;
  }

  public Shareholder getOther(int index)
  {
    Shareholder aOther = others.get(index);
    return aOther;
  }

  public Shareholder[] getOthers()
  {
    Shareholder[] newOthers = others.toArray(new Shareholder[others.size()]);
    return newOthers;
  }

  public int numberOfOthers()
  {
    int number = others.size();
    return number;
  }

  public boolean hasOthers()
  {
    boolean has = others.size() > 0;
    return has;
  }

  public int indexOfOther(Shareholder aOther)
  {
    int index = others.indexOf(aOther);
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
  
  // line 36 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 6652539346702716200L ;

  
}