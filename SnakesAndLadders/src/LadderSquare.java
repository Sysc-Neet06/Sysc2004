

/**
 *
 * @author Neethan
 */
public class LadderSquare extends SorLSquare {
    
    /**
     * The 2-argument constructor constructs a square that will increase 
     * the player position towards the finish by a specific amount, 
     * based on the Snakes and Ladders board game.
     * @param number
     * @param endSquare 
     * @throws IllegalArgumentException if the End Square is less than the start position
     */
   public LadderSquare(int number, int endSquare){
        super(number,endSquare);
        if(endSquare < number) throw new IllegalArgumentException("EndSquare less than starting positon");
    }
    
   /**
    * Method landOn overrides landOn in SorLSquare class 
    * @return calls landOn method from SorLSquare and returns the value the 
    * player lands on after landing on a ladder square
    */
    public int landOn(){
        return super.landOn();
    }
    
    /**
     * toString method that prints the start position of the ladder and
     * the final position of the ladder
     * @return a string statement of the starting and final position of the ladder
     */
    public String toString(){
        return super.getNumber() + "+" + super.getEndSquare();
    }
     
    /**
     * A equals method that will check if two object have logical equivalence
     * between instances
     * @param o
     * @return true or false if the objects are equivalent
     */
   public boolean equals(Object o){
       return super.equals(o);
   }
   /*
    I decided to override the equals to method because that way laddder square 
    can be checked if it is a ladder square specifically and not just a 
    SorLSquare class object. 
    */
}
