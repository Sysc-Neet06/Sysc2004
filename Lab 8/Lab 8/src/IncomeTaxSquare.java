/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class IncomeTaxSquare extends Square {
    private int maximumTax;
    
    public IncomeTaxSquare(int maxTax){
        super("Income Tax",0);
        this.maximumTax = 200;
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
        if(p.netWorth()/10 > this.maximumTax){
            p.decreaseCash(maximumTax);
        }
        else{
            p.decreaseCash(p.netWorth()/10);
        }
    }
    
}

