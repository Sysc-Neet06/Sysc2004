/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
/**
 *
 * @author Neethan's PC
 */
public class SubSubClass extends SubClass {
    private int c;
    private URL cOther;
    
    public SubSubClass (int a,int b, int c, String aString,Integer bWrap,URL Cother){
        super(a,b,aString,bWrap);
        this.c = c;
        this.cOther = Cother;
    }
    
    public int getC(){
        return this.c;
    }
    
    public int getA(){
        return super.getA() * this.c;
    }
    
     public int getB(){
        return super.getB() * this.c;
    }
     
     public boolean equals(Object o){
         if(this == o)return true;
         if(o == null)return false;
         if(this.getClass()!= o.getClass())return false;
         
         SubSubClass e = (SubSubClass) o;
         return (super.equals(o) && (this.c == e.c));
     }
    
    public String toString (){
        return super.toString() + " / c = " + this.c + " " + this.cOther;
    }
    
}
