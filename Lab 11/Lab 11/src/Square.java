/*
By Neethan Sri
*/
public abstract class Square
{
    /**
     * The square's name.
     */
    private String name;
    
    /**
     * The square's number.
     */
    private int number;
 
    /**
     * Constructs a new Square with the specified name and number.
     */
    public Square(String name, int number)     {
        this.name = name;
        this.number = number;
    }
    
    /**
     * Returns the name of this Square.
     */
    public String getName()     {
        return name;
    }

    /**
     * Returns this Square's number.
     */
    public int getNumber()     {
        return number;
    }
    
    public abstract void landOn(Player p) throws Exception;

    public String toString() {
        return name;
    }
    
}