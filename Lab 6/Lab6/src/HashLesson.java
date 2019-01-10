/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
/**
 *
 * @author Neethan's PC
 */
public class HashLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer,String>gradebook = new HashMap<Integer,String>();
        
        Random r = new Random();
        
        String grades[] = {"F","D-","D","D+","C-","C","C+","B-","B","B+","A-","A","A+"};
        
        for(int i=0;i<1000;i++){
            int number = r.nextInt(10000);
            int gpa = r.nextInt(12);
            String grade = grades[gpa];
            gradebook.put(number, grade);
            System.out.println(gradebook.size());
        }
        Set<Integer> keys = gradebook.keySet();
        for (Integer stNum: keys) {
        String grade = (String) gradebook.get(stNum);
        System.out.println(stNum + " = " + grade);
 }
        
    }
    
}
