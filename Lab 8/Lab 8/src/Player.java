/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class Player implements Comparable {
    private String name;
    private Square location;
    private int cash;
    
    public Player(String name, Square startSquare){
        this.name = name;
        this.location = startSquare;
        this.cash = 1500;
    }
    public String getName(){
        return this.name;
    }
    public Square getLocation(){
        return this.location;
    }
    
    public void setLocation(Square newLocation){
        this.location = newLocation;
    }
    public int netWorth(){
        return this.cash;
    }
    
    public void increaseCash(int amount){
        this.cash = this.cash + amount;
    }
    public void decreaseCash(int amount){
        this.cash = this.cash - amount;
    }

    @Override
    public int compareTo(Object o) {
        Player p = (Player)o;
        if(this.netWorth() > p.netWorth()){
            return 1;
        }
        else if (this.netWorth() < p.netWorth()){
            return -1;
        }
        else{
            return 0;
        }
       
   }
    
}
