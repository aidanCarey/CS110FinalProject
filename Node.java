public class Node 
{
  private Node item;
  private Node next;

  public Node(Node newItem) {
    item = newItem;
    next = null;
  } // end constructor

  public Node(Node newItem, Node nextNode) {
    item = newItem;
    next = nextNode;
  } // end constructor

  public void setItem(Node newItem)
  {
    item = newItem;
  } // end setItem

  public Node getItem()
  {
    return item;
  } // end getItem

  public void setNext(Node nextNode)
  {
    next = nextNode;
  } // end setNext

  public Node getNext()
  {
    return next;
  } // end getNext
  
} // end class Node

