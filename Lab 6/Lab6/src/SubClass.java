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
    private Integer bWrapper;
    
    
    public SubClass(int a,int b, String aString,Integer bWrap){
        super(a,aString);
        this.b=b;
        this.bWrapper = bWrap;
    }
    
    public int getB(){
        return this.b;
    }
    
    public int getA(){
        return super.getA() * 2;
    }
    
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null)return false;
        if(this.getClass() != o.getClass())return false;
        
        SubClass e = (SubClass) o;
        return (super.equals(o) && (this.b == e.b));
    }
    
    public String toString(){
        return super.toString() + " / b = " + this.b + " " + this.bWrapper;
    }
    
}
