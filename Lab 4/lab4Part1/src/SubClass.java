/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class SubClass extends MyClass {
    private int b;
    
    
    public SubClass(int a,int b){
        super(a);
        this.b=b;
    }
    
    public int getB(){
        return this.b;
    }
    
    public String toString(){
        return super.toString() + " b = " + this.b;
    }
    
}
