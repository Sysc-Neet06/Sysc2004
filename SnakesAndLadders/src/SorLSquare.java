

/**
 *
 * @author Neethan
 */
public class SorLSquare extends SnLSquare{
    
   private int endSquare; //Initialized a variable to represent the end square
    
    /**
    * A 2-Argument constructor constructs a specific square that will be used 
    * to create either snake squares or ladder squares
    * @param number
    * @param endSquare 
    * @throws IllegalArgumentException  if the end square is the same as the 
    * start position
    */
    public SorLSquare(int number, int endSquare){
        super(number);
        if(number == endSquare)
            throw new IllegalArgumentException("Its the same square");        
        this.endSquare= endSquare;
    }
    
    /**
     * A method to get the value of the end square of the snake or ladder square
     * @return the value of end square
     */
    public int getEndSquare(){
        return this.endSquare;
    }
    
    /**
     * A method to return the value that the player will land on if they land 
     * on a snake or ladder
     * @return the value of end square
     */
    public int landOn(){
        return getEndSquare();
    }
    
    /**
     * A toString method that calls the toString method from SnLSquare and prints
     * the end square value in a string statement
     * @return a string representation of the start position and the end position
     */
    public String toString(){
        return super.toString()+":"+this.endSquare;
    }
    
    /**
     * A equals method that will check if two object have logical equivalence
     * between instances
     * @param o
     * @return true or false if the objects are equivalent
     */
    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null) return false;
        if(this.getClass()!= o.getClass())return false;
        // boiler plate code provided in lecture slides
        
        SorLSquare s = (SorLSquare)o; // cast of object o to SorLSquare class
        
        return (super.equals(s)) && (this.endSquare == s.endSquare); 
    }
    
}
