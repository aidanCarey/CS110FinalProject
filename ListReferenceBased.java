// ****************************************************
// Reference-based implementation of ADT list.
// ****************************************************
public class ListReferenceBased implements ListInterface {
  // reference to linked list of items
  private Node head; 
  private int numItems; // number of items in list

  public ListReferenceBased()
  {
    numItems = 0;
    head = null;
  }  // end default constructor
 //  public ListReferenceBased(int i)
//   {
//     numItems = i;
//     head = null;
//   }  // end alternate constructor

  public boolean isEmpty()
  {
    return numItems == 0;
  }  // end isEmpty

  public int size()
  {
    return numItems;
  }  // end size

  private Node find(int index)
  {
  // --------------------------------------------------
  // Locates a specified node in a linked list.
  // Precondition: index is the number of the desired
  // node. Assumes that 1 <= index <= numItems+1
  // Postcondition: Returns a reference to the desired 
  // node.
  // --------------------------------------------------
    Node curr = head;
    for (int skip = 1; skip < index; skip++)
    {
      curr = curr.getNext();
    } // end for
    return curr;
  } // end find

   public Card get(int index) throws ListIndexOutOfBoundsException
   {
    //int deckSize = 52;
    //System.out.println("Items in list: " + numItems + " index attempting access: " + index); 
    if (index >= 0 && index <= numItems)
    {
      // get reference to node, then data in node
      Node curr = find(index);
      Card dataItem = curr.getItem();
      curr.setNext(curr.getNext());
      //System.out.println("card stored at this index: " + index + dataItem);
      //deckSize--;
      //numItems--;
      return dataItem;
    } 
    else 
    {
      throw new ListIndexOutOfBoundsException("List index out of bounds on get. index was:" + index + " num items was: " + numItems); 
    } // end if
  } // end get

  public void add(int index, Card item) throws ListIndexOutOfBoundsException 
  {
   if (index >= 0 && index <= numItems)
   {
      
      if (index == 0)
      {
         // insert the new node containing item at
         // beginning of list 
         Node newNode = new Node(item, head);
         head = newNode;
         //System.out.println(head.getItem());
         index++;
      } 
      else
      {
         Node prev = find(index);
         // insert the new node containing item after 
         // the node that prev references
         Node newNode = new Node(item, prev.getNext());
         prev.setNext(newNode);
         index++;
      } // end if
      numItems++;
    } 
    else
    {
      throw new ListIndexOutOfBoundsException("List index out of bounds on add");
    } // end if
  }  // end add

  public void remove(int index) throws ListIndexOutOfBoundsException
  {
   if (index >= 1 && index <= numItems)
   {
      if (index == 1)
      {
         // delete the first node from the list
         head = head.getNext();
      } 
      else
      {
         Node prev = find(index-1);
         // delete the node after the node that prev
         // references, save reference to node
         Node curr = prev.getNext(); 
         prev.setNext(curr.getNext());
      } // end if
      numItems--;
    } // end if
    else
    {
      throw new ListIndexOutOfBoundsException("List index out of bounds on remove " + numItems + " " + index );
    } // end if
  }   // end remove

  public void removeAll() {
    // setting head to null causes list to be
    // unreachable and thus marked for garbage 
    // collection
    head = null;
    numItems = 0;
  } // end removeAll

} // end ListReferenceBased