/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ghazal.jaq.log.model;
import java.io.Serializable;
import java.util.*;

// line 3 "../../../../logPersistence.ump"
// line 6 "../../../../log.ump"
public class Logiciel implements Serializable
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Logiciel Associations
  private List<Page> pages;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Logiciel()
  {
    pages = new ArrayList<Page>();
    // line 10 "../../../../log.ump"
    pages.add((Page)(new PageDemarrage()));
    		pages.add((Page)(new PageSeuil()));
    		pages.add((Page)(new PageObjectifs()));
    		pages.add((Page)(new PageActionnariat()));
    		pages.add((Page)(new PageRessHumaines()));
    		pages.add((Page)(new PageProduction()));
    		pages.add((Page)(new PageMarketing()));
    		pages.add((Page)(new PageJournalGeneral()));
    		pages.add((Page)(new PageTableauDeBord()));
    // END OF UMPLE AFTER INJECTION
  }

  //------------------------
  // INTERFACE
  //------------------------

  public Page getPage(int index)
  {
    Page aPage = pages.get(index);
    return aPage;
  }

  public List<Page> getPages()
  {
    List<Page> newPages = Collections.unmodifiableList(pages);
    return newPages;
  }

  public int numberOfPages()
  {
    int number = pages.size();
    return number;
  }

  public boolean hasPages()
  {
    boolean has = pages.size() > 0;
    return has;
  }

  public int indexOfPage(Page aPage)
  {
    int index = pages.indexOf(aPage);
    return index;
  }

  public static int minimumNumberOfPages()
  {
    return 0;
  }

  public boolean addPage(Page aPage)
  {
    boolean wasAdded = false;
    if (pages.contains(aPage)) { return false; }
    pages.add(aPage);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePage(Page aPage)
  {
    boolean wasRemoved = false;
    if (pages.contains(aPage))
    {
      pages.remove(aPage);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addPageAt(Page aPage, int index)
  {  
    boolean wasAdded = false;
    if(addPage(aPage))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPages()) { index = numberOfPages() - 1; }
      pages.remove(aPage);
      pages.add(index, aPage);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePageAt(Page aPage, int index)
  {
    boolean wasAdded = false;
    if(pages.contains(aPage))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPages()) { index = numberOfPages() - 1; }
      pages.remove(aPage);
      pages.add(index, aPage);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPageAt(aPage, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    pages.clear();
  }
  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 6 "../../../../logPersistence.ump"
  private static final long serialVersionUID = 3887485940509265005L ;

  
}