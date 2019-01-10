
import java.util.Arrays;
import java.util.Random;
import java.util.Date;

/**
 *
 * @author Neethan
 */
public class Dice {

    private int[] die; // creates the array for the dice values to be stored
    private Random random = new Random(); // creates a Random class object

    public Dice() {
        this.die = new int[2];
        this.random = new Random(new Date().hashCode());
        this.roll();
    }

    // default constructor will construct a default pair of die.
    public Dice(int numDice) {
        if (numDice < 1) {
            throw new IllegalArgumentException("Please put a valid number for the dice");
        }
        this.die = new int[numDice];
        this.random = new Random(new Date().hashCode());
        this.roll();
    }
    // one arugument constructor constructs a integer amount of die to be constructed
    // Checks to see if a valid number is inputted for the number of dice

    /**
     * The public method roll() is used to roll all die values in the array that
     * is created.
     *
     * @return The total value of the rolled dice
     */
    public int roll() {

        int total = 0;
        for (int i = 0; i < this.die.length; i++) {
            this.die[i] = rollDie();
            total = this.die[i] + total;
        }
        return total;
    }
    // iterates through the for loop and calls rollDie() method
    // returns a total sum of the random numbers

    /**
     * The private method rollDie() is used to roll a single die.
     *
     * @return A random value from 1-6
     */
    private int rollDie() {
        return this.random.nextInt(6) + 1;
    }

    /**
     * The public method getDieValues() is used to get the values of the rolled
     * die
     *
     * @return An array filled with rolled die value
     */
    public int[] getDieValues() {

        return Arrays.copyOf(this.die, this.die.length);
    }

    // returns an array with the rolled value of each dice
    /**
     *The public method hasDoubles() is used to check if there is a pair
     * of values within the rolled dice values
     * @return True or False
     */
    public boolean hasDoubles() {

        for (int i = 0; i < this.die.length - 1; i++) {
            if (this.die[i] == this.die[i + 1]) {
                return true;
            }
        }
        return false;

    }
    // returns true if the array finds a pair of values otherwise returns false

    /**
     * The public toString() method is used to return an object in the form
     * of a string 
     * @return  the string itself
     */
    @Override
    public String toString() {
        String dieArray = "";
        for (int i = 0; i < this.die.length; i++) {
            dieArray = dieArray + this.die[i];
            if (i != this.die.length - 1) {
                dieArray = dieArray + " ";
            }

        }
        return dieArray;
    }
    // returns a string representation of the dice array
}
