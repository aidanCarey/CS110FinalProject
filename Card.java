import java.util.Random;

public class Card
{
   public static int SPADES = 1;//A suit for a card object
   public static int CLUBS = 2;//A suit for a card object
   public static int HEARTS = 3;//A suit for a card object
   public static int DIAMONDS = 4;//A suit for a card object
   public static int ACE = 1;//A rank for a card object
   public static int JACK = 11;//A rank for a card object
   public static int QUEEN = 12;//A rank for a card object
   public static int KING = 13;//A rank for a card object
   private int rank;//Stores rank for a card object
   private int suit;//Stores suit for a card object
   private Random rand = new Random();
   /**
      The Default constructor accepts no arguments
      and sets suit and rank to random values.   
   */
   public Card ()
   {
      suit = rand.nextInt(DIAMONDS);
      rank = rand.nextInt(KING);
      if (rank < 2)
      {
         rank += 2;
      }
      else
      {
         rank += 1;
         
      }
      suit  += 1;      
   }
   /**
      The alternate constructor accepts two integer arguments
      and sets suit and rank to to s and r respectivly. 
      @param s is the number of the suit
      @param r is the number of the rank  
   */

   public Card (int s, int r)
   {
      suit = s;
      rank = r;
   }


   /**
   the getSuit method returns the value in suit
   */
   public int getSuit()
   {
      return suit;
   }
    /**
   the getRank method returns the value in rank
   */
   public int getRank()
   {
      return rank;
   }
    /**
   the toString method returns the string representetion of rank
   */
   public String toString()
   {
      String str = "";
      if (rank == ACE)
      {
         str += "Ace of: ";
      }
      else if (rank == JACK)
      {
         str += "Jack of: ";
      }
      else if (rank == QUEEN)
      {
         str += "Queen of: ";
      }
      else if (rank == KING)
      {
         str += "King of: ";
      }
      else
      {
         str += rank + " of: ";
      }
      if (suit == SPADES)
      {
         str += "Spades";
      }
      else if (suit == CLUBS)
      {
         str += "Clubs";
      }
      else if (suit == HEARTS)
      {
         str += "Hearts";
      }
      else
      {
         str += "Diamonds";
      }
      
      return str;             
   }
   
   /**
   the equals method accepts a card object and returns wether or not newCard object rank equal to the original rank  
   */
   public boolean equals (Card newCard)
   {
      //if (rank.equals(newCard.rank))
      if (rank == (newCard.rank))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   // public static void main(String[]args)
//    {
//       Card cardNumber = new Card();
//       System.out.println(cardNumber.toString());
//       
//    }
   
}