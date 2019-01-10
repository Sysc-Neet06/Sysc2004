/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author Neethan's PC
 */
public class Lab6c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Patient,String>hospital = new HashMap<Patient,String>();
        Patient p = new Patient(1,"John","Doe");
        
        hospital.put(p,"C123");
        System.out.println(hospital.get(p));
        
        Patient other = new Patient(1,"John","Doe");
        System.out.println(hospital.get(other));
        
    }
    
}
