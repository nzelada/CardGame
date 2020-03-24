package NickZelada;



import java.util.*;
import java.io.*;

/**
 * Assignment 1: ArrayLists. This is the Hand class in which the hand is created
 * and filled.
 *
 * @author Nick Zelada
 * @version September 10, 2018
 */
public class Hand {

    private ArrayList<Card> hand; // ArrayList of hand

    /**
     * Contains the ArrayList of hand
     */
    public Hand() {
        hand = new ArrayList<Card>(); // Creation of hand ArrayList
    }

    /**
     * This method would get 13 cards and fill it into the hand.
     *
     * @param deck
     */
    public void fill(Deck deck) {
        for (int i = 0; i < 13; i++) {

            hand.add(deck.dealCard());
        }

    }

    /**
     * This method would create the string to represent the hand.
     *
     * @return str
     */
    public String toString() {
        String str = "";
        for (Card a : hand) {
            str += a.toString() + "\n";
        }
        return str;
    }
}
