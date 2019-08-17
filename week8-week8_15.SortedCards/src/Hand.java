import java.util.*;
public class Hand implements Comparable<Hand>{
    
    private List<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    
    public void print() {
        for(Card c: this.hand){
            System.out.println(c);
        }
    }
    
     public void sort() {
         Collections.sort(hand);
     }
     
     public List<Card> getHand(){
         return this.hand;
     }
     
     @Override
     public int compareTo(Hand newHand){
         List<Card> list = newHand.getHand();        
         int hand1 = 0, hand2 = 0;
         
         
         for(int i = 0; i < this.hand.size(); i++){
             Card card = this.hand.get(i);
             hand1 += card.getValue();
         }
         for(int i = 0; i < list.size(); i++){
             Card card = list.get(i);
             hand2 += card.getValue();
         }
         
         if(hand1>hand2)
             return 1;
         else if(hand1 == hand2)
            return 0;
         return -1;
             
     }
     
     public void sortAgainstSuit(){
         Collections.sort(this.hand, new SortAgainstSuitAndValue());
     }
}



