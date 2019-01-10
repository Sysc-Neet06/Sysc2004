/*
By Neethan Sri
*/
public class GoToJailSquare extends Square
{
    /* The jail square. */
    private Square jailSquare;
    
    /**
     * Constructs a new GoToJailSquare with the specified number.
     */    
    public GoToJailSquare(int number, Square jailSquare)     {
        super("Go To Jail", number);
        this.jailSquare = jailSquare;
    }
 
    /**
     * Moves the specified player directly to the jail square.
     */
    public void landOn(Player p)     {
        p.setLocation(jailSquare);
    }   
}