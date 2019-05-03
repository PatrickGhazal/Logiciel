/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 27 "../../../../logPersistence.ump"
// line 52 "../../../../log.ump"
public class PageObjectifs extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageObjectifs Attributes
  private List<Integer> objAttendance;
  private List<Integer> objProd;
  private List<Integer> objSales;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageObjectifs()
  {
    super();
    objAttendance = new ArrayList<Integer>();
    objProd = new ArrayList<Integer>();
    objSales = new ArrayList<Integer>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean addObjAttendance(Integer aObjAttendance)
  {
    boolean wasAdded = false;
    wasAdded = objAttendance.add(aObjAttendance);
    return wasAdded;
  }

  public boolean removeObjAttendance(Integer aObjAttendance)
  {
    boolean wasRemoved = false;
    wasRemoved = objAttendance.remove(aObjAttendance);
    return wasRemoved;
  }

  public boolean addObjProd(Integer aObjProd)
  {
    boolean wasAdded = false;
    wasAdded = objProd.add(aObjProd);
    return wasAdded;
  }

  public boolean removeObjProd(Integer aObjProd)
  {
    boolean wasRemoved = false;
    wasRemoved = objProd.remove(aObjProd);
    return wasRemoved;
  }

  public boolean addObjSale(Integer aObjSale)
  {
    boolean wasAdded = false;
    wasAdded = objSales.add(aObjSale);
    return wasAdded;
  }

  public boolean removeObjSale(Integer aObjSale)
  {
    boolean wasRemoved = false;
    wasRemoved = objSales.remove(aObjSale);
    return wasRemoved;
  }

  public Integer getObjAttendance(int index)
  {
    Integer aObjAttendance = objAttendance.get(index);
    return aObjAttendance;
  }

  public Integer[] getObjAttendance()
  {
    Integer[] newObjAttendance = objAttendance.toArray(new Integer[objAttendance.size()]);
    return newObjAttendance;
  }

  public int numberOfObjAttendance()
  {
    int number = objAttendance.size();
    return number;
  }

  public boolean hasObjAttendance()
  {
    boolean has = objAttendance.size() > 0;
    return has;
  }

  public int indexOfObjAttendance(Integer aObjAttendance)
  {
    int index = objAttendance.indexOf(aObjAttendance);
    return index;
  }

  public Integer getObjProd(int index)
  {
    Integer aObjProd = objProd.get(index);
    return aObjProd;
  }

  public Integer[] getObjProd()
  {
    Integer[] newObjProd = objProd.toArray(new Integer[objProd.size()]);
    return newObjProd;
  }

  public int numberOfObjProd()
  {
    int number = objProd.size();
    return number;
  }

  public boolean hasObjProd()
  {
    boolean has = objProd.size() > 0;
    return has;
  }

  public int indexOfObjProd(Integer aObjProd)
  {
    int index = objProd.indexOf(aObjProd);
    return index;
  }

  public Integer getObjSale(int index)
  {
    Integer aObjSale = objSales.get(index);
    return aObjSale;
  }

  public Integer[] getObjSales()
  {
    Integer[] newObjSales = objSales.toArray(new Integer[objSales.size()]);
    return newObjSales;
  }

  public int numberOfObjSales()
  {
    int number = objSales.size();
    return number;
  }

  public boolean hasObjSales()
  {
    boolean has = objSales.size() > 0;
    return has;
  }

  public int indexOfObjSale(Integer aObjSale)
  {
    int index = objSales.indexOf(aObjSale);
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
  
  // line 30 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 3152786299147224670L ;

  
}