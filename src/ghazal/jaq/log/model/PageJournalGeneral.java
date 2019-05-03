/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 57 "../../../../logPersistence.ump"
// line 94 "../../../../log.ump"
public class PageJournalGeneral extends Page implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PageJournalGeneral Associations
  private List<EntryFinSale> saleEntries;
  private List<EntryFinCharges> chargesEntries;
  private List<EntryFinBank> bankEntries;
  private List<EntryFinOp> opEntries;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PageJournalGeneral()
  {
    super();
    saleEntries = new ArrayList<EntryFinSale>();
    chargesEntries = new ArrayList<EntryFinCharges>();
    bankEntries = new ArrayList<EntryFinBank>();
    opEntries = new ArrayList<EntryFinOp>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public EntryFinSale getSaleEntry(int index)
  {
    EntryFinSale aSaleEntry = saleEntries.get(index);
    return aSaleEntry;
  }

  public List<EntryFinSale> getSaleEntries()
  {
    List<EntryFinSale> newSaleEntries = Collections.unmodifiableList(saleEntries);
    return newSaleEntries;
  }

  public int numberOfSaleEntries()
  {
    int number = saleEntries.size();
    return number;
  }

  public boolean hasSaleEntries()
  {
    boolean has = saleEntries.size() > 0;
    return has;
  }

  public int indexOfSaleEntry(EntryFinSale aSaleEntry)
  {
    int index = saleEntries.indexOf(aSaleEntry);
    return index;
  }

  public EntryFinCharges getChargesEntry(int index)
  {
    EntryFinCharges aChargesEntry = chargesEntries.get(index);
    return aChargesEntry;
  }

  public List<EntryFinCharges> getChargesEntries()
  {
    List<EntryFinCharges> newChargesEntries = Collections.unmodifiableList(chargesEntries);
    return newChargesEntries;
  }

  public int numberOfChargesEntries()
  {
    int number = chargesEntries.size();
    return number;
  }

  public boolean hasChargesEntries()
  {
    boolean has = chargesEntries.size() > 0;
    return has;
  }

  public int indexOfChargesEntry(EntryFinCharges aChargesEntry)
  {
    int index = chargesEntries.indexOf(aChargesEntry);
    return index;
  }

  public EntryFinBank getBankEntry(int index)
  {
    EntryFinBank aBankEntry = bankEntries.get(index);
    return aBankEntry;
  }

  public List<EntryFinBank> getBankEntries()
  {
    List<EntryFinBank> newBankEntries = Collections.unmodifiableList(bankEntries);
    return newBankEntries;
  }

  public int numberOfBankEntries()
  {
    int number = bankEntries.size();
    return number;
  }

  public boolean hasBankEntries()
  {
    boolean has = bankEntries.size() > 0;
    return has;
  }

  public int indexOfBankEntry(EntryFinBank aBankEntry)
  {
    int index = bankEntries.indexOf(aBankEntry);
    return index;
  }

  public EntryFinOp getOpEntry(int index)
  {
    EntryFinOp aOpEntry = opEntries.get(index);
    return aOpEntry;
  }

  public List<EntryFinOp> getOpEntries()
  {
    List<EntryFinOp> newOpEntries = Collections.unmodifiableList(opEntries);
    return newOpEntries;
  }

  public int numberOfOpEntries()
  {
    int number = opEntries.size();
    return number;
  }

  public boolean hasOpEntries()
  {
    boolean has = opEntries.size() > 0;
    return has;
  }

  public int indexOfOpEntry(EntryFinOp aOpEntry)
  {
    int index = opEntries.indexOf(aOpEntry);
    return index;
  }

  public static int minimumNumberOfSaleEntries()
  {
    return 0;
  }

  public boolean addSaleEntry(EntryFinSale aSaleEntry)
  {
    boolean wasAdded = false;
    if (saleEntries.contains(aSaleEntry)) { return false; }
    saleEntries.add(aSaleEntry);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeSaleEntry(EntryFinSale aSaleEntry)
  {
    boolean wasRemoved = false;
    if (saleEntries.contains(aSaleEntry))
    {
      saleEntries.remove(aSaleEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addSaleEntryAt(EntryFinSale aSaleEntry, int index)
  {  
    boolean wasAdded = false;
    if(addSaleEntry(aSaleEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSaleEntries()) { index = numberOfSaleEntries() - 1; }
      saleEntries.remove(aSaleEntry);
      saleEntries.add(index, aSaleEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSaleEntryAt(EntryFinSale aSaleEntry, int index)
  {
    boolean wasAdded = false;
    if(saleEntries.contains(aSaleEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSaleEntries()) { index = numberOfSaleEntries() - 1; }
      saleEntries.remove(aSaleEntry);
      saleEntries.add(index, aSaleEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSaleEntryAt(aSaleEntry, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfChargesEntries()
  {
    return 0;
  }

  public boolean addChargesEntry(EntryFinCharges aChargesEntry)
  {
    boolean wasAdded = false;
    if (chargesEntries.contains(aChargesEntry)) { return false; }
    chargesEntries.add(aChargesEntry);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeChargesEntry(EntryFinCharges aChargesEntry)
  {
    boolean wasRemoved = false;
    if (chargesEntries.contains(aChargesEntry))
    {
      chargesEntries.remove(aChargesEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addChargesEntryAt(EntryFinCharges aChargesEntry, int index)
  {  
    boolean wasAdded = false;
    if(addChargesEntry(aChargesEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChargesEntries()) { index = numberOfChargesEntries() - 1; }
      chargesEntries.remove(aChargesEntry);
      chargesEntries.add(index, aChargesEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveChargesEntryAt(EntryFinCharges aChargesEntry, int index)
  {
    boolean wasAdded = false;
    if(chargesEntries.contains(aChargesEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfChargesEntries()) { index = numberOfChargesEntries() - 1; }
      chargesEntries.remove(aChargesEntry);
      chargesEntries.add(index, aChargesEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addChargesEntryAt(aChargesEntry, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfBankEntries()
  {
    return 0;
  }

  public boolean addBankEntry(EntryFinBank aBankEntry)
  {
    boolean wasAdded = false;
    if (bankEntries.contains(aBankEntry)) { return false; }
    bankEntries.add(aBankEntry);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeBankEntry(EntryFinBank aBankEntry)
  {
    boolean wasRemoved = false;
    if (bankEntries.contains(aBankEntry))
    {
      bankEntries.remove(aBankEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addBankEntryAt(EntryFinBank aBankEntry, int index)
  {  
    boolean wasAdded = false;
    if(addBankEntry(aBankEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBankEntries()) { index = numberOfBankEntries() - 1; }
      bankEntries.remove(aBankEntry);
      bankEntries.add(index, aBankEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveBankEntryAt(EntryFinBank aBankEntry, int index)
  {
    boolean wasAdded = false;
    if(bankEntries.contains(aBankEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfBankEntries()) { index = numberOfBankEntries() - 1; }
      bankEntries.remove(aBankEntry);
      bankEntries.add(index, aBankEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addBankEntryAt(aBankEntry, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfOpEntries()
  {
    return 0;
  }

  public boolean addOpEntry(EntryFinOp aOpEntry)
  {
    boolean wasAdded = false;
    if (opEntries.contains(aOpEntry)) { return false; }
    opEntries.add(aOpEntry);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeOpEntry(EntryFinOp aOpEntry)
  {
    boolean wasRemoved = false;
    if (opEntries.contains(aOpEntry))
    {
      opEntries.remove(aOpEntry);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addOpEntryAt(EntryFinOp aOpEntry, int index)
  {  
    boolean wasAdded = false;
    if(addOpEntry(aOpEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOpEntries()) { index = numberOfOpEntries() - 1; }
      opEntries.remove(aOpEntry);
      opEntries.add(index, aOpEntry);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOpEntryAt(EntryFinOp aOpEntry, int index)
  {
    boolean wasAdded = false;
    if(opEntries.contains(aOpEntry))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOpEntries()) { index = numberOfOpEntries() - 1; }
      opEntries.remove(aOpEntry);
      opEntries.add(index, aOpEntry);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOpEntryAt(aOpEntry, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    saleEntries.clear();
    chargesEntries.clear();
    bankEntries.clear();
    opEntries.clear();
    super.delete();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 60 "../../../../logPersistence.ump"
  private static final long serialVersionUID = -319344666178541160L ;

  
}