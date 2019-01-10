/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Neethan's PC
 */
public abstract class AbstractFlashCards {

    /*
    Declaring all private variables needed for the abstract class
     */
    private HashMap<String, String> flashCards;
    private ArrayList<String> unansweredCards;
    private int score;
    private Scanner scanner;
    private Random random;

    /**
     * A empty argument constructor that initializes all variable
     */
    public AbstractFlashCards() {

        this.flashCards = new HashMap<String, String>();
        this.unansweredCards = new ArrayList<String>();
        this.scanner = new Scanner(System.in);
        this.random = new Random();

    }

    /**
     * A protected void method that puts the questions and its respective answer
     * in the hashMap also adds the questions into the unanswered deck.
     *
     * @param question
     * @param answer
     */
    protected void addCard(String question, String answer) {
        this.flashCards.put(question, answer);
        this.unansweredCards.add(question);
    }

    /**
     * A void method that shuffles the cards again to allow the game to be
     * different as well as set the score to zero
     */
    public void reset() {
        this.flashCards = new HashMap<String, String>();
        this.score = 0;
    }

    /**
     * A boolean method that checks if there is any unanswered cards left
     *
     * @return true if there are remaining unanswered cards left
     */
    public boolean hasNext() {
        if (this.unansweredCards.isEmpty() == true) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * A boolean method that controls a majority of the game, This method will
     * print the next unanswered question and read in the users answer. If the
     * answer is correct then the question is popped and the user's score is
     * updated. If the answer is incorrect, the card is re-inserted into a
     * random spot in the deck.
     *
     * @return true when the answer is correct/incorrect and there is still
     * unanswered questions. False if there is no cards left to answer
     */
    public boolean nextCard() {
        while (this.hasNext() == true) { // while there is still cards in the deck
            boolean repeat = true; // used to help the game loop
            while (repeat == true) {
                ArrayList<String> shuffle = new ArrayList<>(); // used for the randomly shuffled deck

                for (String eachQuestion : this.unansweredCards) {
                    shuffle.add(this.random.nextInt(shuffle.size() + 1), eachQuestion);

                }
                
                System.out.println(shuffle); // prints the whole deck
                System.out.println(shuffle.get(0)); // print the first question
                
                String in = this.scanner.next(); // reads in the users answer`12

                if (in.compareTo(this.flashCards.get(shuffle.get(0))) == 0) { // compare the inputted answer to the answer in the hashmap using its key
                    
                    System.out.println("Congradulations, you are correct");
                    this.score += 1;
                    System.out.println("Score = " + this.score);
                    
                    this.unansweredCards.remove(shuffle.get(0)); // renoves the question that was correct
                    if (this.hasNext() == true) { // if there is still unanswered questions
                        
                        System.out.println("Next? (Y or N)"); // asks the user if they would like to continue
                        in = this.scanner.next(); // reads in user input
                        
                        if (in.compareTo("N") == 0) { // if the input was No then program ends
                            repeat = false;
                            return true;
                        }
                    } 
                    else {
                        this.reset(); // resets everything
                        repeat = false; // sets the repeat to false and ends game
                    }
                } 
                else {
                    System.out.println("Yikes, you got it wrong, please try again"); // outputs when answer is wrong
                }
            }
        }
        return this.hasNext(); // game continues until unanswered is empty
    }

    /**
     * A method that gets the score of the player
     * @return a integer value of the score
     */
    public int getScore() {
        return this.score;
    }
}
