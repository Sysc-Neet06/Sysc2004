/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class MyClass {
    private int a;
    private String aString;
    
    public MyClass(int a,String aString){
        this.a = a;
        this.aString = aString;
    }
    
    public int getA(){
        return this.a;
    }
    
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null)return false;
        if(this.getClass() != o.getClass())return false;
        
        MyClass e = (MyClass) o;
        return (this.a == e.a) && (this.aString.equals(e.aString));
    }
    
    public String toString(){
        return "a = " + this.a + " " + this.aString;
    }
    
}
