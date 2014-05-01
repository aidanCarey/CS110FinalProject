import java.util.Random;

/**

*/
public class Deck 
{
   final static int NUM_CARDS = 52;
   private int counter = 1;
   Card c2 = new Card();
   Random rand = new Random();
   private QueueReferenceBased deckQue = new QueueReferenceBased();
   private ListReferenceBased deckList = new ListReferenceBased();
   //ListReferenceBased deckShuffled = new ListReferenceBased();
  
   public Deck()
   {
      int rankCounter = 1, i = 0;
      while (rankCounter != 14)
      {
         Card c1 = new Card(1 , rankCounter);
         deckQue.enqueue(c1);
         i++;
         c1 = new Card(2 , rankCounter);
         deckQue.enqueue(c1);
         i++;
         c1 = new Card(3 , rankCounter);
         deckQue.enqueue(c1);
         i++;
         c1 = new Card(4 , rankCounter);
         deckQue.enqueue(c1);
         i++;
         rankCounter++;
      }
      //System.out.println("Done Storing cards: " + deckList.getSize());
   }
   /**
   Determines whether a queue is empty.
   @return true if the deck is empty otherwise returns false.
   */
   public boolean isEmpty()
   {
      boolean empty;
      if (deckQue.isEmpty())
      {
         empty = true;
      }
      else
      {
         empty = false;
      }
      
      return empty;
   }
   /**
   The deal method takes the first card off the pile
   @return c2 is the top card of the deck
   */
   public Card deal(QueueReferenceBased  pileOfCards)
   {
      c2 = pileOfCards.dequeue();
      //counter = counter + 1;
      return c2;   
   }
   /**
   The shuffle method accepts a QueueReferenceBased object as an argument 
   then returns the que in a random order.
   @param deckPlaceHolder is a que of cards
   @return deckPlaceHolder is a que of cards  
   */
   public QueueReferenceBased shuffle(QueueReferenceBased deckPlaceHolder)
   {
      int index = 0;
      while (!deckPlaceHolder.isEmpty())
      {
         deckList.add(index , deckPlaceHolder.dequeue());
      }
      
      int i = 1;
// 
      for (int count = 0; count <= 52; count++)
      {
         if (deckList.size() != 0)
         {
            index = rand.nextInt(deckList.size()) + 1;
            c2 = deckList.get(index);
            deckList.remove(index);
            deckPlaceHolder.enqueue(c2);
         }
         else
         {
            count = 53;
         }
      }
      return deckPlaceHolder;
   }
    
   
   public QueueReferenceBased getDeck()
   {
      return deckQue;
   
   }
   
  //  public Card get(int index, ListReferenceBased deck)
//    {
//       c2 = deckList.get(index);
//       return c2;
//    
//    } 
//    
//    public void add(int i, Card newCard)
//    {
//       deckList.add(i , newCard);
//    
//    }
   /**
   The method number returns the number of cards in the deck
   @return NUM_CARDS is the number of cards in the deck
   */
   // public int number()
//    {
//       return NUM_CARDS;
//    }
//    
//    public void setDeck()
//    {
//    
//       this.deckList = deckList;   
//    }
//    
//    public ListReferenceBased getDeck()
//    {
//       return deckList;
//    }
   
   public String toString()
   {
      String str = "";
      int i = 0;
      while (i < deckQue.getSize())
      {
         c2 = deckQue.dequeue();
         str += c2 + " \n";
         i++;
         deckQue.enqueue(c2);
         
      }
      return str;
      
   }

   
   public static void main(String[]args)
   {
      QueueReferenceBased queOfCards = new QueueReferenceBased();
      ListReferenceBased shuffledList = new ListReferenceBased();
      Deck deck1 = new Deck();
      queOfCards = deck1.getDeck();
      //System.out.println(deck1.toString());
      //System.out.println(deck1.deal());
      deck1.shuffle(queOfCards);
     //  deck1.setDeck();
//       listOfCards = deck1.getDeck();
//       System.out.println("Size of new list: " + listOfCards.size());
//       //CardPile deck2 = new CardPile(deck1);
//       System.out.println(deck1.toString());
      // CardPile deck2 = new CardPile(listOfCards);
//       //System.out.println(deck2.toString());
//       //System.out.println(deck1.size());
//       shuffledList = (deck2.shuffle(deck1));
//       CardPile deck3 = new CardPile(shuffledList);
//       System.out.println(deck3.toString());
   }   
      
   
}
