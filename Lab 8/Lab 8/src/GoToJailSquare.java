
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class GoToJailSquare extends Square {
    private Square jailSquare;
    
    public GoToJailSquare(int number,Square jailSquare){
        super("jail",number);
        this.jailSquare = jailSquare;
    }
    
     public String getName(){
        return super.getName();
    }
    public int getNumber(){
        return super.getNumber();
    }
    @Override
    public void landOn(Player p)  {
        p.setLocation(this.jailSquare);
        
    }
    
}
