

public class WarGame
{
   private QueueReferenceBased p1CardPile = new QueueReferenceBased();
   private QueueReferenceBased computerPile = new QueueReferenceBased();
   private Card c1;
   private Card c2;
   private Deck deck1 = new Deck();
   public WarGame()
   {
      QueueReferenceBased queOfCards = new QueueReferenceBased();
      ListReferenceBased shuffledList = new ListReferenceBased();
      queOfCards = deck1.getDeck();
      //deck1.shuffle(queOfCards);
      queOfCards = deck1.getDeck();
      int i = 0;
      while (!queOfCards.isEmpty())
      {
          c1 = queOfCards.dequeue();
          if (i == 0)
          {
            p1CardPile.enqueue(c1);
            i++;
          }
          else
          {
            computerPile.enqueue(c1);
            i = 0;
          }
      
      }
      deck1.shuffle(p1CardPile);
      deck1.shuffle(computerPile);
      // while (!p1CardPile.isEmpty())
//       {
//          System.out.println(" card from player1 " + p1CardPile.dequeue() + " size " + p1CardPile.getSize());
//          System.out.println(" card from player1 " + computerPile.dequeue() + " size " + computerPile.getSize() );
//       
//       
//       }   
   }
   /**
   The play method accepts no arguments. takes teh first card off each pile and compares them
   */
   public void  play()
   {
      c1 = deck1.deal(p1CardPile);
      c2 = deck1.deal(computerPile);
      System.out.println("player one card: " + c1 + " computer card: " + c2 );
   
   
   
   }
   
   
   
   public static void main(String[]args)
   {
      WarGame game = new WarGame();
      game.play();
   
   }







}