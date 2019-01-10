

/**
 *
 * @author Neethan
 */
public class SnakeSquare extends SorLSquare {

    /**
     * The 2-argument constructor constructs a square that will decrease 
     * the player position away from the finish by a specific amount, 
     * based on the Snakes and Ladders board game.
     * @param number
     * @param endSquare 
     * @throws IllegalArgumentException if End square is more than the start position
     */
    public SnakeSquare(int number,int endSquare){
        super(number,endSquare);
        if(endSquare > number)throw new IllegalArgumentException("EndSquare more than itself");  
    }
    
    /**
    * Method landOn overrides landOn in SorLSquare class 
    * @return calls landOn method from SorLSquare and returns the value the 
    * player lands on after landing on a snake square
    */
    @Override
    public int landOn(){
        return super.landOn();
    }
    
    /**
     * toString method that prints the start position of the snake and
     * the final position of the snake
     * @return a string statement of the starting and final position of the snake
     */
    @Override
    public String toString(){
        return super.getNumber() + "-" + super.getEndSquare();
    }
    
     /**
     * A equals method that will check if two object have logical equivalence
     * between instances
     * @param o
     * @return true or false if the objects are equivalent
     */
    @Override
    public boolean equals(Object o){
        return super.equals(o);
    }
    /*
    I decided to override the equals to method because that way snake square 
    can be checked if it is a snake square specifically and not just a 
    SorLSquare class object. 
    */
}