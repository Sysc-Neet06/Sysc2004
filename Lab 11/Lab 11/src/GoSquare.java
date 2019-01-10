/*
By Neethan Sri
*/
public class GoSquare extends Square
{
    /**
     * Constructs a new GoSquare with the specified number.
     */
    public GoSquare(int number)     {
        super("Go", number);
    }
 
    /** 
     * Gives $200 to the specified player.
     */
    public void landOn(Player p)     {
        p.setLocation(this);
        p.increaseCash(200);
    }
}