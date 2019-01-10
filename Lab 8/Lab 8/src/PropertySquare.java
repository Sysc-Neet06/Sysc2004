
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class PropertySquare extends Square {
    private int price; // Cost to purchase this property
    private int rent; // Amount to be paid if a player lands on this property;
    private Player owner; // Owner of this property;
    
    public PropertySquare(String name,int number,int price,int rent){
        super(name,number);
        this.price = price;
        this.rent = rent;
        this.owner = null;
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
        if (this.owner == null){
            if(p.netWorth() >= this.price){
                p.decreaseCash(this.price);
                this.owner = p;
            }
           
        }else{
              p.decreaseCash(rent);
              owner.increaseCash(rent);
       
            if(p.netWorth()< 0){
                this.owner.increaseCash(p.netWorth());  
                p.decreaseCash(p.netWorth());
                throw new IllegalArgumentException(p.getName() + "UR OUT");
            }   
        }   
        p.setLocation(this);
    }
}