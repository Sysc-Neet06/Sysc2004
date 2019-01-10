/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class SubSubClass extends SubClass {
    private int c;
    
    public SubSubClass (int a,int b, int c){
        super(a,b);
        this.c = c;
    }
    
    public int getC(){
        return this.c;
    }
    
    public String toString (){
        return super.toString() + " c = " + this.c;
    }
    
}
