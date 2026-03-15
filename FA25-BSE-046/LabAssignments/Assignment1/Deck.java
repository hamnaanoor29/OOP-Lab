package LabAssignments.Assignment1;

import java.util.Random;

public class Deck {
    Card cards[];
    private String suits[]={"Spades","Clubs","Hearts","Diamonds"};
    private String ranks[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    private int top = 0;
    Deck()
    {
        cards=new Card[52];
        int counter=0;
        for(int i=0;i<suits.length;i++)
            for(int j=0;j< ranks.length;j++)
                cards[counter++]=new Card(suits[i],ranks[j]);

    }
    public void displayDeck()
    {
        for(Card card:cards)
            System.out.println(card);
    }
    public void Shuffle() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int tempIndex = random.nextInt(50);
            Card temp = cards[0];
            cards[0] = cards[tempIndex];
            cards[tempIndex] = temp;
        }
    }
    public Card drawCard()
    {
        if(top < cards.length)
            return cards[top++];
        else
            return null;
    }

}