package NickZelada;


import java.util.*;
import java.io.*;

/**
 * Assignment 1: ArrayLists. This is the Card class in which the suit and rank of
 * the cards are created.
 *
 * @author Nick Zelada
 * @version September 10, 2018
 */
public class Card {

    // Type of suits
    public final static int SPADES = 0;
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;

    // Type of ranks
    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    // int names 
    private int suit;
    private int rank;

    /**
     * This constructor allows for the Card to make suit and rank.
     *
     * @param rank
     * @param suit
     */
    public Card(int rank, int suit) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * This is an accessors for rank.
     *
     * @return rank
     */
    public int getRank() {

        return rank;
    }

    /**
     * This is an accessors for suit.
     *
     * @return suit
     */
    public int getSuit() {
        return suit;

    }

    /**
     * This method will create the rank string to be printed by their rank
     * number or name.
     *
     * @param rank
     * @return the ranks or null
     */
    private String rankToString() {
        switch (rank) {
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";

            default:
                return null;
        }
    }

    /**
     * This method will create the suit string to be printed out as an unicode.
     * Each suit will print out their design.
     *
     * @param suitToString
     * @return unicode codes
     */
    private String suitToString() {
        switch (suit) {

            case DIAMONDS:
                return "\u2665";
            case CLUBS:
                return "\u2663";
            case HEARTS:
                return "\u2665";
            case SPADES:
                return "\u2660";
            default:
                return null;
        }

    }

    /**
     * This method will print out the rank string and suit string.
     *
     * @return rankToString() + suitToString()
     */
    public String toString() {

        return rankToString() + suitToString();
    }

}
