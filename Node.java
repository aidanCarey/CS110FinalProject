public class Node 
{
  private Card item;
  private Node next;

  public Node(Card newItem) {
    item = newItem;
    next = null;
  } // end constructor

  public Node(Card newItem, Node nextNode) {
    item = newItem;
    next = nextNode;
  } // end constructor

  public void setItem(Card newItem)
  {
    item = newItem;
  } // end setItem

  public Card getItem()
  {
    return item;
  } // end getItem

  public void setNext(Node nextNode)
  {
    next = nextNode;
  } // end setNext

  public Node getNext() {
    return next;
  } // end getNext
  
} // end class Node

