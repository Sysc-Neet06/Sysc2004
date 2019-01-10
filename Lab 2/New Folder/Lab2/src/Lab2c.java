/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Neethan
 */
import java.util.Random;
import shapes.Circle;
public class Lab2c {
    
    
public static void main(String args[]){

    Circle circles[] = new Circle[10];
    double areas[] = new double[10];
    double perimeter[] = new double[10];
    
    
    Random randomGenerator = new Random();
    int radius;
    
    for (int i=0; i< circles.length;i++)
    {
        radius = randomGenerator.nextInt(49)+1;
        circles[i] = new Circle(radius);
        areas[i] = circles[i].area();
        perimeter[i] = circles[i].perimeter();
        System.out.println("Circle " + i + "(" + radius + ")" + ":" + "Area = " + areas[i] + ",Perimeter = " + perimeter[i]);
        
        
        
    }
    
  
    
   

    

}
}

