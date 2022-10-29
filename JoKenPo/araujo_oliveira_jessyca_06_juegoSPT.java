import java.util.Scanner;  // Import the Scanner class, format java.util is a package and Scanner is a class

public class JuegoSPT {
    static void JoKePo() {

        //     /* JoKEPo Game
        //     * This will read user input and decide who wins the game
        //     */

        Scanner scannerInputPlayer1 = new Scanner(System.in); // Create player1 Scanner object
        System.out.println("Player1: [R] for Rock, [P] for Paper and [S] for Scissors"); // Print a message on screen
        String player1 = scannerInputPlayer1.nextLine().toUpperCase();  //  Read player1 input and converts the string to uppercase
        System.out.println("Player1 Choose: " + player1);  // Output user input

        Scanner scannerInputPlayer2 = new Scanner(System.in); // Create player2 Scanner object
        System.out.println("Player2: [R] for Rock, [P] for Paper and [S] for Scissors");  // Print a message on screen
        String player2 = scannerInputPlayer2.nextLine().toUpperCase(); //  Read player1 input and converts the string to uppercase
        System.out.println("Player2, Choose: " + player2);  // Output user input

        String rock = "Rock"; // this var is used to print messages
        String paper = "Paper";  // this var is used to print messages
        String scissors = "Scissors";  // this var is used to print messages

        // /* The possible moves are:
        // * rock loses paper
        // * rock wins scissors
        // * paper loses scissors
        // */

        if ( player1.equals("R") && player2.equals("S") ) {
            System.out.println( rock + " vs " + scissors + ", " + rock + " wins" );
        }

        if ( player1.equals("R") && player2.equals("P") ) {
            System.out.println( rock + " vs " + paper + ", " + paper + " wins" );
        }

        if ( player1.equals("S") && player2.equals("R") ) {
            System.out.println( scissors + " vs " + rock + ", " + rock + " wins" );
        }

        if ( player1.equals("S") && player2.equals("P") ) {
            System.out.println( scissors + " vs " + paper + ", " + scissors + " wins" );
        }

        if ( player1.equals("P") && player2.equals("R") ) {
            System.out.println( paper + " vs " + rock + ", " + paper + " wins" );
        }

        if ( player1.equals("P") && player2.equals("S") ) {
            System.out.println( paper + " vs " + scissors + ", " + scissors + " wins" );
        } 

        else { // ( player1.equals(player2) ) { // .equals is used to check strings. if this conditional is true we have a tie
            
            if ( player1.equals(player2) ) {

                if ( player1.equals("R") ) {
                    String play = "Rock";
                    System.out.println( play + " vs " + play + " , " + "tie" );
                }

                if ( player1.equals("S") ) {
                    String play = "Scissors";
                    System.out.println( play + " vs " + play + " , " + "tie" );
                }

                if ( player1.equals("P") ) {
                    String play = "Paper";
                    System.out.println( play + " vs " + play + " , " + "tie" );
                }

            }

            // System.out.println(play); // ( play + " vs " + play + " , " + "tie");
        }

   }

    public static void main(String[] args) {
        System.out.println("\n==========================\nStart First Game\n==========================\n");
        JoKePo();
        System.out.println("\n==========================\nStart Second Game\n==========================\n");
        JoKePo();
        System.out.println("\n==========================\nStart Third Game\n==========================\n");
        JoKePo();
        System.out.println("\n==========================\nEnd Game\n==========================\n");
    }

}