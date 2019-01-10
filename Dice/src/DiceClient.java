    

/**
 *
 * @author Neethan
 */
public class DiceClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dice dice = new Dice();
        int total = 0;
        int[] histoRoll = new int[6];
        double deviation = 0;
        double avg;
        // a dice object is created
        // total is created to store the sum
        // histoRoll is created to store the histogram stats
        // deviation and avg are created to use in the deviation calculation
        for (int i=0;i<2000;i++){
            dice.roll();
            int [] rolls = dice.getDieValues();
            total = total + rolls[0];
            total = total + rolls[1];
            histoRoll[rolls[0]-1]= histoRoll[rolls[0]-1]+1;// For the first dice value
            histoRoll[rolls[1]-1]= histoRoll[rolls[1]-1]+1; // For the second dice value
        }
        //Roll() method and getDieValues() method is called to store the 
        //dice value in the array. 
        // The for loop is used to iterate through the array to save the values 
        // in the histogram array accordingly.
         avg = (double)total/4000;
         System.out.println("The avergage roll was " + avg);
         // avg is calculated and printed to the user
         for (int i=0;i<6;i++){
             deviation = deviation + histoRoll[i]*Math.pow((i+1)-avg,2);
         }
         // A for loop used to calculate the deviation
         deviation = deviation/4000;
         deviation = Math.sqrt(deviation);
         System.out.println("The standard deviation of the rolls was " + deviation);
         // Deviation is calculated and outputted to the user
         System.out.println("The histogram for the rolls are shown below");
          for(int i = 0;i < histoRoll.length;i++)
        {
            String asterik = "";
            System.out.print((i+1)+"("+histoRoll[i]+")  :");
            for(int j = 0; j < histoRoll[i]/10;j++)
                asterik = asterik + "*";
            System.out.print(asterik+"\n");
        }
          // The for loops used here are for the histogram to save values and
          // print the histogram accordingly.
    }
}
