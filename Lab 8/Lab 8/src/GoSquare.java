/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class GoSquare extends Square {
   
    public GoSquare(int number){
        super("Go",number);
        
    }
    public String getName(){
        return super.getName();
    }
    public int getNumber(){
        return super.getNumber();
    }
    @Override
    public void landOn(Player p)  {
        p.setLocation(this);
        p.increaseCash(200);
        
    }
    
}
