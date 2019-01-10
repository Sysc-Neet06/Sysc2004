
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class Patient {
    private int oHipNumber;
    private String surname;
    private String firstName;
    
    Patient(int Num,String surname,String firstName){
        this.oHipNumber= oHipNumber;
        this.surname = surname;
        this.firstName = firstName;
    }
    
    public int getOhipNumber(){
        return this.oHipNumber;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String toString(){
        return "SUCK MY DICK";
    }

  
    
    public boolean equals(Object o){
        if(this == o)return true;
        if(o == null)return false;
        if(this.getClass() != o.getClass())return false;
        
        Patient e = (Patient) o;
        return ((this.oHipNumber == e.oHipNumber)&&(this.firstName == e.firstName) && (this.surname == e.surname));
}
    
    public int hashcode(){
        return this.oHipNumber + Objects.hashCode(this.surname) +Objects.hashCode(this.firstName);
    }
}
