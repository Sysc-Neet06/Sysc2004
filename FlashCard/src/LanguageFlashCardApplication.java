
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Neethan's PC
 */
public class LanguageFlashCardApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        try { // a try statement to see if the program is inputed with the right data

            Scanner read = new Scanner(System.in); // initializing the scanner
            System.out.println("What is the filename containing your flashcards? Exact letters!");
            String filename = read.next(); //reads the file

            LanguageFlashCards game = new LanguageFlashCards(filename);//intilaizes game
            game.nextCard(); // starts game 
        } 
        catch (IOException e1) { // catches exceptions
            System.out.println(e1); // prints exceptions
        }
    }
}
