package NickZelada;



import java.util.*;
import java.io.*;
import javax.swing.*;
import NickZelada.Card;
import NickZelada.Deck;
import NickZelada.Hand;




/**
 * Assignment 1: ArrayLists. This is the Test class in which it would have the
 * main. Besides that, this class will make the program come together and run.
 * The hand will display filled with cards and ask the user if they wish to see
 * another hand of cards.
 *
 * @author Nick Zelada
 * @version September 10, 2018
 */
public class Test {

    /**
     * In the main method, there is a loop that would go 4 times only. A deck of
     * cards has 52 cards. Each hand will have 13 cards, allowing us to only
     * have four hands. After that the program will come to an end, since there
     * isn't any more cards. It would also come to an end when the user doesn't
     * put the string "yes."
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer;
        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i <= 3; i++) {
            System.out.print("Would you like to see a hand of cards?");
            answer = sc.next();
            if (answer.equals("yes")) {
                Hand hand = new Hand();
                hand.fill(deck);
                System.out.print(hand);
            } else {

                break;
            }

        }
    }
}
