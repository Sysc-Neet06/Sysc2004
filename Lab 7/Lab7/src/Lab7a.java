
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neethan's PC
 */
public class Lab7a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        ArrayList<Row> Rows = new ArrayList<Row>();
        try {
             FileReader reader = new FileReader("sampleCSV.csv");
             BufferedReader buffer = new BufferedReader (reader);
             
             for(String line = buffer.readLine(); line != null; line = buffer.readLine()){
                 String [] columnHeadings = line.split(",");
                 Row a = new Row(columnHeadings.length);
                 int count = 0;
                 for(String each: columnHeadings){
                     a.add(count,each);
                     count++;
                 }
                 Rows.add(a);
             }
             buffer.close();
        }
        
        catch (FileNotFoundException e1) {
            System.out.println(e1);
        }
        catch(IOException e2){
            System.out.println(e2);
        }
       
        
        for(Row each : Rows){
            System.out.println(each.toString());
        }
        
       }
   }
      class Row{
          private final String[] columns;
          public Row(int numColumns){
              this.columns = new String[numColumns];
          }
          
          public void add(int column,String value){
              columns[column] = value;
          }
          
          public String toString(){
              String string = "";
              for(String each : columns){
                  string = string + each + ",";
              }
              return string;
          }
      
      }

    
    

