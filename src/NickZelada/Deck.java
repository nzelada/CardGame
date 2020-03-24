package NickZelada;



import java.util.*;
import java.io.*;

/**
 * Assignment 1: ArrayLists. This is the Deck class in which the deck of cards
 * will be created.
 *
 * @author Nick Zelada
 * @version September 10, 2018
 */
public class Deck {

    final int CARDS_IN_DECK = 52;
    int current_card_count = 0;
    private ArrayList<Card> deck;

    /**
     * The constructor of Deck will create a deck with the suits and the ranks
     * in the loop and then adding it to the deck ArrayList
     */
    public Deck() {
        deck = new ArrayList<Card>(CARDS_IN_DECK);
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(rank, suit);

                this.deck.add(newCard);
            }
        }
    }

    /**
     * The shuffle method will get the deck and shuffle the cards.
     */
    public void shuffle() {
        int randNum;
        Card temp;
        Random r = new Random();
        for (int i = 0; i < deck.size(); i++) {
            randNum = r.nextInt(deck.size());
            temp = deck.get(i);
            deck.set(i, deck.get(randNum));
            deck.set(randNum, temp);
        }
    }

    /**
     * The dealCard method with bring in a card and remove it when it was
     * already used.
     *
     * @return deck.remove(0)
     */
    public Card dealCard() {
       
        Card a = deck.remove(0);
        return  a;
    }

    /**
     * This method would will a toString in which will convert the deck into a
     * string.
     *
     * @return deck.toString()
     */
    public String toString() {
        return deck.toString();
    }
}
