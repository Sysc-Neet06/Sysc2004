
/**
 *
 * @author Neethan Sri
 */
public class BankruptException extends Exception {
    
    public int deficit;
    
    public BankruptException(int deficit) {
        this.deficit = deficit;
    }
    
    public int getDeficit() { return deficit; }
}
