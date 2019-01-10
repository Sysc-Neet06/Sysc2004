
/**
 *
 * @author Neethan
 */
public class SnakesAndLadders {

    public static int NUM_PLAYERS; // Made just static as number of player can change
    public static final int NUM_SQUARES = 100; // default value for snakes and ladder board
    private SnLSquare[] board; // initialized the board
    private int[] players; // initialized player array
    private Dice dice; // initialized the die 
    
    /**
     * No Argument constructor constructs the game objects with default values
     * and sets players to 2
     */
    public SnakesAndLadders(){
        this(2);
    }
    
    /**
     * 1-Argument constructor constructs game objects and sets the player amount 
     * to the value requested by the user
     * @param nPlayers  amount of players wanted to play the game
     */
    public SnakesAndLadders(int nPlayers){
      
      this.dice = new Dice();
        NUM_PLAYERS = nPlayers;
        this.players = new int[NUM_PLAYERS];
       
        this.board = new SnLSquare[100]; // makes the board with 100 squares
        for(int i=0;i<this.board.length;i++){
            this.board[i]= new SnLSquare(i+1); 
        }
        // makes the board start from 1 and end at 100
        
        for(int i = 0; i < NUM_PLAYERS; i++){
            this.players[i] = this.board[0].getNumber();
        } 
        // sets the players position to square 1
        
        int[] array1 = {4,9,20,28,40,63,71};
        int[] array2 = {14,31,38,84,59,81,91};
        //array initialized and declared for ladder squares start and end position
        
        int[] array3 = {54,62,64,93,95,99};
        int[] array4 = {34,18,24,73,75,78};
        // arrays initialized and declared for snake square start and end position
        
        for( int i = 0; i < array1.length; i++){
            this.board[array1[i]-1] = new LadderSquare(array1[i],array2[i]);
        }
        // creates ladder squares onto the board
        
        for( int i = 0; i < array3.length; i++){
            this.board[array3[i]-1] = new SnakeSquare(array3[i],array4[i]);
        }
        // creates snake square onto the board
    }
    
    /**
     * A int method to get the player position 
     * @param player the player that is chosen
     * @return the square that the player is on
     */
    public int getPlayerPosition(int player){
        return this.players[player];
    }
    
    /**
     * The taketurn method to is used for players to make there moves. A dice 
     * will roll, it will move the player, check if the player rolled doubles 
     * and if so roll the die again and move the player again
     * @param player the player that is chosen
     * @return true if player rolled doubles and false if not
     */
    public boolean takeTurn(int player){
       
        this.players[player] += dice.roll();

        if(getPlayerPosition(player) > 100){
            this.players[player] = 100 -(getPlayerPosition(player) - 100 + 1);
        }   
        this.players[player] = board[getPlayerPosition(player)-1].landOn();
        return dice.hasDoubles();
    }
    
    /**
     * The isPlayerWinner method used to check if there is a winner by checking
     * player position is on the last square
     * @param player the player that is chosen
     * @return true if winner is found and false if winner is not found
     */
    public boolean isPlayerWinner(int player){
      return this.players[player] == NUM_SQUARES;
    }
    
    /**
     * getWiiner method used to get the player that won the game
     * @return player number if a player is found to be winner otherwise it 
     * returns -1 if no player is found to be a winner
     */
      public int getWinner(){
        for(int i = 0; i < this.players.length; i++){
            if( isPlayerWinner(i) == true){
                return i;
            }
            // checks if each player has reached the last square
        }
        return -1;
    }
    /**
     * toString method used to create the game board in a string representation
     * @return the string representation of the board
     */
    @Override
    public String toString(){
        int count = 1;
        String print = "";
        for(int i = 0; i < NUM_SQUARES; i++){
            print = print + "| " + this.board[i] + " |"; // prints the value of the each square with borders
            if(count == 10){
                print = print + "\n";
                count = 0;
            }
            count++;
        }
        return print;
    }
    
    /**
     * toStringCuurentPositions method used to print player's current position 
     * after there turn
     * @return a string representation of the player's position
     */
   public String toStringCurrentPositions(){
        String positions = "";
        for(int i = 0; i < this.players.length; i++){
            positions = positions + i + ":" + getPlayerPosition(i)+ " ";
        }
        return positions;
    }
    
   /**
    * The main method to run the actual game
    * @param args 
    */
    public static void main (String[] args){
       
            int players = 2; // Number of players set to 2
            SnakesAndLadders game = new SnakesAndLadders(players); 
            // A game is initialized with 2 players 
            
            System.out.print(game.toString()); // prints the game board
            
            int player = 0; // player is set to 0 to represent player 1
            
            while( game.getWinner() == -1){ // while the game has no winner
               
               int currentspot = game.getPlayerPosition(player); // used to hold the player current position
                
               boolean turn = game.takeTurn(player); // used to check if player has taken there turn
               
               System.out.println("Player " + (player) +" rolled a " + (game.dice.getDieValues()[0] + game.dice.getDieValues()[1]));
               if ((game.getPlayerPosition(player)-currentspot) < 0){
                   System.out.println("Oh no!");
               }
               /*
               Tells the user what they rolled and where they landed as well as 
               if they landed on a snake and there position decreased
               */
               System.out.println(game.toStringCurrentPositions()); // prints player position
               
               if (turn == false) {
               player++;
               }
               if (player > players-1){
                   player = 0;
               }
               // alternates throught players
            }
            System.out.println("Player " + game.getWinner() + " Wins"); // prints the player that won
            
            
        }
    }
 
