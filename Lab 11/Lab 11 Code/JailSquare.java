/**
 * A Jail square models the square in the game of Monopoly that
 * forces a players to roll a double to move out.
 * No implementation right now -- For now, will just stay forever in jail.
 * 
 
 * @author Schramm
 * @version 1.01 March 27, 2018
 */
public class JailSquare extends Square
{
    private int rolls;
    
    /**
     * Constructs a new GoToJailSquare with the specified number.
     */    
    public JailSquare(int number)     {
        super("Jail", number);
    }
 
    /**
     * Moves the specified player directly to the jail square.
     */
    public void landOn(Player p)     {
        // TBD
    }   
}