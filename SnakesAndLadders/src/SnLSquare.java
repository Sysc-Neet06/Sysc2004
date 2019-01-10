

/**
 *
 * @author Neethan
 */
public class SnLSquare {
    private int number; //Initialized the square number
    
    /**
     * 1-Argument constructor  that will construct normal squares for the snake
     * and ladders board
     * @param number 
     */
   public SnLSquare(int number){
        this.number = number;
    }
    
   /**
    * A int method called getNumber which returns the square number
    * @return the value of number
    */
    public int getNumber(){
        return this.number;
    }
    
    /**
     * A int method called landOn which returns the square number that the player
     * lands on
     * @return 
     */
    public int landOn(){
        return getNumber();
    }
    
    /**
     * A toString method used to display the square number
     * @return  a string statement of a the square number
     */
    @Override
    public String toString(){
        return "" + this.number + "";
    }
    
     /**
     * A equals method that will check if two object have logical equivalence
     * between instances
     * @param o
     * @return true or false if the objects are equivalent
     */
    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null) return false;
        if(this.getClass()!= o.getClass())return false;
        //boilder plate code provided in lecture slides
        
        SnLSquare s = (SnLSquare) o;// cast o to SnLSquare class
        
        return(this.number == s.number);
        
        
    }
    
    
}
